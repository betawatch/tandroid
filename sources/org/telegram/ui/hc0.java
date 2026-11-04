package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hc0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.d;
        RectF rectF = ProfileActivity.T6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i3);
            if (!hashSet.contains(Long.valueOf(user.id))) {
                TLRPC.ChatFull chatFull = profileActivity.u2;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (org.telegram.messenger.t3.T(profileActivity.E2)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.id;
                    profileActivity.u2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = org.telegram.messenger.h10.i(profileActivity.getAccountInstance().a).n;
                    profileActivity.u2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.u2.participants_count++;
                profileActivity.getMessagesController().X3(user, false, false);
            }
        }
        profileActivity.D5(true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x0965, code lost:
    
        if (r7 != 16) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x096f, code lost:
    
        if (r7 == 3) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x097d, code lost:
    
        if (r7 == 16) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0aa1, code lost:
    
        if (r8 != 16) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0aab, code lost:
    
        if (r8 == 3) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0ab9, code lost:
    
        if (r8 == 16) goto L415;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0ace  */
    /* JADX WARN: Type inference failed for: r23v1 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        ks ksVar;
        TLRPC.User user;
        int i18;
        boolean z13;
        boolean z14;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        ArrayList arrayList;
        jh0 jh0Var;
        TLRPC.Chat chat;
        String S0;
        String str;
        int i19;
        int i20;
        char c2;
        String G;
        int i21;
        int i22;
        boolean z15;
        int i23;
        int i24;
        TLRPC.Message message;
        int i25 = 5;
        int i26 = 2;
        mm mmVar = null;
        int i27 = 7;
        switch (this.a) {
            case 0:
                nc0 nc0Var = (nc0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                xd0 xd0Var = nc0Var.P;
                nc0Var.I = false;
                if (!(tLObject instanceof TLRPC.TL_auth_authorization)) {
                    xd0Var.t1(false, true);
                    if (!tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error.text.contains("LASTNAME_INVALID")) {
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error.text);
                                        break;
                                    } else {
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749188, "InvalidLastName"));
                                        break;
                                    }
                                } else {
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749190, "InvalidFirstName"));
                                    break;
                                }
                            } else {
                                nc0Var.c(true);
                                xd0Var.D1(0, true, null, true);
                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                break;
                            }
                        } else {
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, "InvalidCode"));
                            break;
                        }
                    } else {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                        break;
                    }
                } else {
                    nc0Var.n();
                    xd0Var.E1(false, true);
                    nc0Var.postDelayed(new tb0(2, nc0Var, tLObject), 150L);
                    break;
                }
                break;
            case 1:
                nc0 nc0Var2 = (nc0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                nc0Var2.N = fileLocation;
                nc0Var2.O = photoSize2.location;
                nc0Var2.e.j(org.telegram.messenger.ac.e(fileLocation), "50_50", nc0Var2.f, null);
                break;
            case 2:
                dd0 dd0Var = (dd0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.c;
                int i28 = dd0Var.i0;
                xd0 xd0Var2 = dd0Var.v0;
                dd0Var.y(false);
                dd0Var.g0 = false;
                if (tL_error2 == null) {
                    Activity parentActivity = xd0Var2.getParentActivity();
                    if (parentActivity != null) {
                        dd0Var.p(new tb0(5, dd0Var, parentActivity));
                        break;
                    }
                } else {
                    dd0Var.h0 = tL_error2.text;
                    if (i28 == 3) {
                        int i29 = dd0Var.j0;
                        i3 = 2;
                        if (i29 != 4) {
                            if (i29 != 2) {
                                if (i29 != 17) {
                                    break;
                                }
                            }
                        }
                        dd0Var.s();
                        if (i28 == 15) {
                            org.telegram.messenger.hs.e().b(dd0Var, org.telegram.messenger.hs.g4);
                            z10 = true;
                        } else if (i28 == 2) {
                            z10 = true;
                            org.telegram.messenger.g0.E3(true);
                            org.telegram.messenger.hs.e().b(dd0Var, org.telegram.messenger.hs.g4);
                        } else {
                            z10 = true;
                            if (i28 == 3) {
                                org.telegram.messenger.g0.D3(true);
                                org.telegram.messenger.hs.e().b(dd0Var, org.telegram.messenger.hs.h4);
                            }
                        }
                        dd0Var.f0 = z10;
                        if (i28 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                            org.telegram.ui.Components.t4.e0(i10, tL_error2, xd0Var2, confirmphone, new Object[0]);
                        }
                        if (tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                dd0Var.c(true);
                                xd0Var2.D1(0, true, null, true);
                                break;
                            }
                        } else {
                            dd0Var.w();
                            break;
                        }
                    } else {
                        i3 = 2;
                    }
                    if (i28 == i3) {
                        int i30 = dd0Var.j0;
                        if (i30 != 4) {
                        }
                        dd0Var.s();
                        if (i28 == 15) {
                        }
                        dd0Var.f0 = z10;
                        if (i28 != 3) {
                        }
                        if (tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        dd0Var.w();
                    }
                    if (i28 == 4) {
                        int i31 = dd0Var.j0;
                        if (i31 != i3) {
                            if (i31 != 17) {
                                break;
                            }
                        }
                        dd0Var.s();
                    }
                    if (i28 == 15) {
                    }
                    dd0Var.f0 = z10;
                    if (i28 != 3) {
                    }
                    if (tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    dd0Var.w();
                }
                break;
            case 3:
                dd0 dd0Var2 = (dd0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                int i32 = dd0Var2.i0;
                xd0 xd0Var3 = dd0Var2.v0;
                dd0Var2.y(false);
                dd0Var2.g0 = false;
                if (tL_error3 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject2;
                    dd0Var2.u();
                    dd0Var2.t();
                    i12 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                    org.telegram.messenger.h10.i(i12).w(user2);
                    i13 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                    org.telegram.messenger.h10.i(i13).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i14 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                    org.telegram.messenger.qr.a0(i14).m1(arrayList2, null, true, true);
                    i15 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                    org.telegram.messenger.hp.s1(i15).X3(user2, false, false);
                    i16 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                    org.telegram.messenger.hs.f(i16).k(46, new Object[0]);
                    xd0Var3.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i32 == 3) {
                        org.telegram.messenger.g0.T();
                    }
                    dd0Var2.p(new rc0(dd0Var2, i25));
                    break;
                } else {
                    dd0Var2.h0 = tL_error3.text;
                    dd0Var2.g0 = false;
                    xd0Var3.E1(false, true);
                    if (i32 == 3) {
                        int i33 = dd0Var2.j0;
                        if (i33 != 4) {
                            i11 = 2;
                            if (i33 != 2) {
                                if (i33 != 17) {
                                    break;
                                }
                            }
                        }
                        dd0Var2.s();
                        if (i32 == 15) {
                            org.telegram.messenger.hs.e().b(dd0Var2, org.telegram.messenger.hs.g4);
                            z11 = true;
                        } else if (i32 == 2) {
                            z11 = true;
                            org.telegram.messenger.g0.E3(true);
                            org.telegram.messenger.hs.e().b(dd0Var2, org.telegram.messenger.hs.g4);
                        } else {
                            z11 = true;
                            if (i32 == 3) {
                                org.telegram.messenger.g0.D3(true);
                                org.telegram.messenger.hs.e().b(dd0Var2, org.telegram.messenger.hs.h4);
                            }
                        }
                        dd0Var2.f0 = z11;
                        if (i32 != 3) {
                            if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                                xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                            } else if (tL_error3.text.contains("PHONE_CODE_EMPTY") || tL_error3.text.contains("PHONE_CODE_INVALID")) {
                                dd0Var2.w();
                                break;
                            } else if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                dd0Var2.c(true);
                                xd0Var3.D1(0, true, null, true);
                                xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                            } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                            } else {
                                String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                sb2.append(tL_error3.text);
                                xd0Var3.u1(M0, sb2.toString());
                            }
                            int i34 = 0;
                            while (true) {
                                xq xqVar = dd0Var2.f;
                                zq[] zqVarArr = xqVar.f;
                                if (i34 >= zqVarArr.length) {
                                    xqVar.e = false;
                                    zqVarArr[0].requestFocus();
                                    break;
                                } else {
                                    zqVarArr[i34].setText("");
                                    i34++;
                                }
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                    if (i32 == i11) {
                        int i35 = dd0Var2.j0;
                        if (i35 != 4) {
                        }
                        dd0Var2.s();
                        if (i32 == 15) {
                        }
                        dd0Var2.f0 = z11;
                        if (i32 != 3) {
                        }
                    }
                    if (i32 == 4) {
                        int i36 = dd0Var2.j0;
                        if (i36 != i11) {
                            if (i36 != 17) {
                                break;
                            }
                        }
                        dd0Var2.s();
                    }
                    if (i32 == 15) {
                    }
                    dd0Var2.f0 = z11;
                    if (i32 != 3) {
                    }
                }
                break;
            case 4:
                dd0 dd0Var3 = (dd0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                dd0Var3.r0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject3;
                dd0Var3.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    dd0Var3.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    dd0Var3.j0 = 16;
                }
                dd0Var3.v0.p1(bundle, tL_auth_sentCode, true);
                break;
            case 5:
                id0 id0Var = (id0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                gi.d dVar = id0Var.b;
                xd0 xd0Var4 = id0Var.w;
                id0Var.s = -1;
                if (!(tLObject4 instanceof TLRPC.auth_SentCode)) {
                    if (tL_error4 != null) {
                        String str2 = tL_error4.text;
                        if (str2 != null && str2.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.g0.i3(new ed0(id0Var, 0), Integer.parseInt(tL_error4.text.substring(11)) * 1000);
                            break;
                        } else {
                            String str3 = tL_error4.text;
                            if (str3 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                                xd0Var4.D1(0, true, null, true);
                                xd0Var4.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                                break;
                            } else {
                                id0Var.e = tL_error4.text;
                                id0Var.f = false;
                                dVar.setLoading(false);
                                new org.telegram.ui.Components.fc(xd0Var4.a0, null).H(R.raw.error, org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error4.text));
                                break;
                            }
                        }
                    }
                } else {
                    id0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.q4 parentLayout = xd0Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.d2) t4.c.d(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i37 = 0;
                        while (i37 < size) {
                            Object obj = arrayList3.get(i37);
                            i37++;
                            org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj;
                            if ((d2Var2 instanceof dl0) && d2Var2 != d2Var) {
                                d2Var2.removeSelfFromStack();
                            }
                        }
                        if (d2Var instanceof dl0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            xd0Var4.p1(id0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                            break;
                        }
                    }
                    z12 = true;
                    xd0Var4.p1(id0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                }
                break;
            case 6:
                id0 id0Var2 = (id0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                xd0 xd0Var5 = id0Var2.w;
                xd0Var5.e = true;
                xd0 xd0Var6 = (xd0) LaunchActivity.L();
                if (xd0Var6 == null) {
                    i17 = ((org.telegram.ui.ActionBar.d2) xd0Var5).currentAccount;
                    xd0Var6 = new xd0(i17);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(xd0Var6);
                    }
                }
                xd0Var6.z1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 7:
                wd0 wd0Var = (wd0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                ud0 ud0Var = wd0Var.a;
                if (tLObject5 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject5;
                    if (ud0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = wd0Var.H;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i38 = 0;
                            while (true) {
                                if (i38 >= arrayList4.size()) {
                                    ksVar = null;
                                } else if (arrayList4.get(i38) == null || !((ks) arrayList4.get(i38)).a.equals(upperCase)) {
                                    i38++;
                                } else {
                                    ksVar = (ks) arrayList4.get(i38);
                                }
                            }
                            if (ksVar != null) {
                                ud0Var.setText(ksVar.c);
                                wd0Var.F = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                xe0 xe0Var = (xe0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error5 != null) {
                    xe0Var.getClass();
                    break;
                } else {
                    xe0 xe0Var2 = xe0Var.t0.a;
                    int i39 = 0;
                    while (true) {
                        ArrayList arrayList5 = xe0Var2.k0;
                        if (i39 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i39)).link.equals(tL_chatInviteExported.link)) {
                            pe0 l02 = xe0Var2.l0();
                            arrayList5.remove(i39);
                            xe0Var2.n0(l02);
                            break;
                        } else {
                            i39++;
                        }
                    }
                }
            case 9:
                org.telegram.messenger.g0.h3(new tb0(17, (org.telegram.ui.Components.ei) this.d, org.telegram.messenger.qr.a0(((vg0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 10:
                vg0 vg0Var = (vg0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.Components.ei eiVar = (org.telegram.ui.Components.ei) this.d;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    org.telegram.messenger.hp.s1(vg0Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.hp.s1(vg0Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        user = org.telegram.messenger.hp.s1(vg0Var.a).a2(Long.valueOf(o10));
                        eiVar.a(user);
                        break;
                    }
                }
                user = null;
                eiVar.a(user);
            case 11:
                jh0 jh0Var2 = (jh0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = jh0Var2.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String S02 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S02) || S02.length() == 0) {
                        S02 = null;
                    }
                    int i40 = (S02 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i40];
                    strArr[0] = lowerCase;
                    if (S02 != null) {
                        strArr[1] = S02;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr2 = new String[2];
                    int i41 = 0;
                    while (i41 < arrayList6.size()) {
                        lh0 lh0Var = (lh0) arrayList6.get(i41);
                        if (org.telegram.messenger.m5.C(lh0Var.d)) {
                            TLRPC.EncryptedChat a12 = notificationsCustomSettingsActivity3.getMessagesController().a1(Integer.valueOf((int) (lh0Var.d & 4294967295L)));
                            if (a12 != null) {
                                i18 = i41;
                                TLRPC.User a22 = notificationsCustomSettingsActivity3.getMessagesController().a2(Long.valueOf(a12.user_id));
                                if (a22 != null) {
                                    strArr2[0] = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                                    strArr2[1] = org.telegram.messenger.l10.n(a22);
                                }
                            } else {
                                i18 = i41;
                            }
                        } else {
                            i18 = i41;
                            if (org.telegram.messenger.m5.E(lh0Var.d)) {
                                TLRPC.User a23 = notificationsCustomSettingsActivity3.getMessagesController().a2(Long.valueOf(lh0Var.d));
                                if (a23 != null && !a23.deleted) {
                                    strArr2[0] = org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name);
                                    strArr2[1] = org.telegram.messenger.l10.n(a23);
                                    z14 = true;
                                    z13 = false;
                                    chat = a23;
                                    String str5 = strArr2[z13 ? 1 : 0];
                                    strArr2[z13 ? 1 : 0] = str5.toLowerCase();
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                    S0 = org.telegram.messenger.bd.E0().S0(strArr2[z13 ? 1 : 0], z14, z13);
                                    str = strArr2[z13 ? 1 : 0];
                                    if (str != null && str.equals(S0)) {
                                        S0 = null;
                                    }
                                    int i42 = z13 ? 1 : 0;
                                    i19 = i42;
                                    while (i19 < i40) {
                                        ?? r23 = z13;
                                        String str6 = strArr[i19];
                                        arrayList = arrayList6;
                                        String str7 = strArr2[r23];
                                        jh0Var = jh0Var2;
                                        if ((str7 == null || !(str7.startsWith(str6) || k2.p1.z(" ", str6, strArr2[r23]))) && (S0 == null || !(S0.startsWith(str6) || k2.p1.z(" ", str6, S0)))) {
                                            i20 = 1;
                                            String str8 = strArr2[1];
                                            if (str8 != null && str8.startsWith(str6)) {
                                                i42 = 2;
                                            }
                                        } else {
                                            i20 = 1;
                                            i42 = 1;
                                        }
                                        if (i42 != 0) {
                                            if (i42 == i20) {
                                                arrayList9.add(org.telegram.messenger.g0.r0(str5, null, str6));
                                            } else {
                                                arrayList9.add(org.telegram.messenger.g0.r0("@" + strArr2[i20], null, "@" + str6));
                                            }
                                            arrayList8.add(lh0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i19++;
                                            arrayList6 = arrayList;
                                            jh0Var2 = jh0Var;
                                            z13 = false;
                                        }
                                    }
                                    arrayList = arrayList6;
                                    jh0Var = jh0Var2;
                                }
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                arrayList = arrayList6;
                                jh0Var = jh0Var2;
                            } else {
                                TLRPC.Chat M02 = notificationsCustomSettingsActivity3.getMessagesController().M0(Long.valueOf(-lh0Var.d));
                                if (M02 != null) {
                                    if (!M02.left && !M02.kicked && M02.migrated_to == null) {
                                        z13 = false;
                                        strArr2[0] = M02.title;
                                        z14 = true;
                                        strArr2[1] = org.telegram.messenger.t3.K(M02, false);
                                        chat = M02;
                                        String str52 = strArr2[z13 ? 1 : 0];
                                        strArr2[z13 ? 1 : 0] = str52.toLowerCase();
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                        S0 = org.telegram.messenger.bd.E0().S0(strArr2[z13 ? 1 : 0], z14, z13);
                                        str = strArr2[z13 ? 1 : 0];
                                        if (str != null) {
                                            S0 = null;
                                        }
                                        int i422 = z13 ? 1 : 0;
                                        i19 = i422;
                                        while (i19 < i40) {
                                        }
                                        arrayList = arrayList6;
                                        jh0Var = jh0Var2;
                                    }
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                    arrayList = arrayList6;
                                    jh0Var = jh0Var2;
                                }
                            }
                            i41 = i18 + 1;
                            notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity;
                            arrayList6 = arrayList;
                            jh0Var2 = jh0Var;
                        }
                        z14 = true;
                        z13 = false;
                        chat = null;
                        String str522 = strArr2[z13 ? 1 : 0];
                        strArr2[z13 ? 1 : 0] = str522.toLowerCase();
                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                        S0 = org.telegram.messenger.bd.E0().S0(strArr2[z13 ? 1 : 0], z14, z13);
                        str = strArr2[z13 ? 1 : 0];
                        if (str != null) {
                        }
                        int i4222 = z13 ? 1 : 0;
                        i19 = i4222;
                        while (i19 < i40) {
                        }
                        arrayList = arrayList6;
                        jh0Var = jh0Var2;
                        i41 = i18 + 1;
                        notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity;
                        arrayList6 = arrayList;
                        jh0Var2 = jh0Var;
                    }
                    org.telegram.messenger.g0.h3(new ih0(jh0Var2, arrayList8, arrayList9, arrayList7, 0));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ih0(jh0Var2, new ArrayList(), new ArrayList(), new ArrayList(), 0));
                    break;
                }
                break;
            case 12:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 13:
                yj0 yj0Var = (yj0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                yj0Var.B1();
                if (tL_error6 != null) {
                    if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                        yj0Var.Q1(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error6.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error6.text).intValue();
                        if (intValue < 60) {
                            c2 = 0;
                            G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c2 = 0;
                            G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M03 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c2] = G;
                        yj0Var.Q1(M03, org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, objArr));
                        break;
                    }
                } else {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject7;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                    alertDialog$Builder.a.U = org.telegram.messenger.bd.a0("RestoreEmailSent", null, 2131746090, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131746088, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new rb0(i27, yj0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = yj0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 14:
                ((nj0) this.b).f(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 15:
                mj0 mj0Var = (mj0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                yj0 yj0Var2 = mj0Var.e;
                secureRandom.setSeed(yj0Var2.K.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = yj0Var2.K;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.hv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = yj0.t1();
                yj0Var2.d1 = t12;
                yj0Var2.c1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = yj0Var2.K.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.g0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    yj0Var2.f1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(yj0Var2.f1, 32, bArr3, 0, 16);
                    byte[] bArr4 = yj0Var2.d1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = yj0Var2.d1;
                    tL_secureSecretSettings.secure_secret_id = yj0Var2.c1;
                    passwordinputsettings.flags |= 4;
                }
                i21 = ((org.telegram.ui.ActionBar.d2) yj0Var2).currentAccount;
                ConnectionsManager.getInstance(i21).sendRequest(updatepasswordsettings, new kj0(mj0Var, i26));
                break;
            case 16:
                uj0 uj0Var = (uj0) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i43 = uj0Var.M;
                yj0 yj0Var3 = uj0Var.R;
                yj0Var3.B1();
                uj0Var.K = false;
                if (tL_error7 != null) {
                    uj0Var.L = tL_error7.text;
                    if ((i43 == 3 && ((i24 = uj0Var.N) == 4 || i24 == 2)) || ((i43 == 2 && ((i22 = uj0Var.N) == 4 || i22 == 3)) || (i43 == 4 && uj0Var.N == 2))) {
                        uj0Var.p();
                    }
                    if (i43 == 2) {
                        org.telegram.messenger.g0.E3(true);
                        org.telegram.messenger.hs.e().b(uj0Var, org.telegram.messenger.hs.g4);
                    } else if (i43 == 3) {
                        org.telegram.messenger.g0.D3(true);
                        org.telegram.messenger.hs.e().b(uj0Var, org.telegram.messenger.hs.h4);
                    }
                    uj0Var.J = true;
                    if (i43 != 3) {
                        i23 = ((org.telegram.ui.ActionBar.d2) yj0Var3).currentAccount;
                        z15 = false;
                        org.telegram.ui.Components.t4.e0(i23, tL_error7, yj0Var3, verifyphone, new Object[0]);
                    } else {
                        z15 = false;
                    }
                    yj0Var3.R1(true, z15);
                    if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            uj0Var.c(true);
                            yj0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i44 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = uj0Var.d;
                            if (i44 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i44].setText("");
                                i44++;
                            }
                        }
                    }
                } else {
                    uj0Var.r();
                    uj0Var.q();
                    ((dj0) yj0Var3.C1).c(yj0Var3.F, (String) yj0Var3.t1.get("phone"), null, null, null, null, null, null, null, null, new mi0(yj0Var3, 6), null);
                    break;
                }
                break;
            case 17:
                dl0.Z((dl0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 18:
                dl0.g0((dl0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 19:
                dl0 dl0Var = (dl0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                tb0 tb0Var = (tb0) this.d;
                dl0Var.F0 = tL_payments_validatedRequestedInfo;
                tb0Var.run();
                dl0Var.J0(false);
                dl0Var.N0(true, false);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                xm0 xm0Var = (xm0) this.d;
                photoViewer.D4.v0(bitmap);
                photoViewer.u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                org.telegram.messenger.g0.r(xm0Var);
                org.telegram.messenger.g0.i3(xm0Var, 800L);
                break;
            case 21:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.cc ccVar = (org.telegram.messenger.cc) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer2.getClass();
                ccVar.a();
                if (str10.equals(photoViewer2.D4.R)) {
                    photoViewer2.x4 = 2;
                    photoViewer2.y4 = str10;
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                tn0 tn0Var = (tn0) this.d;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.y3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    tn0Var.run();
                    break;
                }
                break;
            case 23:
                up0 up0Var = (up0) this.b;
                up0 up0Var2 = (up0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = up0Var.d;
                if (photoViewer4.E != null && up0Var2 == photoViewer4.y8) {
                    photoViewer4.y8 = null;
                    photoViewer4.r8 = iArr[5];
                    photoViewer4.j8 = iArr[4];
                    photoViewer4.k8 = iArr[7];
                    float f10 = photoViewer4.h8 / 8;
                    PhotoViewer photoViewer5 = up0Var.d;
                    photoViewer4.s8 = (long) ((f10 * photoViewer5.j8) / 1000.0f);
                    if (photoViewer5.l8) {
                        PhotoViewer photoViewer6 = up0Var.d;
                        photoViewer6.c8 = iArr[8];
                        photoViewer6.G3();
                        if (up0Var.d.Z7 > up0Var.d.a8 - 1) {
                            PhotoViewer photoViewer7 = up0Var.d;
                            photoViewer7.Z7 = photoViewer7.a8 - 1;
                        }
                        PhotoViewer photoViewer8 = up0Var.d;
                        if (!photoViewer8.K4) {
                            org.telegram.ui.Components.z41 z41Var = photoViewer8.k1;
                            boolean z16 = photoViewer8.a8 > 1;
                            PhotoViewer photoViewer9 = up0Var.d;
                            z41Var.a(Math.min(photoViewer9.f8, up0Var.d.g8), z16, photoViewer9.r);
                        }
                        if (org.telegram.messenger.r2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(up0Var.d.a8);
                            sb3.append(" w = ");
                            sb3.append(up0Var.d.d8);
                            sb3.append(" h = ");
                            sb3.append(up0Var.d.e8);
                            sb3.append(" r = ");
                            k2.p1.q(up0Var.d.c8, sb3);
                        }
                        up0Var.d.P7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = up0Var.d;
                        if (!photoViewer10.K4) {
                            photoViewer10.k1.a(Math.min(photoViewer10.f8, up0Var.d.g8), false, photoViewer10.r);
                        }
                        up0Var.d.a8 = 0;
                    }
                    up0Var.d.E3();
                    up0Var.d.A3();
                    break;
                }
                break;
            case 24:
                pr0 pr0Var = (pr0) this.b;
                wm wmVar = (wm) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.zi ziVar = pr0Var.I;
                byte[] bArr5 = pollAnswer.option;
                if (ziVar != null && (message = ziVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.zi.B0(message);
                    mmVar = new mm();
                    mmVar.a = ziVar;
                    mmVar.b = -1;
                    mmVar.c = -1;
                    mmVar.h = true;
                    mmVar.e = bArr5;
                    mmVar.f();
                }
                wmVar.fc(ziVar, mmVar);
                pr0Var.c(false);
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                if (tL_error8 == null) {
                    if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(premiumPreviewFragment), null);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.fc.d0(tL_error8);
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                RectF rectF = ProfileActivity.T6;
                if (org.telegram.messenger.g0.g(str11)) {
                    org.telegram.ui.Components.fc.a0(profileActivity).i(str12).j();
                    break;
                }
                break;
            case 27:
                a();
                break;
            case 28:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.c;
                wm wmVar2 = (wm) this.d;
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.ui.Components.fn fnVar = jnVar.e;
                ViewGroup viewGroup = (ViewGroup) wmVar2.fragmentView;
                RectF rectF3 = kh.k.h;
                kh.k.c(fnVar, viewGroup, rectF3);
                profileActivity2.f6 = rectF3.left;
                profileActivity2.d4();
                break;
            default:
                org.telegram.ui.Components.fc.D((kb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
        }
    }

    public /* synthetic */ hc0(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
