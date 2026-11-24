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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hz7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hz7(j3a j3aVar, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = (byte) 20;
        this.c = j3aVar;
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
        cf7 cf7Var = (cf7) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        yf9 yf9Var = (yf9) this.f;
        int i2 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = cf7Var.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
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
                        fc4.g(e, z);
                        j2 = j;
                        i = i2;
                        gm.c3(new vf(yf9Var, arrayList, i, j2, arrayList3, arrayList2));
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
                        long n = pg3.n(peer);
                        if (n > 0) {
                            arrayList4.add(Long.valueOf(n));
                        } else if (n < 0) {
                            arrayList5.add(Long.valueOf(-n));
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    cf7Var.P(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    cf7Var.k0(arrayList4, arrayList3, false);
                }
                sQLiteCursor.dispose();
                i = i3;
                j2 = j3;
            } catch (Exception e2) {
                e = e2;
                j = 0;
            }
            gm.c3(new vf(yf9Var, arrayList, i, j2, arrayList3, arrayList2));
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:315:0x096b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        boolean z;
        g48 g48Var;
        r63 r63Var;
        long j;
        a58 a58Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        nab nabVar;
        int i3;
        pb8 pb8Var;
        String str;
        ylb ylbVar;
        byte b = 6;
        byte b2 = 4;
        byte b3 = 2;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        r11 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        p pVar = null;
        p pVar2 = null;
        byte b4 = 1;
        byte b5 = 0;
        switch (this.a) {
            case 0:
                iz7 iz7Var = (iz7) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                kl7 kl7Var = (kl7) this.d;
                wm4 wm4Var = (wm4) this.e;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.f;
                xz7 xz7Var = iz7Var.a;
                if (tL_error == null) {
                    xz7Var.C1.c(xz7Var.F, (String) xz7Var.t1.get("email"), null, null, null, null, null, null, null, null, kl7Var, wm4Var);
                    break;
                } else {
                    i = ((d) xz7Var).currentAccount;
                    ik.c0(i, tL_error, xz7Var, verifyemail, new Object[0]);
                    wm4Var.b0(null, null);
                    break;
                }
            case 1:
                tz7 tz7Var = (tz7) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.f;
                tz7Var.K = false;
                xz7 xz7Var2 = tz7Var.R;
                if (tL_error2 == null) {
                    xz7Var2.e1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    i2 = ((d) xz7Var2).currentAccount;
                    he c0 = ik.c0(i2, tL_error2, xz7Var2, tL_auth_resendCode, new Object[0]);
                    if (c0 != null && tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                        c0.n0 = new pz7(tz7Var, b4);
                    }
                }
                xz7Var2.A1();
                break;
            case 2:
                ((p) this.c).n0((TLRPC.TL_error) this.b, (TLObject) this.d, (String) this.e, (TL_account.getPassword) this.f);
                break;
            case 3:
                hh3 hh3Var = (hh3) this.c;
                ih3 ih3Var = (ih3) this.b;
                Long l = (Long) this.d;
                v9b v9bVar = (v9b) this.e;
                Runnable runnable = (Runnable) this.f;
                if (hh3Var == null) {
                    hh3Var = ih3Var.e(l.longValue());
                }
                v9bVar.X(q9b.c(hh3Var));
                runnable.run();
                break;
            case 4:
                a58 a58Var2 = (a58) this.c;
                b7b b7bVar = (b7b) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                y7b y7bVar = (y7b) this.f;
                g48 g48Var2 = a58Var2.S0;
                r63 r63Var2 = a58Var2.r0;
                if (b7bVar != null) {
                    b7bVar.run();
                }
                if (tL_error3 == null || "STORY_NOT_MODIFIED".equals(tL_error3.text)) {
                    storyItem.parsedPrivacy = y7bVar;
                    ArrayList arrayList = y7bVar.b;
                    int i4 = y7bVar.a;
                    ArrayList arrayList2 = y7bVar.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList.get(i5);
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
                                int i6 = 0;
                                while (i6 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i6 = mle.c(i6, 1, tL_inputPrivacyValueDisallowUsers.users.get(i6).user_id, tL_privacyValueDisallowUsers.users);
                                    g48Var2 = g48Var2;
                                    r63Var2 = r63Var2;
                                }
                                g48Var = g48Var2;
                                r63Var = r63Var2;
                                arrayList3.add(tL_privacyValueDisallowUsers);
                            } else {
                                g48Var = g48Var2;
                                r63Var = r63Var2;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i7 = 0; i7 < tL_inputPrivacyValueAllowUsers.users.size(); i7 = mle.c(i7, 1, tL_inputPrivacyValueAllowUsers.users.get(i7).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    arrayList3.add(tL_privacyValueAllowUsers);
                                }
                            }
                            i5++;
                            g48Var2 = g48Var;
                            r63Var2 = r63Var;
                        }
                        g48Var = g48Var2;
                        r63Var = r63Var2;
                        i5++;
                        g48Var2 = g48Var;
                        r63Var2 = r63Var;
                    }
                    g48 g48Var3 = g48Var2;
                    r63 r63Var3 = r63Var2;
                    storyItem.privacy = arrayList3;
                    storyItem.close_friends = i4 == 1;
                    storyItem.contacts = i4 == 2;
                    storyItem.selected_contacts = i4 == 3;
                    oc7.r1(a58Var2.s2).N1().s0(storyItem.dialogId, storyItem, true);
                    a58Var2.R3 = true;
                    if (i4 == 4) {
                        new c41(g48Var3, r63Var3).Q(R.raw.contact_check, 36, jb6.N0("StorySharedToEveryone")).j();
                    } else if (i4 == 1) {
                        new c41(g48Var3, r63Var3).Q(R.raw.contact_check, 36, jb6.N0("StorySharedToCloseFriends")).j();
                    } else if (i4 == 2) {
                        if (arrayList2.isEmpty()) {
                            new c41(g48Var3, r63Var3).Q(R.raw.contact_check, 36, jb6.N0("StorySharedToAllContacts")).j();
                        } else {
                            new c41(g48Var3, r63Var3).Q(R.raw.contact_check, 36, jb6.G(arrayList2.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i4 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList2);
                        Iterator it = y7bVar.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        c41 c41Var = new c41(g48Var3, r63Var3);
                        int size = hashSet.size();
                        z = false;
                        c41Var.Q(R.raw.contact_check, 36, jb6.G(size, "StorySharedToContacts", new Object[0])).j();
                    }
                    z = false;
                } else {
                    ts2.u(null, 2131743566, new c41(g48Var2, r63Var2), R.raw.error, 36);
                    z = false;
                }
                a58Var2.c1(z);
                break;
            case 5:
                v48 v48Var = (v48) this.c;
                Activity activity = (Activity) this.b;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                oab oabVar = (oab) this.e;
                y48 y48Var = (y48) this.f;
                v9b C = v9b.C(activity, v48Var.x.s2);
                c40 c40Var = v48Var.x.C2;
                long j2 = (c40Var == null || (nabVar = (nab) c40Var.c) == null) ? 0L : nabVar.currentPosition;
                g6b n = g6b.n(v48Var.x.E1.f(), v48Var.x.E1.a);
                a58 a58Var3 = v48Var.x;
                n.e = a58Var3.r1;
                TL_stories.StoryItem storyItem3 = a58Var3.E1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i8 = 0;
                    while (true) {
                        if (i8 < document.attributes.size()) {
                            if (document.attributes.get(i8) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i8);
                            } else {
                                i8++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n.e0 = j;
                        g6b g = n.g();
                        g.b0 = true;
                        a58Var = v48Var.x;
                        TL_stories.StoryItem storyItem4 = a58Var.E1.a;
                        g.c0 = storyItem4.media.document;
                        g.d0 = new i48(v48Var, storyItem4, storyItem2, b4);
                        if (a58Var.A0()) {
                            a58 a58Var4 = v48Var.x;
                            g.J0 = a58Var4.r1;
                            g.L0 = oc7.h5(a58Var4.E1.a.media);
                            z3b z3bVar = oabVar.O0;
                            if (z3bVar instanceof t3b) {
                                g.K0 = ((t3b) z3bVar).E;
                            }
                        }
                        C.R(q9b.d(oabVar), g, j2);
                        C.R = new p48(v48Var, b3);
                        C.S = new r48(v48Var, y48Var, b5);
                        break;
                    }
                }
                j = 0;
                n.e0 = j;
                g6b g2 = n.g();
                g2.b0 = true;
                a58Var = v48Var.x;
                TL_stories.StoryItem storyItem42 = a58Var.E1.a;
                g2.c0 = storyItem42.media.document;
                g2.d0 = new i48(v48Var, storyItem42, storyItem2, b4);
                if (a58Var.A0()) {
                }
                C.R(q9b.d(oabVar), g2, j2);
                C.R = new p48(v48Var, b3);
                C.S = new r48(v48Var, y48Var, b5);
                break;
            case 6:
                v vVar = (v) this.c;
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                Integer num = (Integer) this.e;
                pb8 pb8Var2 = (pb8) this.f;
                PhotoViewer photoViewer = vVar.r;
                photoViewer.o4 = null;
                lb8 lb8Var = photoViewer.f0;
                if (lb8Var != null && photoViewer.h0 != null) {
                    lb8Var.setLayerType(0, null);
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
                    qb8 qb8Var = photoViewer.p4;
                    if (qb8Var != null) {
                        qb8Var.a.v0(true, true);
                    }
                    qb8 qb8Var2 = photoViewer.q4;
                    if (qb8Var2 != null && !qb8Var2.s) {
                        qb8Var2.a.v0(false, true);
                    }
                    if (arrayList4 != null && (i3 = photoViewer.d2) != 3 && i3 != 1 && ((pb8Var = photoViewer.d) == null || !pb8Var.Q())) {
                        photoViewer.W0();
                    }
                    ndc ndcVar = photoViewer.G2;
                    if (ndcVar != null && ndcVar.c0() && photoViewer.s1 && !photoViewer.f7.isEmpty()) {
                        photoViewer.B1(photoViewer.G2.S());
                        photoViewer.q1(true);
                    }
                    if (photoViewer.s4) {
                        photoViewer.G0(num.intValue());
                    }
                    if (pb8Var2 != null) {
                        pb8Var2.e();
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
                    privacyControlActivity.L0();
                    break;
                } else {
                    zArr[1] = true;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i9 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i9;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i9 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
                        } else {
                            globalPrivacySettings.flags = i9 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.B0();
                    }
                    privacyControlActivity.getNotificationCenter().k(48, new Object[0]);
                    break;
                }
            case 8:
                bm8 bm8Var = (bm8) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                PrivacyControlActivity privacyControlActivity2 = bm8Var.d;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    u31 Q = c41.b0(privacyControlActivity2).Q(R.raw.contact_check, 36, jb6.M0(2131746591, null));
                    Q.j = 5000;
                    Q.j();
                    break;
                } else {
                    if (userFull != null) {
                        int i10 = userFull.flags2;
                        if (tL_birthday == null) {
                            userFull.flags2 = i10 & (-33);
                        } else {
                            userFull.flags2 = i10 | 32;
                        }
                        userFull.birthday = tL_birthday;
                        privacyControlActivity2.getMessagesStorage().g2(userFull, false);
                    }
                    if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            ylbVar = ((d) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, parentActivity);
                            alertDialog$Builder.a.S = jb6.M0(2131746587, null);
                            alertDialog$Builder.a.U = jb6.M0(2131746588, null);
                            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                            privacyControlActivity2.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    } else {
                        ts2.u(null, 2131743566, c41.b0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                un8 un8Var = (un8) this.f;
                RectF rectF = ProfileActivity.e7;
                if (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    un8Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    alertDialog$Builder2.a.S = jb6.M0(R.string.AppName, null);
                    alertDialog$Builder2.a.U = jb6.a0(null, null, 2131754347, bw2.m(0, user.first_name, user.last_name));
                    alertDialog$Builder2.j(jb6.M0(2131747564, null), new h68(un8Var, (byte) 14));
                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                    profileActivity.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
                jp8 jp8Var = (jp8) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                RectF rectF2 = ProfileActivity.e7;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject3;
                    if (profileActivity2.e1 != 0) {
                        profileActivity2.getMessagesController().W1(Long.valueOf(profileActivity2.e1));
                    } else {
                        profileActivity2.getMessagesController().L0(Long.valueOf(profileActivity2.f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = jb6.D0().n0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String e = cj0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String e2 = cj0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    u31 w = new c41(jp8Var.w1, profileActivity2.A0).w(R.drawable.filled_username, gm.X3(gm.S2(jb6.a0(null, null, 2131750452, str2, format, e, TextUtils.isEmpty(e2) ? "" : kt6.o("(", e2, ")"))), new mn8(profileActivity2, tL_collectibleInfo, b)));
                    n06 n06Var = new n06(profileActivity2, tL_collectibleInfo, (byte) 24);
                    y21 y21Var = w.e;
                    if (y21Var != null) {
                        y21Var.setOnClickListener(n06Var);
                    }
                    w.k(false);
                    break;
                } else {
                    c41.e0(tL_error6);
                    break;
                }
            case 11:
                ProfileActivity profileActivity3 = (ProfileActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                String str3 = (String) this.e;
                TLRPC.User user2 = (TLRPC.User) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                RectF rectF3 = ProfileActivity.e7;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    yq4.a(profileActivity3.getParentActivity(), 1, str3, user2, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.A0);
                    break;
                } else {
                    c41.e0(tL_error7);
                    break;
                }
            case 12:
                ProfileActivity profileActivity4 = (ProfileActivity) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                RectF rectF4 = ProfileActivity.e7;
                profileActivity4.F2(tLObject5, userFull2, tL_birthday2, tL_error8);
                break;
            case 13:
                uq8 uq8Var = (uq8) this.c;
                String str4 = (String) this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                d dVar = uq8Var.e;
                if (str4.equals(uq8Var.E)) {
                    if (!uq8Var.x && (dVar instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) dVar).P.b.getImageReceiver().w0(false);
                            ((ProfileActivity) dVar).P.d.setText(jb6.M0(2131745210, null));
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                        }
                    }
                    uq8Var.x = true;
                    uq8Var.r = arrayList5;
                    uq8Var.s = arrayList6;
                    uq8Var.n = arrayList7;
                    uq8Var.f();
                    if (dVar instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) dVar).P.b.getImageReceiver().w0(false);
                            break;
                        } catch (Exception e4) {
                            fc4.g(e4, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                pz8 pz8Var = (pz8) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                oz8 oz8Var = (oz8) this.e;
                k47 k47Var = (k47) this.f;
                int i11 = pz8Var.a;
                oc7.r1(i11).d4(arrayList8, true);
                oc7.r1(i11).X3(arrayList9, true);
                oz8Var.e = k47Var;
                if (k47Var != null) {
                    k47Var.l(oz8Var.a, oz8Var.b);
                }
                pz8Var.l();
                nm7.f(i11).k(nm7.F1, new Object[0]);
                break;
            case 15:
                pz8 pz8Var2 = (pz8) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                ArrayList<Integer> arrayList10 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                if (tLObject6 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList11 = ((TLRPC.TL_messages_messages) tLObject6).messages;
                    arrayList10.clear();
                    int size2 = arrayList11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        TLRPC.Message message = arrayList11.get(i12);
                        i12++;
                        arrayList10.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList10;
                    while (b5 < arrayList10.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                        b5++;
                    }
                    ConnectionsManager.getInstance(pz8Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    fc4.d("received " + tLObject6 + " " + tL_error9 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 16:
                pz8 pz8Var3 = (pz8) this.c;
                ArrayList arrayList12 = (ArrayList) this.b;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = (ArrayList) this.e;
                Runnable runnable2 = (Runnable) this.f;
                pz8Var3.e = false;
                int i13 = pz8Var3.a;
                oc7.r1(i13).d4(arrayList12, true);
                oc7.r1(i13).X3(arrayList13, true);
                ArrayList arrayList15 = pz8Var3.b;
                arrayList15.clear();
                arrayList15.addAll(arrayList14);
                if (runnable2 != null) {
                    runnable2.run();
                } else {
                    pz8Var3.i(null, false);
                }
                nm7.f(i13).k(nm7.F1, new Object[0]);
                break;
            case 17:
                ((vz9) this.c).o((View) this.b, Long.valueOf(((gn) this.d).documentId), (TLRPC.Document) this.e, ((fz9) this.f).w, null);
                break;
            case 18:
                k0a k0aVar = (k0a) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user3 = (TLRPC.User) this.f;
                if (tL_error10 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    k0aVar.Y0(user3, twoStepVerificationActivity.e0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                t1a t1aVar = (t1a) this.c;
                TLRPC.User user4 = (TLRPC.User) this.b;
                String str5 = (String) this.d;
                r19 r19Var = (r19) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList16 = new ArrayList();
                arrayList16.add(user4);
                i2a i2aVar = t1aVar.b;
                bw2.r(i2aVar.w).i(arrayList16, false);
                new c41(i2aVar, i2aVar.s).Q(R.raw.ic_ban, 36, jb6.a0(null, null, 2131751403, str5)).j();
                r19Var.a(true, i2aVar.b(storyView) ? 1.0f : 0.5f);
                break;
            case 20:
                j3a j3aVar = (j3a) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.e;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i14 = j3aVar.T1;
                d dVar2 = j3aVar.r1;
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    cj0 h = cj0.h();
                    Activity parentActivity2 = dVar2.getParentActivity();
                    j5 a = j5.a(i14);
                    hi2 hi2Var = new hi2((byte) 9, false);
                    hi2Var.T(j3aVar.Z1.h);
                    h.k(parentActivity2, a, tL_inputStorePaymentGiftPremium, Collections.singletonList(hi2Var.c()));
                    break;
                } else if (tL_error11 != null) {
                    ik.c0(i14, tL_error11, dVar2, tL_payments_canPurchaseStore, new Object[0]);
                    break;
                }
                break;
            case 21:
                a6a a6aVar = (a6a) this.c;
                v5a v5aVar = (v5a) this.b;
                HashMap hashMap = (HashMap) this.d;
                String str6 = (String) this.e;
                h2b h2bVar = (h2b) this.f;
                if (((t5a) v5aVar.d.get(0)).f != null) {
                    v5aVar.b();
                } else {
                    a6aVar.F.putAll(hashMap);
                    a6aVar.G.put(str6, v5aVar);
                    a6a a6aVar2 = v5aVar.o;
                    a6aVar2.getNotificationCenter().k(nm7.w1, v5aVar.e);
                    v5aVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList17 = v5aVar.d;
                    int size3 = arrayList17.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        a6aVar2.getFileLoader().h0(false, 67108864, ((t5a) arrayList17.get(i15)).a, true);
                    }
                    a6aVar.getNotificationCenter().k(nm7.v1, str6);
                    h2bVar.a(str6);
                }
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) ImportingService.class));
                    break;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 22:
                a6a a6aVar3 = (a6a) this.c;
                m5a m5aVar = (m5a) this.b;
                File file = (File) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                k47 k47Var2 = (k47) this.f;
                m5aVar.l = null;
                m5aVar.m.k.attachPath = file.toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        m5aVar.g = photoSize;
                        m5aVar.h = document2;
                    }
                }
                ArrayList arrayList18 = new ArrayList();
                arrayList18.add(k47Var2.k);
                a6aVar3.getMessagesStorage().g1(arrayList18, false, true, false, 0, false, k47Var2.r1 ? 1 : 0, 0L);
                m5aVar.p = true;
                a6aVar3.L(m5aVar, -1);
                a6aVar3.getNotificationCenter().k(49, m5aVar.m.k);
                break;
            case 23:
                a6a a6aVar4 = (a6a) this.c;
                File file2 = (File) this.b;
                gm.c3(new e77(a6aVar4, a6aVar4.z(file2.toString(), null, false), (k47) this.d, file2, (m5a) this.e, (String) this.f));
                break;
            case 24:
                jva jvaVar = (jva) this.c;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.b;
                fv4 fv4Var = (fv4) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error12 != null) {
                    fv4Var.a(Boolean.FALSE, tL_error12.text);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        oc7.r1(jvaVar.a).d4(paymentForm.users, false);
                        pVar2 = new p(paymentForm, tL_inputInvoiceStars, null);
                    } else if (tLObject9 instanceof TLRPC.PaymentReceipt) {
                        pVar2 = new p((TLRPC.PaymentReceipt) tLObject9);
                    }
                    if (pVar2 != null) {
                        pVar2.a1 = new wta(fv4Var, (byte) 0);
                        d Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            if (gm.s1(Q2)) {
                                bh0 bh0Var = new bh0();
                                bh0Var.a = true;
                                Q2.showAsSheet(pVar2, bh0Var);
                                break;
                            } else {
                                Q2.presentFragment(pVar2);
                                break;
                            }
                        }
                    } else {
                        fv4Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
            case 25:
                jva jvaVar2 = (jva) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
                String str7 = (String) this.d;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.e;
                jac jacVar = (jac) this.f;
                zArr2[0] = true;
                jvaVar2.Y(str7, chatInvite, new f25(jacVar, (byte) 1));
                break;
            case 26:
                a();
                break;
            case 27:
                jva jvaVar3 = (jva) this.c;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) this.b;
                jac jacVar2 = (jac) this.d;
                TLObject tLObject10 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error13 != null) {
                    jacVar2.a(Boolean.FALSE, tL_error13.text);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        oc7.r1(jvaVar3.a).d4(paymentForm2.users, false);
                        pVar = new p(paymentForm2, tL_inputInvoiceStars2, null);
                    } else if (tLObject10 instanceof TLRPC.PaymentReceipt) {
                        pVar = new p((TLRPC.PaymentReceipt) tLObject10);
                    }
                    if (pVar != null) {
                        pVar.a1 = new yf9(jacVar2, (byte) 28);
                        d Q3 = LaunchActivity.Q();
                        if (Q3 != null) {
                            if (gm.s1(Q3)) {
                                bh0 bh0Var2 = new bh0();
                                bh0Var2.a = true;
                                Q3.showAsSheet(pVar, bh0Var2);
                                break;
                            } else {
                                Q3.presentFragment(pVar);
                                break;
                            }
                        }
                    } else {
                        jacVar2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
            case 28:
                List list = (List) this.c;
                jac jacVar3 = (jac) this.b;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.d;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.e;
                Activity activity2 = (Activity) this.f;
                if (list.isEmpty()) {
                    fc4.b("StarsController.buy queryProductDetails done: no products");
                    gm.c3(new c25(jacVar3, b2));
                    break;
                } else {
                    ln8 ln8Var = (ln8) list.get(0);
                    in8 a2 = ln8Var.a();
                    if (a2 == null) {
                        fc4.b("StarsController.buy queryProductDetails done: no details");
                        gm.c3(new c25(jacVar3, (byte) 5));
                        break;
                    } else {
                        tL_inputStorePaymentStarsTopup.currency = a2.c;
                        tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption.currency)) * (a2.b / 1000000.0d));
                        cj0.h().c(ln8Var.c, new gx(jacVar3, (byte) 17));
                        cj0.h().h = new c25(jacVar3, b);
                        fc4.b("StarsController.buy launchBillingFlow");
                        cj0 h2 = cj0.h();
                        j5 a3 = j5.a(z8c.t0);
                        hi2 hi2Var2 = new hi2((byte) 9, false);
                        hi2Var2.T((ln8) list.get(0));
                        h2.k(activity2, a3, tL_inputStorePaymentStarsTopup, Collections.singletonList(hi2Var2.c()));
                        break;
                    }
                }
            default:
                jva jvaVar4 = (jva) this.c;
                he heVar = (he) this.b;
                TLObject tLObject11 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                qac qacVar = (qac) this.f;
                int i16 = jvaVar4.a;
                heVar.dismiss();
                if (tLObject11 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject11;
                    oc7.r1(i16).d4(tL_payments_savedStarGifts.users, false);
                    oc7.r1(i16).X3(tL_payments_savedStarGifts.chats, false);
                    for (int i17 = 0; i17 < tL_payments_savedStarGifts.gifts.size(); i17++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i17);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                qacVar.a(savedStarGift);
                break;
        }
    }

    public /* synthetic */ hz7(a58 a58Var, b7b b7bVar, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, y7b y7bVar) {
        this.a = (byte) 4;
        this.c = a58Var;
        this.d = b7bVar;
        this.b = tL_error;
        this.e = storyItem;
        this.f = y7bVar;
    }

    public /* synthetic */ hz7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ hz7(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.b = tL_error;
    }
}
