// default package

import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.ImportingService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
import org.telegram.ui.v;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ex7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ex7(h1a h1aVar, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = (byte) 20;
        this.c = h1aVar;
        this.d = tLObject;
        this.e = tL_inputStorePaymentGiftPremium;
        this.b = tL_error;
        this.f = tL_payments_canPurchaseStore;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:8|9|(1:18)(5:11|12|(1:14)|15|16)|17)|5|6) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        r3 = r11;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        long j;
        long j2;
        int i;
        ad7 ad7Var = (ad7) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        wh9 wh9Var = (wh9) this.f;
        int i2 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = ad7Var.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                int i3 = 0;
                long j3 = 0;
                while (sQLiteCursor.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                arrayList.add(TLdeserialize);
                            }
                            byteBufferValue.reuse();
                            i3 = (int) sQLiteCursor.longValue(1);
                            j3 = sQLiteCursor.longValue(2);
                        }
                    } catch (Exception e) {
                        e = e;
                        boolean z = true;
                        i2 = i3;
                        j = j3;
                        fa4.g(e, z);
                        j2 = j;
                        i = i2;
                        gl.c3(new ue(wh9Var, arrayList, i, j2, arrayList3, arrayList2));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                    if (peer != null) {
                        long n = cf3.n(peer);
                        if (n > 0) {
                            arrayList4.add(Long.valueOf(n));
                        } else if (n < 0) {
                            arrayList5.add(Long.valueOf(-n));
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    ad7Var.P(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    ad7Var.k0(arrayList4, arrayList3, false);
                }
                sQLiteCursor.dispose();
                i = i3;
                j2 = j3;
            } catch (Exception e2) {
                e = e2;
                j = 0;
            }
            gl.c3(new ue(wh9Var, arrayList, i, j2, arrayList3, arrayList2));
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0960  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        long j;
        y28 y28Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        l8b l8bVar;
        int i4;
        o98 o98Var;
        String str;
        wjb wjbVar;
        byte b = 4;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        r15 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        p pVar = null;
        p pVar2 = null;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 0;
        switch (this.a) {
            case 0:
                gx7 gx7Var = (gx7) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                oq7 oq7Var = (oq7) this.d;
                wk4 wk4Var = (wk4) this.e;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.f;
                vx7 vx7Var = gx7Var.a;
                if (tL_error == null) {
                    vx7Var.C1.c(vx7Var.F, (String) vx7Var.t1.get("email"), null, null, null, null, null, null, null, null, oq7Var, wk4Var);
                    break;
                } else {
                    i = ((d) vx7Var).currentAccount;
                    ij.c0(i, tL_error, vx7Var, verifyemail, new Object[0]);
                    wk4Var.a0(null, null);
                    break;
                }
            case 1:
                rx7 rx7Var = (rx7) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.f;
                rx7Var.K = false;
                vx7 vx7Var2 = rx7Var.R;
                if (tL_error2 == null) {
                    vx7Var2.d1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    i2 = ((d) vx7Var2).currentAccount;
                    hd c0 = ij.c0(i2, tL_error2, vx7Var2, tL_auth_resendCode, new Object[0]);
                    if (c0 != null && tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                        c0.n0 = new nx7(rx7Var, b3);
                    }
                }
                vx7Var2.z1();
                break;
            case 2:
                ((p) this.c).m0((TLRPC.TL_error) this.b, (TLObject) this.d, (String) this.e, (TL_account.getPassword) this.f);
                break;
            case 3:
                uf3 uf3Var = (uf3) this.c;
                vf3 vf3Var = (vf3) this.b;
                Long l = (Long) this.d;
                t7b t7bVar = (t7b) this.e;
                Runnable runnable = (Runnable) this.f;
                if (uf3Var == null) {
                    uf3Var = vf3Var.e(l.longValue());
                }
                t7bVar.X(o7b.c(uf3Var));
                runnable.run();
                break;
            case 4:
                y28 y28Var2 = (y28) this.c;
                a5b a5bVar = (a5b) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                w5b w5bVar = (w5b) this.f;
                d28 d28Var = y28Var2.S0;
                f53 f53Var = y28Var2.r0;
                if (a5bVar != null) {
                    a5bVar.run();
                }
                if (tL_error3 == null || "STORY_NOT_MODIFIED".equals(tL_error3.text)) {
                    storyItem.parsedPrivacy = w5bVar;
                    ArrayList arrayList = w5bVar.b;
                    int i5 = w5bVar.a;
                    ArrayList arrayList2 = w5bVar.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                    int i6 = 0;
                    while (i6 < arrayList.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList.get(i6);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i7 = 0;
                                while (i7 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i7 = mue.c(i7, 1, tL_inputPrivacyValueDisallowUsers.users.get(i7).user_id, tL_privacyValueDisallowUsers.users);
                                    i6 = i6;
                                }
                                i3 = i6;
                                arrayList3.add(tL_privacyValueDisallowUsers);
                            } else {
                                i3 = i6;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i8 = 0; i8 < tL_inputPrivacyValueAllowUsers.users.size(); i8 = mue.c(i8, 1, tL_inputPrivacyValueAllowUsers.users.get(i8).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    arrayList3.add(tL_privacyValueAllowUsers);
                                }
                            }
                            i6 = i3 + 1;
                        }
                        i3 = i6;
                        i6 = i3 + 1;
                    }
                    storyItem.privacy = arrayList3;
                    storyItem.close_friends = i5 == 1;
                    storyItem.contacts = i5 == 2;
                    storyItem.selected_contacts = i5 == 3;
                    na7.q1(y28Var2.s2).M1().s0(storyItem.dialogId, storyItem, true);
                    y28Var2.R3 = true;
                    if (i5 == 4) {
                        new u21(d28Var, f53Var).Q(R.raw.contact_check, 36, k96.N0("StorySharedToEveryone")).j();
                    } else if (i5 == 1) {
                        new u21(d28Var, f53Var).Q(R.raw.contact_check, 36, k96.N0("StorySharedToCloseFriends")).j();
                    } else if (i5 == 2) {
                        if (arrayList2.isEmpty()) {
                            new u21(d28Var, f53Var).Q(R.raw.contact_check, 36, k96.N0("StorySharedToAllContacts")).j();
                        } else {
                            new u21(d28Var, f53Var).Q(R.raw.contact_check, 36, k96.G(arrayList2.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i5 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList2);
                        Iterator it = w5bVar.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z = false;
                        new u21(d28Var, f53Var).Q(R.raw.contact_check, 36, k96.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                    }
                    z = false;
                } else {
                    ir2.v(null, 2131743640, new u21(d28Var, f53Var), R.raw.error, 36);
                    z = false;
                }
                y28Var2.c1(z);
                break;
            case 5:
                s28 s28Var = (s28) this.c;
                Activity activity = (Activity) this.b;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                m8b m8bVar = (m8b) this.e;
                w28 w28Var = (w28) this.f;
                t7b C = t7b.C(activity, s28Var.x.s2);
                c30 c30Var = s28Var.x.C2;
                long j2 = (c30Var == null || (l8bVar = (l8b) c30Var.c) == null) ? 0L : l8bVar.currentPosition;
                f4b n = f4b.n(s28Var.x.E1.f(), s28Var.x.E1.a);
                y28 y28Var3 = s28Var.x;
                n.e = y28Var3.r1;
                TL_stories.StoryItem storyItem3 = y28Var3.E1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < document.attributes.size()) {
                            if (document.attributes.get(i9) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i9);
                            } else {
                                i9++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n.e0 = j;
                        f4b g = n.g();
                        g.b0 = true;
                        y28Var = s28Var.x;
                        TL_stories.StoryItem storyItem4 = y28Var.E1.a;
                        g.c0 = storyItem4.media.document;
                        g.d0 = new f28(s28Var, storyItem4, storyItem2, b3);
                        if (y28Var.A0()) {
                            y28 y28Var4 = s28Var.x;
                            g.J0 = y28Var4.r1;
                            g.L0 = na7.f5(y28Var4.E1.a.media);
                            y1b y1bVar = m8bVar.O0;
                            if (y1bVar instanceof s1b) {
                                g.K0 = ((s1b) y1bVar).E;
                            }
                        }
                        C.R(o7b.d(m8bVar), g, j2);
                        C.R = new m28(s28Var, b2);
                        C.S = new o28(s28Var, w28Var, b4);
                        break;
                    }
                }
                j = 0;
                n.e0 = j;
                f4b g2 = n.g();
                g2.b0 = true;
                y28Var = s28Var.x;
                TL_stories.StoryItem storyItem42 = y28Var.E1.a;
                g2.c0 = storyItem42.media.document;
                g2.d0 = new f28(s28Var, storyItem42, storyItem2, b3);
                if (y28Var.A0()) {
                }
                C.R(o7b.d(m8bVar), g2, j2);
                C.R = new m28(s28Var, b2);
                C.S = new o28(s28Var, w28Var, b4);
                break;
            case 6:
                v vVar = (v) this.c;
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                Integer num = (Integer) this.e;
                o98 o98Var2 = (o98) this.f;
                PhotoViewer photoViewer = vVar.r;
                photoViewer.o4 = null;
                k98 k98Var = photoViewer.f0;
                if (k98Var != null && photoViewer.h0 != null) {
                    k98Var.setLayerType(0, null);
                    photoViewer.m4 = (byte) 0;
                    photoViewer.H0();
                    photoViewer.n4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.a = false;
                    photoViewer.M1();
                    photoViewer.I1();
                    photoViewer.f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    p98 p98Var = photoViewer.p4;
                    if (p98Var != null) {
                        p98Var.a.v0(true, true);
                    }
                    p98 p98Var2 = photoViewer.q4;
                    if (p98Var2 != null && !p98Var2.s) {
                        p98Var2.a.v0(false, true);
                    }
                    if (arrayList4 != null && (i4 = photoViewer.d2) != 3 && i4 != 1 && ((o98Var = photoViewer.d) == null || !o98Var.P())) {
                        photoViewer.W0();
                    }
                    lbc lbcVar = photoViewer.G2;
                    if (lbcVar != null && lbcVar.c0() && photoViewer.s1 && !photoViewer.f7.isEmpty()) {
                        photoViewer.B1(photoViewer.G2.S());
                        photoViewer.q1(true);
                    }
                    if (photoViewer.s4) {
                        photoViewer.G0(num.intValue());
                    }
                    if (o98Var2 != null) {
                        o98Var2.e();
                        break;
                    }
                }
                break;
            case 7:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                boolean[] zArr = (boolean[]) this.d;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) this.e;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) this.f;
                if (tL_error4 != null) {
                    privacyControlActivity.K0();
                    break;
                } else {
                    zArr[1] = true;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i10 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i10;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i10 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
                        } else {
                            globalPrivacySettings.flags = i10 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.A0();
                    }
                    privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                    break;
                }
            case 8:
                yj8 yj8Var = (yj8) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                PrivacyControlActivity privacyControlActivity2 = yj8Var.d;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    m21 Q = u21.b0(privacyControlActivity2).Q(R.raw.contact_check, 36, k96.M0(2131746665, null));
                    Q.j = 5000;
                    Q.j();
                    break;
                } else {
                    if (userFull != null) {
                        int i11 = userFull.flags2;
                        if (tL_birthday == null) {
                            userFull.flags2 = i11 & (-33);
                        } else {
                            userFull.flags2 = i11 | 32;
                        }
                        userFull.birthday = tL_birthday;
                        privacyControlActivity2.getMessagesStorage().g2(userFull, false);
                    }
                    if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            wjbVar = ((d) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, parentActivity);
                            alertDialog$Builder.a.S = k96.M0(2131746661, null);
                            alertDialog$Builder.a.U = k96.M0(2131746662, null);
                            alertDialog$Builder.j(k96.M0(2131747638, null), null);
                            privacyControlActivity2.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    } else {
                        ir2.v(null, 2131743640, u21.b0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                rl8 rl8Var = (rl8) this.f;
                RectF rectF = ProfileActivity.Z6;
                if (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    rl8Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    alertDialog$Builder2.a.S = k96.M0(R.string.AppName, null);
                    alertDialog$Builder2.a.U = k96.a0(null, null, 2131754347, qu2.m(0, user.first_name, user.last_name));
                    alertDialog$Builder2.j(k96.M0(2131747638, null), new k88(rl8Var, (byte) 10));
                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                    profileActivity.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
                in8 in8Var = (in8) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                RectF rectF2 = ProfileActivity.Z6;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject3;
                    if (profileActivity2.e1 != 0) {
                        profileActivity2.getMessagesController().V1(Long.valueOf(profileActivity2.e1));
                    } else {
                        profileActivity2.getMessagesController().K0(Long.valueOf(profileActivity2.f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = k96.D0().n0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String e = ci0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String e2 = ci0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    m21 w = new u21(in8Var.w1, profileActivity2.A0).w(R.drawable.filled_username, gl.X3(gl.S2(k96.a0(null, null, 2131750503, str2, format, e, TextUtils.isEmpty(e2) ? "" : tb4.y("(", e2, ")"))), new ll8(profileActivity2, tL_collectibleInfo, b)));
                    v16 v16Var = new v16(profileActivity2, tL_collectibleInfo, (byte) 23);
                    q11 q11Var = w.e;
                    if (q11Var != null) {
                        q11Var.setOnClickListener(v16Var);
                    }
                    w.k(false);
                    break;
                } else {
                    u21.e0(tL_error6);
                    break;
                }
            case 11:
                ProfileActivity profileActivity3 = (ProfileActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                String str3 = (String) this.e;
                TLRPC.User user2 = (TLRPC.User) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                RectF rectF3 = ProfileActivity.Z6;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    xo4.a(profileActivity3.getParentActivity(), 1, str3, user2, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.A0);
                    break;
                } else {
                    u21.e0(tL_error7);
                    break;
                }
            case 12:
                ProfileActivity profileActivity4 = (ProfileActivity) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity4.C2(tLObject5, userFull2, tL_birthday2, tL_error8);
                break;
            case 13:
                to8 to8Var = (to8) this.c;
                String str4 = (String) this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                d dVar = to8Var.e;
                if (str4.equals(to8Var.E)) {
                    if (!to8Var.x && (dVar instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) dVar).P.b.getImageReceiver().w0(false);
                            ((ProfileActivity) dVar).P.d.setText(k96.M0(2131745284, null));
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                    }
                    to8Var.x = true;
                    to8Var.r = arrayList5;
                    to8Var.s = arrayList6;
                    to8Var.n = arrayList7;
                    to8Var.f();
                    if (dVar instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) dVar).P.b.getImageReceiver().w0(false);
                            break;
                        } catch (Exception e4) {
                            fa4.g(e4, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                ox8 ox8Var = (ox8) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                nx8 nx8Var = (nx8) this.e;
                k27 k27Var = (k27) this.f;
                int i12 = ox8Var.a;
                na7.q1(i12).b4(arrayList8, true);
                na7.q1(i12).V3(arrayList9, true);
                nx8Var.e = k27Var;
                if (k27Var != null) {
                    k27Var.l(nx8Var.a, nx8Var.b);
                }
                ox8Var.l();
                kk7.f(i12).k(kk7.E1, new Object[0]);
                break;
            case 15:
                ox8 ox8Var2 = (ox8) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                ArrayList<Integer> arrayList10 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                if (tLObject6 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList11 = ((TLRPC.TL_messages_messages) tLObject6).messages;
                    arrayList10.clear();
                    int size = arrayList11.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Message message = arrayList11.get(i13);
                        i13++;
                        arrayList10.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList10;
                    while (b4 < arrayList10.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                        b4++;
                    }
                    ConnectionsManager.getInstance(ox8Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    fa4.d("received " + tLObject6 + " " + tL_error9 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 16:
                ox8 ox8Var3 = (ox8) this.c;
                ArrayList arrayList12 = (ArrayList) this.b;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = (ArrayList) this.e;
                Runnable runnable2 = (Runnable) this.f;
                ox8Var3.e = false;
                int i14 = ox8Var3.a;
                na7.q1(i14).b4(arrayList12, true);
                na7.q1(i14).V3(arrayList13, true);
                ArrayList arrayList15 = ox8Var3.b;
                arrayList15.clear();
                arrayList15.addAll(arrayList14);
                if (runnable2 != null) {
                    runnable2.run();
                } else {
                    ox8Var3.i(null, false);
                }
                kk7.f(i14).k(kk7.E1, new Object[0]);
                break;
            case 17:
                ((tx9) this.c).o((View) this.b, Long.valueOf(((gm) this.d).documentId), (TLRPC.Document) this.e, ((dx9) this.f).w, null);
                break;
            case 18:
                iy9 iy9Var = (iy9) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user3 = (TLRPC.User) this.f;
                if (tL_error10 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    iy9Var.Y0(user3, twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                rz9 rz9Var = (rz9) this.c;
                TLRPC.User user4 = (TLRPC.User) this.b;
                String str5 = (String) this.d;
                qz8 qz8Var = (qz8) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList16 = new ArrayList();
                arrayList16.add(user4);
                g0a g0aVar = rz9Var.b;
                qu2.r(g0aVar.w).i(arrayList16, false);
                new u21(g0aVar, g0aVar.s).Q(R.raw.ic_ban, 36, k96.a0(null, null, 2131751454, str5)).j();
                qz8Var.a(true, g0aVar.b(storyView) ? 1.0f : 0.5f);
                break;
            case 20:
                h1a h1aVar = (h1a) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.e;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i15 = h1aVar.T1;
                d dVar2 = h1aVar.r1;
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    ci0 h = ci0.h();
                    Activity parentActivity2 = dVar2.getParentActivity();
                    j5 a = j5.a(i15);
                    lv6 lv6Var = new lv6((byte) 7, false);
                    lv6Var.L(h1aVar.Z1.h);
                    h.k(parentActivity2, a, tL_inputStorePaymentGiftPremium, Collections.singletonList(lv6Var.d()));
                    break;
                } else if (tL_error11 != null) {
                    ij.c0(i15, tL_error11, dVar2, tL_payments_canPurchaseStore, new Object[0]);
                    break;
                }
                break;
            case 21:
                z3a z3aVar = (z3a) this.c;
                u3a u3aVar = (u3a) this.b;
                HashMap hashMap = (HashMap) this.d;
                String str6 = (String) this.e;
                g0b g0bVar = (g0b) this.f;
                if (((s3a) u3aVar.d.get(0)).f != null) {
                    u3aVar.b();
                } else {
                    z3aVar.F.putAll(hashMap);
                    z3aVar.G.put(str6, u3aVar);
                    z3a z3aVar2 = u3aVar.o;
                    z3aVar2.getNotificationCenter().k(kk7.v1, u3aVar.e);
                    u3aVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList17 = u3aVar.d;
                    int size2 = arrayList17.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        z3aVar2.getFileLoader().h0(false, 67108864, ((s3a) arrayList17.get(i16)).a, true);
                    }
                    z3aVar.getNotificationCenter().k(kk7.u1, str6);
                    g0bVar.a(str6);
                }
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) ImportingService.class));
                    break;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 22:
                z3a z3aVar3 = (z3a) this.c;
                k3a k3aVar = (k3a) this.b;
                File file = (File) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                k27 k27Var2 = (k27) this.f;
                k3aVar.l = null;
                k3aVar.m.k.attachPath = file.toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        k3aVar.g = photoSize;
                        k3aVar.h = document2;
                    }
                }
                ArrayList arrayList18 = new ArrayList();
                arrayList18.add(k27Var2.k);
                z3aVar3.getMessagesStorage().g1(arrayList18, false, true, false, 0, false, k27Var2.r1 ? 1 : 0, 0L);
                k3aVar.p = true;
                z3aVar3.L(k3aVar, -1);
                z3aVar3.getNotificationCenter().k(48, k3aVar.m.k);
                break;
            case 23:
                z3a z3aVar4 = (z3a) this.c;
                File file2 = (File) this.b;
                gl.c3(new e57(z3aVar4, z3aVar4.z(file2.toString(), null, false), (k27) this.d, file2, (k3a) this.e, (String) this.f));
                break;
            case 24:
                gta gtaVar = (gta) this.c;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.b;
                et4 et4Var = (et4) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error12 != null) {
                    et4Var.a(Boolean.FALSE, tL_error12.text);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        na7.q1(gtaVar.a).b4(paymentForm.users, false);
                        pVar2 = new p(paymentForm, tL_inputInvoiceStars, null);
                    } else if (tLObject9 instanceof TLRPC.PaymentReceipt) {
                        pVar2 = new p((TLRPC.PaymentReceipt) tLObject9);
                    }
                    if (pVar2 != null) {
                        pVar2.a1 = new wh9(et4Var, (byte) 26);
                        d Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            if (gl.s1(Q2)) {
                                ag0 ag0Var = new ag0();
                                ag0Var.a = true;
                                Q2.showAsSheet(pVar2, ag0Var);
                                break;
                            } else {
                                Q2.presentFragment(pVar2);
                                break;
                            }
                        }
                    } else {
                        et4Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
            case 25:
                gta gtaVar2 = (gta) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
                String str7 = (String) this.d;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.e;
                i8c i8cVar = (i8c) this.f;
                zArr2[0] = true;
                gtaVar2.Y(str7, chatInvite, new f05(i8cVar, (byte) 1));
                break;
            case 26:
                a();
                break;
            case 27:
                gta gtaVar3 = (gta) this.c;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) this.b;
                i8c i8cVar2 = (i8c) this.d;
                TLObject tLObject10 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error13 != null) {
                    i8cVar2.a(Boolean.FALSE, tL_error13.text);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        na7.q1(gtaVar3.a).b4(paymentForm2.users, false);
                        pVar = new p(paymentForm2, tL_inputInvoiceStars2, null);
                    } else if (tLObject10 instanceof TLRPC.PaymentReceipt) {
                        pVar = new p((TLRPC.PaymentReceipt) tLObject10);
                    }
                    if (pVar != null) {
                        pVar.a1 = new wh9(i8cVar2, (byte) 24);
                        d Q3 = LaunchActivity.Q();
                        if (Q3 != null) {
                            if (gl.s1(Q3)) {
                                ag0 ag0Var2 = new ag0();
                                ag0Var2.a = true;
                                Q3.showAsSheet(pVar, ag0Var2);
                                break;
                            } else {
                                Q3.presentFragment(pVar);
                                break;
                            }
                        }
                    } else {
                        i8cVar2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
            case 28:
                List list = (List) this.c;
                i8c i8cVar3 = (i8c) this.b;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.d;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.e;
                Activity activity2 = (Activity) this.f;
                if (list.isEmpty()) {
                    fa4.b("StarsController.buy queryProductDetails done: no products");
                    gl.c3(new c05(i8cVar3, (byte) 4));
                    break;
                } else {
                    kl8 kl8Var = (kl8) list.get(0);
                    gl8 a2 = kl8Var.a();
                    if (a2 == null) {
                        fa4.b("StarsController.buy queryProductDetails done: no details");
                        gl.c3(new c05(i8cVar3, (byte) 5));
                        break;
                    } else {
                        tL_inputStorePaymentStarsTopup.currency = a2.c;
                        tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption.currency)) * (a2.b / 1000000.0d));
                        ci0.h().c(kl8Var.c, new gw(i8cVar3, (byte) 17));
                        ci0.h().h = new c05(i8cVar3, (byte) 6);
                        fa4.b("StarsController.buy launchBillingFlow");
                        ci0 h2 = ci0.h();
                        j5 a3 = j5.a(y6c.t0);
                        lv6 lv6Var2 = new lv6((byte) 7, false);
                        lv6Var2.L((kl8) list.get(0));
                        h2.k(activity2, a3, tL_inputStorePaymentStarsTopup, Collections.singletonList(lv6Var2.d()));
                        break;
                    }
                }
            default:
                gta gtaVar4 = (gta) this.c;
                hd hdVar = (hd) this.b;
                TLObject tLObject11 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                p8c p8cVar = (p8c) this.f;
                int i17 = gtaVar4.a;
                hdVar.dismiss();
                if (tLObject11 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject11;
                    na7.q1(i17).b4(tL_payments_savedStarGifts.users, false);
                    na7.q1(i17).V3(tL_payments_savedStarGifts.chats, false);
                    for (int i18 = 0; i18 < tL_payments_savedStarGifts.gifts.size(); i18++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i18);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                p8cVar.a(savedStarGift);
                break;
        }
    }

    public /* synthetic */ ex7(y28 y28Var, a5b a5bVar, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, w5b w5bVar) {
        this.a = (byte) 4;
        this.c = y28Var;
        this.d = a5bVar;
        this.b = tL_error;
        this.e = storyItem;
        this.f = w5bVar;
    }

    public /* synthetic */ ex7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ex7(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.b = tL_error;
    }
}
