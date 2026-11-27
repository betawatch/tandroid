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
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
import org.telegram.ui.v;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cp7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cp7(fs8 fs8Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 14;
        this.b = fs8Var;
        this.e = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
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
        jf7 jf7Var = (jf7) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        hja hjaVar = (hja) this.f;
        int i2 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = jf7Var.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
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
                        cc4.g(e, z);
                        j2 = j;
                        i = i2;
                        hl.c3(new he(hjaVar, arrayList, i, j2, arrayList3, arrayList2));
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
                        long n = wf3.n(peer);
                        if (n > 0) {
                            arrayList4.add(Long.valueOf(n));
                        } else if (n < 0) {
                            arrayList5.add(Long.valueOf(-n));
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    jf7Var.P(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    jf7Var.k0(arrayList4, arrayList3, false);
                }
                sQLiteCursor.dispose();
                i = i3;
                j2 = j3;
            } catch (Exception e2) {
                e = e2;
                j = 0;
            }
            hl.c3(new he(hjaVar, arrayList, i, j2, arrayList3, arrayList2));
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        kcb kcbVar;
        int i4;
        ed8 ed8Var;
        String str;
        vnb vnbVar;
        byte b = 8;
        byte b2 = 7;
        byte b3 = 2;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                ((ip7) this.b).C((ArrayList) this.c, (zh6) this.e, (ArrayList) this.d, (Collection) this.f);
                break;
            case 1:
                m08 m08Var = (m08) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                fe7 fe7Var = (fe7) this.d;
                um4 um4Var = (um4) this.e;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.f;
                b18 b18Var = m08Var.a;
                if (tL_error == null) {
                    b18Var.C1.c(b18Var.F, (String) b18Var.t1.get("email"), null, null, null, null, null, null, null, null, fe7Var, um4Var);
                    break;
                } else {
                    i = ((e) b18Var).currentAccount;
                    jj.c0(i, tL_error, b18Var, verifyemail, new Object[0]);
                    um4Var.Z(null, null);
                    break;
                }
            case 2:
                x08 x08Var = (x08) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.f;
                x08Var.K = false;
                b18 b18Var2 = x08Var.R;
                if (tL_error2 == null) {
                    b18Var2.e1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    i2 = ((e) b18Var2).currentAccount;
                    id c0 = jj.c0(i2, tL_error2, b18Var2, tL_auth_resendCode, new Object[0]);
                    if (c0 != null && tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                        c0.n0 = new t08(x08Var, b4);
                    }
                }
                b18Var2.A1();
                break;
            case 3:
                ((p) this.b).m0((TLRPC.TL_error) this.c, (TLObject) this.d, (String) this.e, (TL_account.getPassword) this.f);
                break;
            case 4:
                o68 o68Var = (o68) this.b;
                z3b z3bVar = (z3b) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                u9b u9bVar = (u9b) this.f;
                t58 t58Var = o68Var.M0;
                x53 x53Var = o68Var.l0;
                if (z3bVar != null) {
                    z3bVar.run();
                }
                if (tL_error3 == null || "STORY_NOT_MODIFIED".equals(tL_error3.text)) {
                    storyItem.parsedPrivacy = u9bVar;
                    ArrayList arrayList = u9bVar.b;
                    int i5 = u9bVar.a;
                    ArrayList arrayList2 = u9bVar.c;
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
                                    i7 = dze.c(i7, 1, tL_inputPrivacyValueDisallowUsers.users.get(i7).user_id, tL_privacyValueDisallowUsers.users);
                                    i6 = i6;
                                }
                                i3 = i6;
                                arrayList3.add(tL_privacyValueDisallowUsers);
                            } else {
                                i3 = i6;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i8 = 0; i8 < tL_inputPrivacyValueAllowUsers.users.size(); i8 = dze.c(i8, 1, tL_inputPrivacyValueAllowUsers.users.get(i8).user_id, tL_privacyValueAllowUsers.users)) {
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
                    uc7.s1(o68Var.m2).O1().s0(storyItem.dialogId, storyItem, true);
                    o68Var.L3 = true;
                    if (i5 == 4) {
                        new d31(t58Var, x53Var).Q(R.raw.contact_check, 36, ob6.N0("StorySharedToEveryone")).j();
                    } else if (i5 == 1) {
                        new d31(t58Var, x53Var).Q(R.raw.contact_check, 36, ob6.N0("StorySharedToCloseFriends")).j();
                    } else if (i5 == 2) {
                        if (arrayList2.isEmpty()) {
                            new d31(t58Var, x53Var).Q(R.raw.contact_check, 36, ob6.N0("StorySharedToAllContacts")).j();
                        } else {
                            new d31(t58Var, x53Var).Q(R.raw.contact_check, 36, ob6.G(arrayList2.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i5 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList2);
                        Iterator it = u9bVar.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z = false;
                        new d31(t58Var, x53Var).Q(R.raw.contact_check, 36, ob6.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                    }
                    z = false;
                } else {
                    bs2.v(null, 2131743534, new d31(t58Var, x53Var), R.raw.error, 36);
                    z = false;
                }
                o68Var.c1(z);
                break;
            case 5:
                og3 og3Var = (og3) this.b;
                pg3 pg3Var = (pg3) this.c;
                Long l = (Long) this.d;
                rbb rbbVar = (rbb) this.e;
                Runnable runnable = (Runnable) this.f;
                if (og3Var == null) {
                    og3Var = pg3Var.e(l.longValue());
                }
                rbbVar.X(mbb.c(og3Var));
                runnable.run();
                break;
            case 6:
                long j = 0;
                j68 j68Var = (j68) this.b;
                Activity activity = (Activity) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                lcb lcbVar = (lcb) this.e;
                m68 m68Var = (m68) this.f;
                rbb C = rbb.C(activity, j68Var.x.m2);
                d30 d30Var = j68Var.x.w2;
                long j2 = (d30Var == null || (kcbVar = (kcb) d30Var.c) == null) ? 0L : kcbVar.currentPosition;
                c8b n = c8b.n(j68Var.x.y1.f(), j68Var.x.y1.a);
                o68 o68Var2 = j68Var.x;
                n.e = o68Var2.l1;
                TL_stories.StoryItem storyItem3 = o68Var2.y1.a;
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
                    }
                }
                n.e0 = j;
                c8b g = n.g();
                g.b0 = true;
                o68 o68Var3 = j68Var.x;
                TL_stories.StoryItem storyItem4 = o68Var3.y1.a;
                g.c0 = storyItem4.media.document;
                g.d0 = new v58(j68Var, storyItem4, storyItem2, b4);
                if (o68Var3.A0()) {
                    o68 o68Var4 = j68Var.x;
                    g.J0 = o68Var4.l1;
                    g.L0 = uc7.n5(o68Var4.y1.a.media);
                    u5b u5bVar = lcbVar.O0;
                    if (u5bVar instanceof o5b) {
                        g.K0 = ((o5b) u5bVar).E;
                    }
                }
                C.R(mbb.d(lcbVar), g, j2);
                C.R = new z58(j68Var, b4);
                C.S = new a68(j68Var, m68Var, null == true ? 1 : 0);
                break;
            case 7:
                v vVar = (v) this.b;
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) this.d;
                ArrayList arrayList4 = (ArrayList) this.c;
                Integer num = (Integer) this.e;
                ed8 ed8Var2 = (ed8) this.f;
                PhotoViewer photoViewer = vVar.r;
                photoViewer.o4 = null;
                ad8 ad8Var = photoViewer.f0;
                if (ad8Var != null && photoViewer.h0 != null) {
                    ad8Var.setLayerType(0, null);
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
                    fd8 fd8Var = photoViewer.p4;
                    if (fd8Var != null) {
                        fd8Var.a.v0(true, true);
                    }
                    fd8 fd8Var2 = photoViewer.q4;
                    if (fd8Var2 != null && !fd8Var2.s) {
                        fd8Var2.a.v0(false, true);
                    }
                    if (arrayList4 != null && (i4 = photoViewer.d2) != 3 && i4 != 1 && ((ed8Var = photoViewer.d) == null || !ed8Var.P())) {
                        photoViewer.W0();
                    }
                    kfc kfcVar = photoViewer.G2;
                    if (kfcVar != null && kfcVar.c0() && photoViewer.s1 && !photoViewer.f7.isEmpty()) {
                        photoViewer.B1(photoViewer.G2.S());
                        photoViewer.q1(true);
                    }
                    if (photoViewer.s4) {
                        photoViewer.G0(num.intValue());
                    }
                    if (ed8Var2 != null) {
                        ed8Var2.e();
                        break;
                    }
                }
                break;
            case 8:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
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
                        privacyControlActivity.B0();
                    }
                    privacyControlActivity.getNotificationCenter().k(48, new Object[0]);
                    break;
                }
            case 9:
                mn8 mn8Var = (mn8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f;
                PrivacyControlActivity privacyControlActivity2 = mn8Var.d;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    v21 Q = d31.b0(privacyControlActivity2).Q(R.raw.contact_check, 36, ob6.M0(2131746585, null));
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
                            vnbVar = ((e) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, parentActivity);
                            alertDialog$Builder.a.S = ob6.M0(2131746581, null);
                            alertDialog$Builder.a.U = ob6.M0(2131746582, null);
                            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                            privacyControlActivity2.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    } else {
                        bs2.v(null, 2131743534, d31.b0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                cp8 cp8Var = (cp8) this.f;
                RectF rectF = ProfileActivity.Z6;
                if (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    cp8Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    alertDialog$Builder2.a.S = ob6.M0(R.string.AppName, null);
                    alertDialog$Builder2.a.U = ob6.a0(null, null, 2131754343, lv2.m(0, user.first_name, user.last_name));
                    alertDialog$Builder2.j(ob6.M0(2131747558, null), new jz7(cp8Var, (byte) 18));
                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                    profileActivity.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                uq8 uq8Var = (uq8) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f;
                RectF rectF2 = ProfileActivity.Z6;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject3;
                    if (profileActivity2.e1 != 0) {
                        profileActivity2.getMessagesController().X1(Long.valueOf(profileActivity2.e1));
                    } else {
                        profileActivity2.getMessagesController().M0(Long.valueOf(profileActivity2.f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = ob6.D0().n0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String e = di0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String e2 = di0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    v21 w = new d31(uq8Var.w1, profileActivity2.A0).w(R.drawable.filled_username, hl.X3(hl.S2(ob6.a0(null, null, 2131750480, str2, format, e, TextUtils.isEmpty(e2) ? "" : qd4.y("(", e2, ")"))), new hp8(profileActivity2, tL_collectibleInfo, b3)));
                    uv5 uv5Var = new uv5(profileActivity2, tL_collectibleInfo, (byte) 26);
                    z11 z11Var = w.e;
                    if (z11Var != null) {
                        z11Var.setOnClickListener(uv5Var);
                    }
                    w.k(false);
                    break;
                } else {
                    d31.e0(tL_error6);
                    break;
                }
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                String str3 = (String) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f;
                RectF rectF3 = ProfileActivity.Z6;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    br4.a(profileActivity3.getParentActivity(), 1, str3, user2, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.A0);
                    break;
                } else {
                    d31.e0(tL_error7);
                    break;
                }
            case 13:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.d;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity4.D2(tLObject5, userFull2, tL_birthday2, tL_error8);
                break;
            case 14:
                fs8 fs8Var = (fs8) this.b;
                String str4 = (String) this.e;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.f;
                e eVar = fs8Var.e;
                if (str4.equals(fs8Var.E)) {
                    if (!fs8Var.x && (eVar instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) eVar).P.b.getImageReceiver().w0(false);
                            ((ProfileActivity) eVar).P.d.setText(ob6.M0(2131745204, null));
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                        }
                    }
                    fs8Var.x = true;
                    fs8Var.r = arrayList5;
                    fs8Var.s = arrayList6;
                    fs8Var.n = arrayList7;
                    fs8Var.f();
                    if (eVar instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) eVar).P.b.getImageReceiver().w0(false);
                            break;
                        } catch (Exception e4) {
                            cc4.g(e4, true);
                            return;
                        }
                    }
                }
                break;
            case 15:
                b19 b19Var = (b19) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                a19 a19Var = (a19) this.e;
                r47 r47Var = (r47) this.f;
                int i12 = b19Var.a;
                uc7.s1(i12).j4(arrayList8, true);
                uc7.s1(i12).c4(arrayList9, true);
                a19Var.e = r47Var;
                if (r47Var != null) {
                    r47Var.l(a19Var.a, a19Var.b);
                }
                b19Var.l();
                jn7.f(i12).k(jn7.F1, new Object[0]);
                break;
            case 16:
                b19 b19Var2 = (b19) this.b;
                TLObject tLObject6 = (TLObject) this.d;
                ArrayList<Integer> arrayList10 = (ArrayList) this.c;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f;
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
                    for (int i14 = 0; i14 < arrayList10.size(); i14++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(b19Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    cc4.d("received " + tLObject6 + " " + tL_error9 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 17:
                b19 b19Var3 = (b19) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = (ArrayList) this.e;
                Runnable runnable2 = (Runnable) this.f;
                b19Var3.e = false;
                int i15 = b19Var3.a;
                uc7.s1(i15).j4(arrayList12, true);
                uc7.s1(i15).c4(arrayList13, true);
                ArrayList arrayList15 = b19Var3.b;
                arrayList15.clear();
                arrayList15.addAll(arrayList14);
                if (runnable2 != null) {
                    runnable2.run();
                } else {
                    b19Var3.i(null, false);
                }
                jn7.f(i15).k(jn7.F1, new Object[0]);
                break;
            case 18:
                ((n1a) this.b).o((View) this.c, Long.valueOf(((hm) this.d).documentId), (TLRPC.Document) this.e, ((w0a) this.f).w, null);
                break;
            case 19:
                b2a b2aVar = (b2a) this.b;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user3 = (TLRPC.User) this.f;
                if (tL_error10 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    b2aVar.Z0(user3, twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 20:
                l3a l3aVar = (l3a) this.b;
                TLRPC.User user4 = (TLRPC.User) this.c;
                String str5 = (String) this.d;
                e39 e39Var = (e39) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList16 = new ArrayList();
                arrayList16.add(user4);
                z3a z3aVar = l3aVar.b;
                lv2.r(z3aVar.w).i(arrayList16, false);
                new d31(z3aVar, z3aVar.s).Q(R.raw.ic_ban, 36, ob6.a0(null, null, 2131751431, str5)).j();
                e39Var.a(true, z3aVar.b(storyView) ? 1.0f : 0.5f);
                break;
            case 21:
                a5a a5aVar = (a5a) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.d;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i16 = a5aVar.T1;
                e eVar2 = a5aVar.r1;
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    di0 h = di0.h();
                    Activity parentActivity2 = eVar2.getParentActivity();
                    k5 a = k5.a(i16);
                    qx6 qx6Var = new qx6(b2, (boolean) (null == true ? 1 : 0));
                    qx6Var.O(a5aVar.Z1.h);
                    h.k(parentActivity2, a, tL_inputStorePaymentGiftPremium, Collections.singletonList(qx6Var.g()));
                    break;
                } else if (tL_error11 != null) {
                    jj.c0(i16, tL_error11, eVar2, tL_payments_canPurchaseStore, new Object[0]);
                    break;
                }
                break;
            case 22:
                r7a r7aVar = (r7a) this.b;
                m7a m7aVar = (m7a) this.c;
                HashMap hashMap = (HashMap) this.d;
                String str6 = (String) this.e;
                e4b e4bVar = (e4b) this.f;
                if (((k7a) m7aVar.d.get(0)).f != null) {
                    m7aVar.b();
                } else {
                    r7aVar.F.putAll(hashMap);
                    r7aVar.G.put(str6, m7aVar);
                    r7a r7aVar2 = m7aVar.o;
                    r7aVar2.getNotificationCenter().k(jn7.w1, m7aVar.e);
                    m7aVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList17 = m7aVar.d;
                    int size2 = arrayList17.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        r7aVar2.getFileLoader().h0(false, 67108864, ((k7a) arrayList17.get(i17)).a, true);
                    }
                    r7aVar.getNotificationCenter().k(jn7.v1, str6);
                    e4bVar.a(str6);
                }
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) ImportingService.class));
                    break;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 23:
                r7a r7aVar3 = (r7a) this.b;
                d7a d7aVar = (d7a) this.c;
                File file = (File) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                r47 r47Var2 = (r47) this.f;
                d7aVar.l = null;
                d7aVar.m.k.attachPath = file.toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        d7aVar.g = photoSize;
                        d7aVar.h = document2;
                    }
                }
                ArrayList arrayList18 = new ArrayList();
                arrayList18.add(r47Var2.k);
                r7aVar3.getMessagesStorage().g1(arrayList18, false, true, false, 0, false, r47Var2.r1 ? 1 : 0, 0L);
                d7aVar.p = true;
                r7aVar3.L(d7aVar, -1);
                r7aVar3.getNotificationCenter().k(49, d7aVar.m.k);
                break;
            case 24:
                r7a r7aVar4 = (r7a) this.b;
                File file2 = (File) this.c;
                hl.c3(new z87(r7aVar4, r7aVar4.z(file2.toString(), null, false), (r47) this.d, file2, (d7a) this.e, (String) this.f));
                break;
            case 25:
                jxa jxaVar = (jxa) this.b;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.c;
                qe2 qe2Var = (qe2) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error12 != null) {
                    qe2Var.a(Boolean.FALSE, tL_error12.text);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        uc7.s1(jxaVar.a).j4(paymentForm.users, false);
                        pVar3 = new p(paymentForm, tL_inputInvoiceStars, null);
                    } else if (tLObject9 instanceof TLRPC.PaymentReceipt) {
                        pVar3 = new p((TLRPC.PaymentReceipt) tLObject9);
                    }
                    if (pVar3 != null) {
                        pVar3.a1 = new hja(qe2Var, (byte) 9);
                        e Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            if (hl.s1(Q2)) {
                                bg0 bg0Var = new bg0();
                                bg0Var.a = true;
                                Q2.showAsSheet(pVar3, bg0Var);
                                break;
                            } else {
                                Q2.presentFragment(pVar3);
                                break;
                            }
                        }
                    } else {
                        qe2Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
            case 26:
                jxa jxaVar2 = (jxa) this.b;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) this.c;
                iv4 iv4Var = (iv4) this.d;
                TLObject tLObject10 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error13 != null) {
                    iv4Var.a(Boolean.FALSE, tL_error13.text);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        uc7.s1(jxaVar2.a).j4(paymentForm2.users, false);
                        pVar2 = new p(paymentForm2, tL_inputInvoiceStars2, null);
                    } else if (tLObject10 instanceof TLRPC.PaymentReceipt) {
                        pVar2 = new p((TLRPC.PaymentReceipt) tLObject10);
                    }
                    if (pVar2 != null) {
                        pVar2.a1 = new hja(iv4Var, b);
                        e Q3 = LaunchActivity.Q();
                        if (Q3 != null) {
                            if (hl.s1(Q3)) {
                                bg0 bg0Var2 = new bg0();
                                bg0Var2.a = true;
                                Q3.showAsSheet(pVar2, bg0Var2);
                                break;
                            } else {
                                Q3.presentFragment(pVar2);
                                break;
                            }
                        }
                    } else {
                        iv4Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
            case 27:
                jxa jxaVar3 = (jxa) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                String str7 = (String) this.d;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.e;
                icc iccVar = (icc) this.f;
                zArr2[0] = true;
                jxaVar3.Z(str7, chatInvite, new j25(iccVar, (byte) 1));
                break;
            case 28:
                a();
                break;
            default:
                jxa jxaVar4 = (jxa) this.b;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) this.c;
                icc iccVar2 = (icc) this.d;
                TLObject tLObject11 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error14 != null) {
                    iccVar2.a(Boolean.FALSE, tL_error14.text);
                    break;
                } else {
                    if (tLObject11 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject11;
                        paymentForm3.invoice.recurring = true;
                        uc7.s1(jxaVar4.a).j4(paymentForm3.users, false);
                        pVar = new p(paymentForm3, tL_inputInvoiceStars3, null);
                    } else if (tLObject11 instanceof TLRPC.PaymentReceipt) {
                        pVar = new p((TLRPC.PaymentReceipt) tLObject11);
                    }
                    if (pVar != null) {
                        pVar.a1 = new hja(iccVar2, b2);
                        e Q4 = LaunchActivity.Q();
                        if (Q4 != null) {
                            if (hl.s1(Q4)) {
                                bg0 bg0Var3 = new bg0();
                                bg0Var3.a = true;
                                Q4.showAsSheet(pVar, bg0Var3);
                                break;
                            } else {
                                Q4.presentFragment(pVar);
                                break;
                            }
                        }
                    } else {
                        iccVar2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ cp7(ip7 ip7Var, ArrayList arrayList, zh6 zh6Var, ArrayList arrayList2, Collection collection) {
        this.a = (byte) 0;
        this.b = ip7Var;
        this.c = arrayList;
        this.e = zh6Var;
        this.d = arrayList2;
        this.f = collection;
    }

    public /* synthetic */ cp7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ cp7(Object obj, Object obj2, ArrayList arrayList, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
        this.e = obj3;
        this.f = obj4;
    }
}
