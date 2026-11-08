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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mc0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a6a, code lost:
    
        if (r3 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a74, code lost:
    
        if (r3 == 3) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a82, code lost:
    
        if (r3 == 16) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0ba5, code lost:
    
        if (r7 != 16) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0baf, code lost:
    
        if (r7 == 3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0bbd, code lost:
    
        if (r7 == 16) goto L445;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0bd2  */
    /* JADX WARN: Type inference failed for: r21v1 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z9;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int i17;
        ms msVar;
        TLRPC.User user;
        int i18;
        boolean z12;
        boolean z13;
        String[] strArr;
        ArrayList arrayList;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        TLRPC.Chat chat;
        String S0;
        String str;
        int i19;
        int i20;
        int i21;
        char c10;
        String G;
        int i22;
        int i23;
        boolean z14;
        int i24;
        int i25;
        TLRPC.Message message;
        int i26 = 5;
        int i27 = 2;
        qm qmVar = null;
        switch (this.a) {
            case 0:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pc0Var.N = fileLocation;
                pc0Var.O = photoSize2.location;
                pc0Var.e.j(org.telegram.messenger.hc.e(fileLocation), "50_50", pc0Var.f, null);
                break;
            case 1:
                gd0 gd0Var = (gd0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i28 = gd0Var.h0;
                ce0 ce0Var = gd0Var.u0;
                int i29 = 0;
                gd0Var.y(false);
                gd0Var.f0 = false;
                if (tL_error == null) {
                    Activity parentActivity = ce0Var.getParentActivity();
                    if (parentActivity != null) {
                        gd0Var.p(new zc0(i29, gd0Var, parentActivity));
                        break;
                    }
                } else {
                    gd0Var.g0 = tL_error.text;
                    if (i28 == 3) {
                        int i30 = gd0Var.i0;
                        if (i30 != 4) {
                            i7 = 2;
                            if (i30 != 2) {
                                if (i30 != 17) {
                                    break;
                                }
                            }
                        }
                        gd0Var.s();
                        if (i28 == 15) {
                            org.telegram.messenger.qs.e().b(gd0Var, org.telegram.messenger.qs.g4);
                            z9 = true;
                        } else if (i28 == 2) {
                            z9 = true;
                            org.telegram.messenger.g0.E3(true);
                            org.telegram.messenger.qs.e().b(gd0Var, org.telegram.messenger.qs.g4);
                        } else {
                            z9 = true;
                            if (i28 == 3) {
                                org.telegram.messenger.g0.D3(true);
                                org.telegram.messenger.qs.e().b(gd0Var, org.telegram.messenger.qs.h4);
                            }
                        }
                        gd0Var.e0 = z9;
                        if (i28 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                            org.telegram.ui.Components.v4.c0(i10, tL_error, ce0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            gd0Var.w();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            gd0Var.c(true);
                            ce0Var.M1(0, true, null, true);
                            break;
                        }
                    } else {
                        i7 = 2;
                    }
                    if (i28 == i7) {
                        int i31 = gd0Var.i0;
                        if (i31 != 4) {
                        }
                        gd0Var.s();
                        if (i28 == 15) {
                        }
                        gd0Var.e0 = z9;
                        if (i28 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        gd0Var.w();
                    }
                    if (i28 == 4) {
                        int i32 = gd0Var.i0;
                        if (i32 != i7) {
                            if (i32 != 17) {
                                break;
                            }
                        }
                        gd0Var.s();
                    }
                    if (i28 == 15) {
                    }
                    gd0Var.e0 = z9;
                    if (i28 != 3) {
                    }
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    gd0Var.w();
                }
                break;
            case 2:
                gd0 gd0Var2 = (gd0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i33 = gd0Var2.h0;
                ce0 ce0Var2 = gd0Var2.u0;
                gd0Var2.y(false);
                gd0Var2.f0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    gd0Var2.u();
                    gd0Var2.t();
                    i12 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                    org.telegram.messenger.p10.i(i12).w(user2);
                    i13 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                    org.telegram.messenger.p10.i(i13).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i14 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                    org.telegram.messenger.yr.a0(i14).m1(arrayList2, null, true, true);
                    i15 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                    org.telegram.messenger.qp.s1(i15).X3(user2, false, false);
                    i16 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                    org.telegram.messenger.qs.f(i16).k(46, new Object[0]);
                    ce0Var2.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i33 == 3) {
                        org.telegram.messenger.g0.T();
                    }
                    gd0Var2.p(new tc0(gd0Var2, i26));
                    break;
                } else {
                    gd0Var2.g0 = tL_error2.text;
                    gd0Var2.f0 = false;
                    ce0Var2.N1(false, true);
                    if (i33 == 3) {
                        int i34 = gd0Var2.i0;
                        if (i34 != 4) {
                            i11 = 2;
                            if (i34 != 2) {
                                if (i34 != 17) {
                                    break;
                                }
                            }
                        }
                        gd0Var2.s();
                        if (i33 == 15) {
                            org.telegram.messenger.qs.e().b(gd0Var2, org.telegram.messenger.qs.g4);
                            z10 = true;
                        } else if (i33 == 2) {
                            z10 = true;
                            org.telegram.messenger.g0.E3(true);
                            org.telegram.messenger.qs.e().b(gd0Var2, org.telegram.messenger.qs.g4);
                        } else {
                            z10 = true;
                            if (i33 == 3) {
                                org.telegram.messenger.g0.D3(true);
                                org.telegram.messenger.qs.e().b(gd0Var2, org.telegram.messenger.qs.h4);
                            }
                        }
                        gd0Var2.e0 = z10;
                        if (i33 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, "InvalidPhoneNumber"));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                gd0Var2.w();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                gd0Var2.c(true);
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, "FloodWait"));
                            } else {
                                String M0 = org.telegram.messenger.id.M0(2131746074, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                sb2.append(tL_error2.text);
                                ce0Var2.D1(M0, sb2.toString());
                            }
                            int i35 = 0;
                            while (true) {
                                yq yqVar = gd0Var2.f;
                                br[] brVarArr = yqVar.f;
                                if (i35 >= brVarArr.length) {
                                    yqVar.e = false;
                                    brVarArr[0].requestFocus();
                                    break;
                                } else {
                                    brVarArr[i35].setText("");
                                    i35++;
                                }
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                    if (i33 == i11) {
                        int i36 = gd0Var2.i0;
                        if (i36 != 4) {
                        }
                        gd0Var2.s();
                        if (i33 == 15) {
                        }
                        gd0Var2.e0 = z10;
                        if (i33 != 3) {
                        }
                    }
                    if (i33 == 4) {
                        int i37 = gd0Var2.i0;
                        if (i37 != i11) {
                            if (i37 != 17) {
                                break;
                            }
                        }
                        gd0Var2.s();
                    }
                    if (i33 == 15) {
                    }
                    gd0Var2.e0 = z10;
                    if (i33 != 3) {
                    }
                }
                break;
            case 3:
                gd0 gd0Var3 = (gd0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                gd0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                gd0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    gd0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    gd0Var3.i0 = 16;
                }
                gd0Var3.u0.y1(bundle, tL_auth_sentCode, true);
                break;
            case 4:
                ld0 ld0Var = (ld0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                fi.d dVar = ld0Var.b;
                ce0 ce0Var3 = ld0Var.w;
                ld0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    ld0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.q4 parentLayout = ce0Var3.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.f2) rf.b.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i38 = 0;
                        while (i38 < size) {
                            Object obj = arrayList3.get(i38);
                            i38++;
                            org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                            if ((f2Var2 instanceof hl0) && f2Var2 != f2Var) {
                                f2Var2.removeSelfFromStack();
                            }
                        }
                        if (f2Var instanceof hl0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ce0Var3.y1(ld0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    ce0Var3.y1(ld0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            ld0Var.e = tL_error3.text;
                            ld0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.hc(ce0Var3.Z, null).H(R.raw.error, org.telegram.messenger.id.a0(null, null, 2131743881, tL_error3.text));
                            break;
                        } else {
                            ce0Var3.M1(0, true, null, true);
                            ce0Var3.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, null));
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new hd0(ld0Var, 0), Integer.parseInt(tL_error3.text.substring(11)) * 1000);
                        break;
                    }
                }
                break;
            case 5:
                ld0 ld0Var2 = (ld0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                ce0 ce0Var4 = ld0Var2.w;
                ce0Var4.e = true;
                ce0 ce0Var5 = (ce0) LaunchActivity.L();
                if (ce0Var5 == null) {
                    i17 = ((org.telegram.ui.ActionBar.f2) ce0Var4).currentAccount;
                    ce0Var5 = new ce0(i17);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ce0Var5);
                    }
                }
                ce0Var5.I1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 6:
                be0 be0Var = (be0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                zd0 zd0Var = be0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (zd0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = be0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i39 = 0;
                            while (true) {
                                if (i39 >= arrayList4.size()) {
                                    msVar = null;
                                } else if (arrayList4.get(i39) == null || !((ms) arrayList4.get(i39)).a.equals(upperCase)) {
                                    i39++;
                                } else {
                                    msVar = (ms) arrayList4.get(i39);
                                }
                            }
                            if (msVar != null) {
                                zd0Var.setText(msVar.c);
                                be0Var.E = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                cf0 cf0Var = (cf0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error4 != null) {
                    cf0Var.getClass();
                    break;
                } else {
                    cf0 cf0Var2 = cf0Var.s0.a;
                    int i40 = 0;
                    while (true) {
                        ArrayList arrayList5 = cf0Var2.j0;
                        if (i40 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i40)).link.equals(tL_chatInviteExported.link)) {
                            ue0 l02 = cf0Var2.l0();
                            arrayList5.remove(i40);
                            cf0Var2.n0(l02);
                            break;
                        } else {
                            i40++;
                        }
                    }
                }
            case 8:
                org.telegram.messenger.g0.h3(new zc0(13, (org.telegram.ui.Components.fx) this.d, org.telegram.messenger.yr.a0(((ah0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                ah0 ah0Var = (ah0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.Components.fx fxVar = (org.telegram.ui.Components.fx) this.d;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    org.telegram.messenger.qp.s1(ah0Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.qp.s1(ah0Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = org.telegram.messenger.qp.s1(ah0Var.a).a2(Long.valueOf(o4));
                        fxVar.a(user);
                        break;
                    }
                }
                user = null;
                fxVar.a(user);
            case 10:
                mh0 mh0Var = (mh0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = mh0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(mh0Var, new ArrayList(), new ArrayList(), new ArrayList(), 24));
                    break;
                } else {
                    String S02 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S02) || S02.length() == 0) {
                        S02 = null;
                    }
                    int i41 = (S02 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i41];
                    strArr2[0] = lowerCase;
                    if (S02 != null) {
                        strArr2[1] = S02;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr4 = new String[2];
                    int i42 = 0;
                    while (i42 < arrayList6.size()) {
                        oh0 oh0Var = (oh0) arrayList6.get(i42);
                        if (org.telegram.messenger.m5.C(oh0Var.d)) {
                            TLRPC.EncryptedChat a12 = notificationsCustomSettingsActivity2.getMessagesController().a1(Integer.valueOf((int) (oh0Var.d & 4294967295L)));
                            if (a12 != null) {
                                i18 = i41;
                                TLRPC.User a22 = notificationsCustomSettingsActivity2.getMessagesController().a2(Long.valueOf(a12.user_id));
                                if (a22 != null) {
                                    strArr4[0] = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                                    strArr4[1] = org.telegram.messenger.t10.n(a22);
                                }
                            } else {
                                i18 = i41;
                            }
                        } else {
                            i18 = i41;
                            if (org.telegram.messenger.m5.E(oh0Var.d)) {
                                TLRPC.User a23 = notificationsCustomSettingsActivity2.getMessagesController().a2(Long.valueOf(oh0Var.d));
                                if (a23 != null && !a23.deleted) {
                                    strArr4[0] = org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name);
                                    strArr4[1] = org.telegram.messenger.t10.n(a23);
                                    z13 = true;
                                    z12 = false;
                                    chat = a23;
                                    String str5 = strArr4[z12 ? 1 : 0];
                                    strArr4[z12 ? 1 : 0] = str5.toLowerCase();
                                    strArr = strArr3;
                                    arrayList = arrayList6;
                                    S0 = org.telegram.messenger.id.E0().S0(strArr4[z12 ? 1 : 0], z13, z12);
                                    str = strArr4[z12 ? 1 : 0];
                                    if (str != null && str.equals(S0)) {
                                        S0 = null;
                                    }
                                    int i43 = z12 ? 1 : 0;
                                    i19 = i43;
                                    while (i19 < i18) {
                                        ?? r21 = z12;
                                        String str6 = strArr[i19];
                                        int i44 = i43;
                                        String str7 = strArr4[r21];
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                        if ((str7 == null || !(str7.startsWith(str6) || jg.g.A(" ", str6, strArr4[r21]))) && (S0 == null || !(S0.startsWith(str6) || jg.g.A(" ", str6, S0)))) {
                                            i20 = 1;
                                            String str8 = strArr4[1];
                                            i21 = (str8 == null || !str8.startsWith(str6)) ? i44 : 2;
                                        } else {
                                            i20 = 1;
                                            i21 = 1;
                                        }
                                        if (i21 != 0) {
                                            if (i21 == i20) {
                                                arrayList9.add(org.telegram.messenger.g0.r0(str5, null, str6));
                                            } else {
                                                arrayList9.add(org.telegram.messenger.g0.r0("@" + strArr4[i20], null, "@" + str6));
                                            }
                                            arrayList8.add(oh0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i19++;
                                            i43 = i21;
                                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                                            z12 = false;
                                        }
                                    }
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                }
                                strArr = strArr3;
                                arrayList = arrayList6;
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                            } else {
                                TLRPC.Chat M02 = notificationsCustomSettingsActivity2.getMessagesController().M0(Long.valueOf(-oh0Var.d));
                                if (M02 != null) {
                                    if (!M02.left && !M02.kicked && M02.migrated_to == null) {
                                        z12 = false;
                                        strArr4[0] = M02.title;
                                        z13 = true;
                                        strArr4[1] = org.telegram.messenger.t3.K(M02, false);
                                        chat = M02;
                                        String str52 = strArr4[z12 ? 1 : 0];
                                        strArr4[z12 ? 1 : 0] = str52.toLowerCase();
                                        strArr = strArr3;
                                        arrayList = arrayList6;
                                        S0 = org.telegram.messenger.id.E0().S0(strArr4[z12 ? 1 : 0], z13, z12);
                                        str = strArr4[z12 ? 1 : 0];
                                        if (str != null) {
                                            S0 = null;
                                        }
                                        int i432 = z12 ? 1 : 0;
                                        i19 = i432;
                                        while (i19 < i18) {
                                        }
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                    }
                                    strArr = strArr3;
                                    arrayList = arrayList6;
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                }
                            }
                            i42++;
                            i41 = i18;
                            strArr3 = strArr;
                            arrayList6 = arrayList;
                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                        }
                        z13 = true;
                        z12 = false;
                        chat = null;
                        String str522 = strArr4[z12 ? 1 : 0];
                        strArr4[z12 ? 1 : 0] = str522.toLowerCase();
                        strArr = strArr3;
                        arrayList = arrayList6;
                        S0 = org.telegram.messenger.id.E0().S0(strArr4[z12 ? 1 : 0], z13, z12);
                        str = strArr4[z12 ? 1 : 0];
                        if (str != null) {
                        }
                        int i4322 = z12 ? 1 : 0;
                        i19 = i4322;
                        while (i19 < i18) {
                        }
                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                        i42++;
                        i41 = i18;
                        strArr3 = strArr;
                        arrayList6 = arrayList;
                        notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(mh0Var, arrayList8, arrayList9, arrayList7, 24));
                    break;
                }
                break;
            case 11:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 12:
                bk0 bk0Var = (bk0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                bk0Var.B1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject6;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                    alertDialog$Builder.a.T = org.telegram.messenger.id.a0("RestoreEmailSent", null, 2131746083, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131746081, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new pu(29, bk0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = bk0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error5.text).intValue();
                    if (intValue < 60) {
                        c10 = 0;
                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                    } else {
                        c10 = 0;
                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    String M03 = org.telegram.messenger.id.M0(R.string.AppName, null);
                    Object[] objArr = new Object[1];
                    objArr[c10] = G;
                    bk0Var.Q1(M03, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, objArr));
                    break;
                } else {
                    bk0Var.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error5.text);
                    break;
                }
                break;
            case 13:
                ((qj0) this.b).a(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 14:
                pj0 pj0Var = (pj0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                bk0 bk0Var2 = pj0Var.e;
                secureRandom.setSeed(bk0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = bk0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.pv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = bk0.t1();
                bk0Var2.c1 = t12;
                bk0Var2.b1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = bk0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.g0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    bk0Var2.e1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(bk0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = bk0Var2.c1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bk0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = bk0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i22 = ((org.telegram.ui.ActionBar.f2) bk0Var2).currentAccount;
                ConnectionsManager.getInstance(i22).sendRequest(updatepasswordsettings, new nj0(pj0Var, i27));
                break;
            case 15:
                xj0 xj0Var = (xj0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i45 = xj0Var.L;
                bk0 bk0Var3 = xj0Var.Q;
                bk0Var3.B1();
                xj0Var.J = false;
                if (tL_error6 == null) {
                    xj0Var.r();
                    xj0Var.q();
                    ((gj0) bk0Var3.B1).c(bk0Var3.E, (String) bk0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new pi0(bk0Var3, 6), null);
                    break;
                } else {
                    xj0Var.K = tL_error6.text;
                    if ((i45 == 3 && ((i25 = xj0Var.M) == 4 || i25 == 2)) || ((i45 == 2 && ((i23 = xj0Var.M) == 4 || i23 == 3)) || (i45 == 4 && xj0Var.M == 2))) {
                        xj0Var.p();
                    }
                    if (i45 == 2) {
                        org.telegram.messenger.g0.E3(true);
                        org.telegram.messenger.qs.e().b(xj0Var, org.telegram.messenger.qs.g4);
                    } else if (i45 == 3) {
                        org.telegram.messenger.g0.D3(true);
                        org.telegram.messenger.qs.e().b(xj0Var, org.telegram.messenger.qs.h4);
                    }
                    xj0Var.I = true;
                    if (i45 != 3) {
                        i24 = ((org.telegram.ui.ActionBar.f2) bk0Var3).currentAccount;
                        z14 = false;
                        org.telegram.ui.Components.v4.c0(i24, tL_error6, bk0Var3, verifyphone, new Object[0]);
                    } else {
                        z14 = false;
                    }
                    bk0Var3.R1(true, z14);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            xj0Var.c(true);
                            bk0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i46 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = xj0Var.d;
                            if (i46 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i46].setText("");
                                i46++;
                            }
                        }
                    }
                }
                break;
            case 16:
                hl0.Z((hl0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 17:
                hl0.g0((hl0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 18:
                hl0 hl0Var = (hl0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                zc0 zc0Var = (zc0) this.d;
                hl0Var.E0 = tL_payments_validatedRequestedInfo;
                zc0Var.run();
                hl0Var.J0(false);
                hl0Var.N0(true, false);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                cn0 cn0Var = (cn0) this.d;
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                org.telegram.messenger.g0.r(cn0Var);
                org.telegram.messenger.g0.i3(cn0Var, 800L);
                break;
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.jc jcVar = (org.telegram.messenger.jc) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer2.getClass();
                jcVar.a();
                if (str10.equals(photoViewer2.B4.Q)) {
                    photoViewer2.v4 = 2;
                    photoViewer2.w4 = str10;
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ao0 ao0Var = (ao0) this.d;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.w3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    ao0Var.run();
                    break;
                }
                break;
            case 22:
                dq0 dq0Var = (dq0) this.b;
                dq0 dq0Var2 = (dq0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = dq0Var.d;
                if (photoViewer4.D != null && dq0Var2 == photoViewer4.w8) {
                    photoViewer4.w8 = null;
                    photoViewer4.p8 = iArr[5];
                    photoViewer4.h8 = iArr[4];
                    photoViewer4.i8 = iArr[7];
                    float f10 = photoViewer4.f8 / 8;
                    PhotoViewer photoViewer5 = dq0Var.d;
                    photoViewer4.q8 = (long) ((f10 * photoViewer5.h8) / 1000.0f);
                    if (photoViewer5.j8) {
                        PhotoViewer photoViewer6 = dq0Var.d;
                        photoViewer6.a8 = iArr[8];
                        photoViewer6.B3();
                        if (dq0Var.d.X7 > dq0Var.d.Y7 - 1) {
                            PhotoViewer photoViewer7 = dq0Var.d;
                            photoViewer7.X7 = photoViewer7.Y7 - 1;
                        }
                        PhotoViewer photoViewer8 = dq0Var.d;
                        if (!photoViewer8.I4) {
                            org.telegram.ui.Components.f51 f51Var = photoViewer8.j1;
                            boolean z15 = photoViewer8.Y7 > 1;
                            PhotoViewer photoViewer9 = dq0Var.d;
                            f51Var.a(Math.min(photoViewer9.d8, dq0Var.d.e8), z15, photoViewer9.r);
                        }
                        if (org.telegram.messenger.r2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(dq0Var.d.Y7);
                            sb3.append(" w = ");
                            sb3.append(dq0Var.d.b8);
                            sb3.append(" h = ");
                            sb3.append(dq0Var.d.c8);
                            sb3.append(" r = ");
                            jg.g.s(dq0Var.d.a8, sb3);
                        }
                        dq0Var.d.N7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = dq0Var.d;
                        if (!photoViewer10.I4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.d8, dq0Var.d.e8), false, photoViewer10.r);
                        }
                        dq0Var.d.Y7 = 0;
                    }
                    dq0Var.d.z3();
                    dq0Var.d.u3();
                    break;
                }
                break;
            case 23:
                zr0 zr0Var = (zr0) this.b;
                an anVar = (an) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.ij ijVar = zr0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (ijVar != null && (message = ijVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.ij.B0(message);
                    qmVar = new qm();
                    qmVar.a = ijVar;
                    qmVar.b = -1;
                    qmVar.c = -1;
                    qmVar.h = true;
                    qmVar.e = bArr5;
                    qmVar.f();
                }
                anVar.fc(ijVar, qmVar);
                zr0Var.c(false);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.hc.d0(tL_error7);
                    break;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.k5.p(null, 2131743882, org.telegram.ui.Components.hc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                RectF rectF = ProfileActivity.S6;
                if (org.telegram.messenger.g0.g(str11)) {
                    org.telegram.ui.Components.hc.a0(profileActivity).i(str12).j();
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                RectF rectF2 = ProfileActivity.S6;
                profileActivity2.getClass();
                int size2 = arrayList10.size();
                for (int i47 = 0; i47 < size2; i47++) {
                    TLRPC.User user3 = (TLRPC.User) arrayList10.get(i47);
                    if (!hashSet.contains(Long.valueOf(user3.id))) {
                        TLRPC.ChatFull chatFull = profileActivity2.t2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (org.telegram.messenger.t3.T(profileActivity2.D2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity2.getUserConfig().e();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user3.id;
                            channelParticipant.date = profileActivity2.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user3.id;
                            profileActivity2.t2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user3.id;
                            tL_chatParticipant.inviter_id = org.telegram.messenger.p10.i(profileActivity2.getAccountInstance().a).n;
                            profileActivity2.t2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity2.t2.participants_count++;
                        profileActivity2.getMessagesController().X3(user3, false, false);
                    }
                }
                profileActivity2.D5(true, false);
                break;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                org.telegram.ui.Components.kn knVar = (org.telegram.ui.Components.kn) this.c;
                an anVar2 = (an) this.d;
                RectF rectF3 = ProfileActivity.S6;
                org.telegram.ui.Components.gn gnVar = knVar.e;
                ViewGroup viewGroup = (ViewGroup) anVar2.fragmentView;
                RectF rectF4 = jh.k.h;
                jh.k.c(gnVar, viewGroup, rectF4);
                profileActivity3.e6 = rectF4.left;
                profileActivity3.d4();
                break;
            case 28:
                org.telegram.ui.Components.hc.D((mb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.d;
                secretMediaViewer.k0 = 0;
                secretMediaViewer.I0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                bi.x5 x5Var = secretMediaViewer.e;
                if (x5Var != null) {
                    x5Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    kz0 kz0Var = secretMediaViewer.n;
                    TLRPC.Message message2 = ijVar2.k;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    kz0Var.e = false;
                    kz0Var.f = j3;
                    kz0Var.h = j10;
                    kz0Var.n.start();
                    kz0Var.invalidate();
                    if (secretMediaViewer.f1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.o1 && org.telegram.messenger.qp.e1().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.m();
                        break;
                    }
                }
                break;
        }
    }
}
