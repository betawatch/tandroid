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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lc0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a68, code lost:
    
        if (r3 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a72, code lost:
    
        if (r3 == 3) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a80, code lost:
    
        if (r3 == 16) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0ba5, code lost:
    
        if (r8 != 16) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0baf, code lost:
    
        if (r8 == 3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0bbd, code lost:
    
        if (r6 == 16) goto L445;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a95  */
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
        ps psVar;
        TLRPC.User user;
        sh0 sh0Var;
        boolean z13;
        boolean z14;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        ArrayList arrayList;
        qh0 qh0Var;
        TLRPC.Chat chat;
        String T0;
        String str;
        int i18;
        int i19;
        int i20;
        char c10;
        String G;
        int i21;
        int i22;
        boolean z15;
        int i23;
        int i24;
        TLRPC.Message message;
        int i25 = 5;
        int i26 = 2;
        rm rmVar = null;
        switch (this.a) {
            case 0:
                oc0 oc0Var = (oc0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oc0Var.O = fileLocation;
                oc0Var.P = photoSize2.location;
                oc0Var.e.j(org.telegram.messenger.fc.e(fileLocation), "50_50", oc0Var.f, null);
                break;
            case 1:
                gd0 gd0Var = (gd0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i27 = gd0Var.i0;
                de0 de0Var = gd0Var.v0;
                gd0Var.y(false);
                gd0Var.g0 = false;
                if (tL_error == null) {
                    Activity parentActivity = de0Var.getParentActivity();
                    if (parentActivity != null) {
                        gd0Var.p(new i50(27, gd0Var, parentActivity));
                        break;
                    }
                } else {
                    gd0Var.h0 = tL_error.text;
                    if (i27 == 3) {
                        int i28 = gd0Var.j0;
                        if (i28 != 4) {
                            i7 = 2;
                            if (i28 != 2) {
                                if (i28 != 17) {
                                    break;
                                }
                            }
                        }
                        gd0Var.s();
                        if (i27 == 15) {
                            org.telegram.messenger.ks.e().b(gd0Var, org.telegram.messenger.ks.j4);
                            z10 = true;
                        } else if (i27 == 2) {
                            z10 = true;
                            org.telegram.messenger.g0.C3(true);
                            org.telegram.messenger.ks.e().b(gd0Var, org.telegram.messenger.ks.j4);
                        } else {
                            z10 = true;
                            if (i27 == 3) {
                                org.telegram.messenger.g0.B3(true);
                                org.telegram.messenger.ks.e().b(gd0Var, org.telegram.messenger.ks.k4);
                            }
                        }
                        gd0Var.f0 = z10;
                        if (i27 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                            org.telegram.ui.Components.b5.c0(i10, tL_error, de0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            gd0Var.w();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            gd0Var.c(true);
                            de0Var.M1(0, true, null, true);
                            break;
                        }
                    } else {
                        i7 = 2;
                    }
                    if (i27 == i7) {
                        int i29 = gd0Var.j0;
                        if (i29 != 4) {
                        }
                        gd0Var.s();
                        if (i27 == 15) {
                        }
                        gd0Var.f0 = z10;
                        if (i27 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        gd0Var.w();
                    }
                    if (i27 == 4) {
                        int i30 = gd0Var.j0;
                        if (i30 != i7) {
                            if (i30 != 17) {
                                break;
                            }
                        }
                        gd0Var.s();
                    }
                    if (i27 == 15) {
                    }
                    gd0Var.f0 = z10;
                    if (i27 != 3) {
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
                int i31 = gd0Var2.i0;
                de0 de0Var2 = gd0Var2.v0;
                gd0Var2.y(false);
                gd0Var2.g0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    gd0Var2.u();
                    gd0Var2.t();
                    i12 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.i10.i(i12).w(user2);
                    i13 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.i10.i(i13).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i14 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.tr.a0(i14).m1(arrayList2, null, true, true);
                    i15 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.mp.u1(i15).e4(user2, false, false);
                    i16 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.ks.f(i16).k(46, new Object[0]);
                    de0Var2.getMessagesController().s4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i31 == 3) {
                        org.telegram.messenger.g0.T();
                    }
                    gd0Var2.p(new sc0(gd0Var2, i25));
                    break;
                } else {
                    gd0Var2.h0 = tL_error2.text;
                    gd0Var2.g0 = false;
                    de0Var2.N1(false, true);
                    if (i31 == 3) {
                        int i32 = gd0Var2.j0;
                        if (i32 != 4) {
                            i11 = 2;
                            if (i32 != 2) {
                                if (i32 != 17) {
                                    break;
                                }
                            }
                        }
                        gd0Var2.s();
                        if (i31 == 15) {
                            org.telegram.messenger.ks.e().b(gd0Var2, org.telegram.messenger.ks.j4);
                            z11 = true;
                        } else if (i31 == 2) {
                            z11 = true;
                            org.telegram.messenger.g0.C3(true);
                            org.telegram.messenger.ks.e().b(gd0Var2, org.telegram.messenger.ks.j4);
                        } else {
                            z11 = true;
                            if (i31 == 3) {
                                org.telegram.messenger.g0.B3(true);
                                org.telegram.messenger.ks.e().b(gd0Var2, org.telegram.messenger.ks.k4);
                            }
                        }
                        gd0Var2.f0 = z11;
                        if (i31 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748986, "InvalidPhoneNumber"));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                gd0Var2.w();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                gd0Var2.c(true);
                                de0Var2.M1(0, true, null, true);
                                de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, "CodeExpired"));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131750670, "FloodWait"));
                            } else {
                                String N0 = org.telegram.messenger.gd.N0(2131745875, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751093, sb2, "\n");
                                sb2.append(tL_error2.text);
                                de0Var2.D1(N0, sb2.toString());
                            }
                            int i33 = 0;
                            while (true) {
                                br brVar = gd0Var2.f;
                                er[] erVarArr = brVar.f;
                                if (i33 >= erVarArr.length) {
                                    brVar.e = false;
                                    erVarArr[0].requestFocus();
                                    break;
                                } else {
                                    erVarArr[i33].setText("");
                                    i33++;
                                }
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                    if (i31 == i11) {
                        int i34 = gd0Var2.j0;
                        if (i34 != 4) {
                        }
                        gd0Var2.s();
                        if (i31 == 15) {
                        }
                        gd0Var2.f0 = z11;
                        if (i31 != 3) {
                        }
                    }
                    if (i31 == 4) {
                        int i35 = gd0Var2.j0;
                        if (i35 != i11) {
                            if (i35 != 17) {
                                break;
                            }
                        }
                        gd0Var2.s();
                    }
                    if (i31 == 15) {
                    }
                    gd0Var2.f0 = z11;
                    if (i31 != 3) {
                    }
                }
                break;
            case 3:
                gd0 gd0Var3 = (gd0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                gd0Var3.r0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                gd0Var3.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    gd0Var3.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    gd0Var3.j0 = 16;
                }
                gd0Var3.v0.y1(bundle, tL_auth_sentCode, true);
                break;
            case 4:
                ld0 ld0Var = (ld0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                hi.e eVar = ld0Var.b;
                de0 de0Var3 = ld0Var.w;
                ld0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    ld0Var.f = false;
                    eVar.setLoading(false);
                    org.telegram.ui.ActionBar.r4 parentLayout = de0Var3.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.g2) p5.c.h(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i36 = 0;
                        while (i36 < size) {
                            Object obj = arrayList3.get(i36);
                            i36++;
                            org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj;
                            if ((g2Var2 instanceof kl0) && g2Var2 != g2Var) {
                                g2Var2.removeSelfFromStack();
                            }
                        }
                        if (g2Var instanceof kl0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            de0Var3.y1(ld0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                            break;
                        }
                    }
                    z12 = true;
                    de0Var3.y1(ld0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            ld0Var.e = tL_error3.text;
                            ld0Var.f = false;
                            eVar.setLoading(false);
                            new org.telegram.ui.Components.kc(de0Var3.a0, null).H(R.raw.error, org.telegram.messenger.gd.a0(null, null, 2131743631, tL_error3.text));
                            break;
                        } else {
                            de0Var3.M1(0, true, null, true);
                            de0Var3.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, null));
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.h3(new hd0(ld0Var, 0), Integer.parseInt(tL_error3.text.substring(11)) * 1000);
                        break;
                    }
                }
                break;
            case 5:
                ld0 ld0Var2 = (ld0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                de0 de0Var4 = ld0Var2.w;
                de0Var4.e = true;
                de0 de0Var5 = (de0) LaunchActivity.L();
                if (de0Var5 == null) {
                    i17 = ((org.telegram.ui.ActionBar.g2) de0Var4).currentAccount;
                    de0Var5 = new de0(i17);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(de0Var5);
                    }
                }
                de0Var5.I1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 6:
                ce0 ce0Var = (ce0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                ae0 ae0Var = ce0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (ae0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = ce0Var.H;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i37 = 0;
                            while (true) {
                                if (i37 >= arrayList4.size()) {
                                    psVar = null;
                                } else if (arrayList4.get(i37) == null || !((ps) arrayList4.get(i37)).a.equals(upperCase)) {
                                    i37++;
                                } else {
                                    psVar = (ps) arrayList4.get(i37);
                                }
                            }
                            if (psVar != null) {
                                ae0Var.setText(psVar.c);
                                ce0Var.F = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                ef0 ef0Var = (ef0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error4 != null) {
                    ef0Var.getClass();
                    break;
                } else {
                    ef0 ef0Var2 = ef0Var.t0.a;
                    int i38 = 0;
                    while (true) {
                        ArrayList arrayList5 = ef0Var2.k0;
                        if (i38 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i38)).link.equals(tL_chatInviteExported.link)) {
                            we0 l02 = ef0Var2.l0();
                            arrayList5.remove(i38);
                            ef0Var2.n0(l02);
                            break;
                        } else {
                            i38++;
                        }
                    }
                }
            case 8:
                org.telegram.messenger.g0.g3(new bd0(10, (org.telegram.ui.Components.ph) this.d, org.telegram.messenger.tr.a0(((dh0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                dh0 dh0Var = (dh0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.Components.ph phVar = (org.telegram.ui.Components.ph) this.d;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    org.telegram.messenger.mp.u1(dh0Var.a).f4(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.mp.u1(dh0Var.a).Z3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.n5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = org.telegram.messenger.mp.u1(dh0Var.a).c2(Long.valueOf(o4));
                        phVar.a(user);
                        break;
                    }
                }
                user = null;
                phVar.a(user);
            case 10:
                qh0 qh0Var2 = (qh0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = qh0Var2.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new yd0(qh0Var2, new ArrayList(), new ArrayList(), new ArrayList(), 2));
                    break;
                } else {
                    String T02 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
                    if (lowerCase.equals(T02) || T02.length() == 0) {
                        T02 = null;
                    }
                    int i39 = (T02 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i39];
                    strArr[0] = lowerCase;
                    if (T02 != null) {
                        strArr[1] = T02;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr2 = new String[2];
                    int i40 = 0;
                    while (i40 < arrayList6.size()) {
                        sh0 sh0Var2 = (sh0) arrayList6.get(i40);
                        if (org.telegram.messenger.n5.C(sh0Var2.d)) {
                            TLRPC.EncryptedChat c12 = notificationsCustomSettingsActivity3.getMessagesController().c1(Integer.valueOf((int) (sh0Var2.d & 4294967295L)));
                            if (c12 != null) {
                                sh0Var = sh0Var2;
                                TLRPC.User c22 = notificationsCustomSettingsActivity3.getMessagesController().c2(Long.valueOf(c12.user_id));
                                if (c22 != null) {
                                    strArr2[0] = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
                                    strArr2[1] = org.telegram.messenger.n10.o(c22);
                                }
                            } else {
                                sh0Var = sh0Var2;
                            }
                        } else {
                            sh0Var = sh0Var2;
                            if (org.telegram.messenger.n5.E(sh0Var.d)) {
                                TLRPC.User c23 = notificationsCustomSettingsActivity3.getMessagesController().c2(Long.valueOf(sh0Var.d));
                                if (c23 != null && !c23.deleted) {
                                    strArr2[0] = org.telegram.messenger.i5.m(0, c23.first_name, c23.last_name);
                                    strArr2[1] = org.telegram.messenger.n10.o(c23);
                                    z14 = true;
                                    z13 = false;
                                    chat = c23;
                                    String str5 = strArr2[z13 ? 1 : 0];
                                    strArr2[z13 ? 1 : 0] = str5.toLowerCase();
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                    arrayList = arrayList6;
                                    T0 = org.telegram.messenger.gd.E0().T0(strArr2[z13 ? 1 : 0], z14, z13);
                                    str = strArr2[z13 ? 1 : 0];
                                    if (str != null && str.equals(T0)) {
                                        T0 = null;
                                    }
                                    int i41 = z13 ? 1 : 0;
                                    i18 = i41;
                                    while (i18 < i39) {
                                        ?? r21 = z13;
                                        String str6 = strArr[i18];
                                        int i42 = i41;
                                        String str7 = strArr2[r21];
                                        qh0Var = qh0Var2;
                                        if ((str7 == null || !(str7.startsWith(str6) || i5.c.B(" ", str6, strArr2[r21]))) && (T0 == null || !(T0.startsWith(str6) || i5.c.B(" ", str6, T0)))) {
                                            i19 = 1;
                                            String str8 = strArr2[1];
                                            i20 = (str8 == null || !str8.startsWith(str6)) ? i42 : 2;
                                        } else {
                                            i19 = 1;
                                            i20 = 1;
                                        }
                                        if (i20 != 0) {
                                            if (i20 == i19) {
                                                arrayList9.add(org.telegram.messenger.g0.r0(str5, null, str6));
                                            } else {
                                                arrayList9.add(org.telegram.messenger.g0.r0("@" + strArr2[i19], null, "@" + str6));
                                            }
                                            arrayList8.add(sh0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i18++;
                                            i41 = i20;
                                            qh0Var2 = qh0Var;
                                            z13 = false;
                                        }
                                    }
                                    qh0Var = qh0Var2;
                                }
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                arrayList = arrayList6;
                                qh0Var = qh0Var2;
                            } else {
                                TLRPC.Chat O0 = notificationsCustomSettingsActivity3.getMessagesController().O0(Long.valueOf(-sh0Var.d));
                                if (O0 != null) {
                                    if (!O0.left && !O0.kicked && O0.migrated_to == null) {
                                        z13 = false;
                                        strArr2[0] = O0.title;
                                        z14 = true;
                                        strArr2[1] = org.telegram.messenger.v3.K(O0, false);
                                        chat = O0;
                                        String str52 = strArr2[z13 ? 1 : 0];
                                        strArr2[z13 ? 1 : 0] = str52.toLowerCase();
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                        arrayList = arrayList6;
                                        T0 = org.telegram.messenger.gd.E0().T0(strArr2[z13 ? 1 : 0], z14, z13);
                                        str = strArr2[z13 ? 1 : 0];
                                        if (str != null) {
                                            T0 = null;
                                        }
                                        int i412 = z13 ? 1 : 0;
                                        i18 = i412;
                                        while (i18 < i39) {
                                        }
                                        qh0Var = qh0Var2;
                                    }
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                                    arrayList = arrayList6;
                                    qh0Var = qh0Var2;
                                }
                            }
                            i40++;
                            notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity;
                            arrayList6 = arrayList;
                            qh0Var2 = qh0Var;
                        }
                        z14 = true;
                        z13 = false;
                        chat = null;
                        String str522 = strArr2[z13 ? 1 : 0];
                        strArr2[z13 ? 1 : 0] = str522.toLowerCase();
                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity3;
                        arrayList = arrayList6;
                        T0 = org.telegram.messenger.gd.E0().T0(strArr2[z13 ? 1 : 0], z14, z13);
                        str = strArr2[z13 ? 1 : 0];
                        if (str != null) {
                        }
                        int i4122 = z13 ? 1 : 0;
                        i18 = i4122;
                        while (i18 < i39) {
                        }
                        qh0Var = qh0Var2;
                        i40++;
                        notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity;
                        arrayList6 = arrayList;
                        qh0Var2 = qh0Var;
                    }
                    org.telegram.messenger.g0.g3(new yd0(qh0Var2, arrayList8, arrayList9, arrayList7, 2));
                    break;
                }
                break;
            case 11:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 12:
                fk0 fk0Var = (fk0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                fk0Var.B1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject6;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
                    alertDialog$Builder.a.U = org.telegram.messenger.gd.a0("RestoreEmailSent", null, 2131745884, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131745882, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new yi0(i26, fk0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = fk0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error5.text).intValue();
                    if (intValue < 60) {
                        c10 = 0;
                        G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        c10 = 0;
                        G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    String N02 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                    Object[] objArr = new Object[1];
                    objArr[c10] = G;
                    fk0Var.Q1(N02, org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, objArr));
                    break;
                } else {
                    fk0Var.Q1(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error5.text);
                    break;
                }
                break;
            case 13:
                ((uj0) this.b).f(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 14:
                tj0 tj0Var = (tj0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                fk0 fk0Var2 = tj0Var.e;
                secureRandom.setSeed(fk0Var2.K.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = fk0Var2.K;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.jv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = fk0.t1();
                fk0Var2.d1 = t12;
                fk0Var2.c1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = fk0Var2.K.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.g0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    fk0Var2.f1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(fk0Var2.f1, 32, bArr3, 0, 16);
                    byte[] bArr4 = fk0Var2.d1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = fk0Var2.d1;
                    tL_secureSecretSettings.secure_secret_id = fk0Var2.c1;
                    passwordinputsettings.flags |= 4;
                }
                i21 = ((org.telegram.ui.ActionBar.g2) fk0Var2).currentAccount;
                ConnectionsManager.getInstance(i21).sendRequest(updatepasswordsettings, new rj0(tj0Var, i26));
                break;
            case 15:
                bk0 bk0Var = (bk0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i43 = bk0Var.M;
                fk0 fk0Var3 = bk0Var.R;
                fk0Var3.B1();
                bk0Var.K = false;
                if (tL_error6 == null) {
                    bk0Var.r();
                    bk0Var.q();
                    ((kj0) fk0Var3.C1).c(fk0Var3.F, (String) fk0Var3.t1.get("phone"), null, null, null, null, null, null, null, null, new si0(fk0Var3, 6), null);
                    break;
                } else {
                    bk0Var.L = tL_error6.text;
                    if ((i43 == 3 && ((i24 = bk0Var.N) == 4 || i24 == 2)) || ((i43 == 2 && ((i22 = bk0Var.N) == 4 || i22 == 3)) || (i43 == 4 && bk0Var.N == 2))) {
                        bk0Var.p();
                    }
                    if (i43 == 2) {
                        org.telegram.messenger.g0.C3(true);
                        org.telegram.messenger.ks.e().b(bk0Var, org.telegram.messenger.ks.j4);
                    } else if (i43 == 3) {
                        org.telegram.messenger.g0.B3(true);
                        org.telegram.messenger.ks.e().b(bk0Var, org.telegram.messenger.ks.k4);
                    }
                    bk0Var.J = true;
                    if (i43 != 3) {
                        i23 = ((org.telegram.ui.ActionBar.g2) fk0Var3).currentAccount;
                        z15 = false;
                        org.telegram.ui.Components.b5.c0(i23, tL_error6, fk0Var3, verifyphone, new Object[0]);
                    } else {
                        z15 = false;
                    }
                    fk0Var3.R1(true, z15);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            bk0Var.c(true);
                            fk0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i44 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = bk0Var.d;
                            if (i44 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i44].setText("");
                                i44++;
                            }
                        }
                    }
                }
                break;
            case 16:
                kl0.Z((kl0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 17:
                kl0.g0((kl0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 18:
                kl0 kl0Var = (kl0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                bd0 bd0Var = (bd0) this.d;
                kl0Var.F0 = tL_payments_validatedRequestedInfo;
                bd0Var.run();
                kl0Var.J0(false);
                kl0Var.N0(true, false);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                gn0 gn0Var = (gn0) this.d;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer.x3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    gn0Var.run();
                    break;
                }
                break;
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer2.getClass();
                hcVar.a();
                if (str10.equals(photoViewer2.C4.R)) {
                    photoViewer2.w4 = 2;
                    photoViewer2.x4 = str10;
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                kn0 kn0Var = (kn0) this.d;
                photoViewer3.C4.w0(bitmap);
                photoViewer3.t5.setUndoCutState(true);
                photoViewer3.Z2(true, true);
                org.telegram.messenger.g0.r(kn0Var);
                org.telegram.messenger.g0.h3(kn0Var, 800L);
                break;
            case 22:
                eq0 eq0Var = (eq0) this.b;
                eq0 eq0Var2 = (eq0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = eq0Var.d;
                if (photoViewer4.E != null && eq0Var2 == photoViewer4.D8) {
                    photoViewer4.D8 = null;
                    photoViewer4.w8 = iArr[5];
                    photoViewer4.o8 = iArr[4];
                    photoViewer4.p8 = iArr[7];
                    float f10 = photoViewer4.m8 / 8;
                    PhotoViewer photoViewer5 = eq0Var.d;
                    photoViewer4.x8 = (long) ((f10 * photoViewer5.o8) / 1000.0f);
                    if (photoViewer5.q8) {
                        PhotoViewer photoViewer6 = eq0Var.d;
                        photoViewer6.h8 = iArr[8];
                        photoViewer6.E3();
                        if (eq0Var.d.e8 > eq0Var.d.f8 - 1) {
                            PhotoViewer photoViewer7 = eq0Var.d;
                            photoViewer7.e8 = photoViewer7.f8 - 1;
                        }
                        PhotoViewer photoViewer8 = eq0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.u51 u51Var = photoViewer8.k1;
                            boolean z16 = photoViewer8.f8 > 1;
                            PhotoViewer photoViewer9 = eq0Var.d;
                            u51Var.a(Math.min(photoViewer9.k8, eq0Var.d.l8), z16, photoViewer9.r);
                        }
                        if (org.telegram.messenger.s2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(eq0Var.d.f8);
                            sb3.append(" w = ");
                            sb3.append(eq0Var.d.i8);
                            sb3.append(" h = ");
                            sb3.append(eq0Var.d.j8);
                            sb3.append(" r = ");
                            i5.c.t(eq0Var.d.h8, sb3);
                        }
                        eq0Var.d.U7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = eq0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.k1.a(Math.min(photoViewer10.k8, eq0Var.d.l8), false, photoViewer10.r);
                        }
                        eq0Var.d.f8 = 0;
                    }
                    eq0Var.d.C3();
                    eq0Var.d.w3();
                    break;
                }
                break;
            case 23:
                zr0 zr0Var = (zr0) this.b;
                bn bnVar = (bn) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.fj fjVar = zr0Var.I;
                byte[] bArr5 = pollAnswer.option;
                if (fjVar != null && (message = fjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.fj.B0(message);
                    rmVar = new rm();
                    rmVar.a = fjVar;
                    rmVar.b = -1;
                    rmVar.c = -1;
                    rmVar.h = true;
                    rmVar.e = bArr5;
                    rmVar.f();
                }
                bnVar.jc(fjVar, rmVar);
                zr0Var.c(false);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.kc.e0(tL_error7);
                    break;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.f3.o(null, 2131743632, org.telegram.ui.Components.kc.b0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                RectF rectF = ProfileActivity.Z6;
                if (org.telegram.messenger.g0.g(str11)) {
                    org.telegram.ui.Components.kc.b0(profileActivity).i(str12).j();
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getClass();
                int size2 = arrayList10.size();
                for (int i45 = 0; i45 < size2; i45++) {
                    TLRPC.User user3 = (TLRPC.User) arrayList10.get(i45);
                    if (!hashSet.contains(Long.valueOf(user3.id))) {
                        TLRPC.ChatFull chatFull = profileActivity2.v2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (org.telegram.messenger.v3.T(profileActivity2.F2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity2.getUserConfig().e();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user3.id;
                            channelParticipant.date = profileActivity2.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user3.id;
                            profileActivity2.v2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user3.id;
                            tL_chatParticipant.inviter_id = org.telegram.messenger.i10.i(profileActivity2.getAccountInstance().a).n;
                            profileActivity2.v2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity2.v2.participants_count++;
                        profileActivity2.getMessagesController().e4(user3, false, false);
                    }
                }
                profileActivity2.H5(true, false);
                break;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                org.telegram.ui.Components.zn znVar = (org.telegram.ui.Components.zn) this.c;
                bn bnVar2 = (bn) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.ui.Components.vn vnVar = znVar.e;
                ViewGroup viewGroup = (ViewGroup) bnVar2.fragmentView;
                RectF rectF4 = jh.k.h;
                jh.k.c(vnVar, viewGroup, rectF4);
                profileActivity3.k6 = rectF4.left;
                profileActivity3.d4();
                break;
            case 28:
                org.telegram.ui.Components.kc.D((lb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.d;
                secretMediaViewer.l0 = 0;
                secretMediaViewer.J0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ai.h0 h0Var = secretMediaViewer.e;
                if (h0Var != null) {
                    h0Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    lz0 lz0Var = secretMediaViewer.n;
                    TLRPC.Message message2 = fjVar2.k;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    lz0Var.e = false;
                    lz0Var.f = j3;
                    lz0Var.h = j10;
                    lz0Var.n.start();
                    lz0Var.invalidate();
                    if (secretMediaViewer.g1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.p1 && org.telegram.messenger.mp.g1().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.m();
                        break;
                    }
                }
                break;
        }
    }
}
