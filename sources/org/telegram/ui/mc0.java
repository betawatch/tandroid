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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a6d, code lost:
    
        if (r4 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a77, code lost:
    
        if (r4 == 3) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a85, code lost:
    
        if (r4 == 16) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0baa, code lost:
    
        if (r9 != 16) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0bb4, code lost:
    
        if (r9 == 3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0bc2, code lost:
    
        if (r9 == 16) goto L445;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0bd7  */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
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
        ArrayList arrayList;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        boolean z13;
        sh0 sh0Var;
        int i18;
        String[] strArr;
        ?? r25;
        TLRPC.Chat chat;
        String T0;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        TLRPC.Message message;
        int i26 = 6;
        int i27 = 5;
        int i28 = 2;
        rm rmVar = null;
        boolean z14 = false;
        switch (this.a) {
            case 0:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pc0Var.O = fileLocation;
                pc0Var.P = photoSize2.location;
                pc0Var.e.j(org.telegram.messenger.fc.e(fileLocation), "50_50", pc0Var.f, null);
                break;
            case 1:
                gd0 gd0Var = (gd0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i29 = gd0Var.i0;
                de0 de0Var = gd0Var.v0;
                gd0Var.y(false);
                gd0Var.g0 = false;
                if (tL_error == null) {
                    Activity parentActivity = de0Var.getParentActivity();
                    if (parentActivity != null) {
                        gd0Var.p(new h60(23, gd0Var, parentActivity));
                        break;
                    }
                } else {
                    gd0Var.h0 = tL_error.text;
                    if (i29 == 3) {
                        int i30 = gd0Var.j0;
                        if (i30 != 4) {
                            i7 = 2;
                            if (i30 != 2) {
                                if (i30 != 17) {
                                    break;
                                }
                            }
                        }
                        gd0Var.s();
                        if (i29 == 15) {
                            org.telegram.messenger.ks.e().b(gd0Var, org.telegram.messenger.ks.j4);
                            z10 = true;
                        } else if (i29 == 2) {
                            z10 = true;
                            org.telegram.messenger.g0.C3(true);
                            org.telegram.messenger.ks.e().b(gd0Var, org.telegram.messenger.ks.j4);
                        } else {
                            z10 = true;
                            if (i29 == 3) {
                                org.telegram.messenger.g0.B3(true);
                                org.telegram.messenger.ks.e().b(gd0Var, org.telegram.messenger.ks.k4);
                            }
                        }
                        gd0Var.f0 = z10;
                        if (i29 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                            org.telegram.ui.Components.c5.c0(i10, tL_error, de0Var, confirmphone, new Object[0]);
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
                    if (i29 == i7) {
                        int i31 = gd0Var.j0;
                        if (i31 != 4) {
                        }
                        gd0Var.s();
                        if (i29 == 15) {
                        }
                        gd0Var.f0 = z10;
                        if (i29 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        gd0Var.w();
                    }
                    if (i29 == 4) {
                        int i32 = gd0Var.j0;
                        if (i32 != i7) {
                            if (i32 != 17) {
                                break;
                            }
                        }
                        gd0Var.s();
                    }
                    if (i29 == 15) {
                    }
                    gd0Var.f0 = z10;
                    if (i29 != 3) {
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
                int i33 = gd0Var2.i0;
                de0 de0Var2 = gd0Var2.v0;
                gd0Var2.y(false);
                gd0Var2.g0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    gd0Var2.u();
                    gd0Var2.t();
                    i12 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.j10.i(i12).w(user2);
                    i13 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.j10.i(i13).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i14 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.tr.a0(i14).m1(arrayList2, null, true, true);
                    i15 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.mp.u1(i15).e4(user2, false, false);
                    i16 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                    org.telegram.messenger.ks.f(i16).k(46, new Object[0]);
                    de0Var2.getMessagesController().s4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i33 == 3) {
                        org.telegram.messenger.g0.T();
                    }
                    gd0Var2.p(new tc0(gd0Var2, i27));
                    break;
                } else {
                    gd0Var2.h0 = tL_error2.text;
                    gd0Var2.g0 = false;
                    de0Var2.N1(false, true);
                    if (i33 == 3) {
                        int i34 = gd0Var2.j0;
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
                            org.telegram.messenger.ks.e().b(gd0Var2, org.telegram.messenger.ks.j4);
                            z11 = true;
                        } else if (i33 == 2) {
                            z11 = true;
                            org.telegram.messenger.g0.C3(true);
                            org.telegram.messenger.ks.e().b(gd0Var2, org.telegram.messenger.ks.j4);
                        } else {
                            z11 = true;
                            if (i33 == 3) {
                                org.telegram.messenger.g0.B3(true);
                                org.telegram.messenger.ks.e().b(gd0Var2, org.telegram.messenger.ks.k4);
                            }
                        }
                        gd0Var2.f0 = z11;
                        if (i33 != 3) {
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
                            int i35 = 0;
                            while (true) {
                                br brVar = gd0Var2.f;
                                er[] erVarArr = brVar.f;
                                if (i35 >= erVarArr.length) {
                                    brVar.e = false;
                                    erVarArr[0].requestFocus();
                                    break;
                                } else {
                                    erVarArr[i35].setText("");
                                    i35++;
                                }
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                    if (i33 == i11) {
                        int i36 = gd0Var2.j0;
                        if (i36 != 4) {
                        }
                        gd0Var2.s();
                        if (i33 == 15) {
                        }
                        gd0Var2.f0 = z11;
                        if (i33 != 3) {
                        }
                    }
                    if (i33 == 4) {
                        int i37 = gd0Var2.j0;
                        if (i37 != i11) {
                            if (i37 != 17) {
                                break;
                            }
                        }
                        gd0Var2.s();
                    }
                    if (i33 == 15) {
                    }
                    gd0Var2.f0 = z11;
                    if (i33 != 3) {
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
                        int i38 = 0;
                        while (i38 < size) {
                            Object obj = arrayList3.get(i38);
                            i38++;
                            org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj;
                            if ((g2Var2 instanceof ml0) && g2Var2 != g2Var) {
                                g2Var2.removeSelfFromStack();
                            }
                        }
                        if (g2Var instanceof ml0) {
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
                            new org.telegram.ui.Components.lc(de0Var3.a0, null).H(R.raw.error, org.telegram.messenger.gd.a0(null, null, 2131743635, tL_error3.text));
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
                            int i39 = 0;
                            while (true) {
                                if (i39 >= arrayList4.size()) {
                                    psVar = null;
                                } else if (arrayList4.get(i39) == null || !((ps) arrayList4.get(i39)).a.equals(upperCase)) {
                                    i39++;
                                } else {
                                    psVar = (ps) arrayList4.get(i39);
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
                ff0 ff0Var = (ff0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error4 != null) {
                    ff0Var.getClass();
                    break;
                } else {
                    ff0 ff0Var2 = ff0Var.t0.a;
                    int i40 = 0;
                    while (true) {
                        ArrayList arrayList5 = ff0Var2.k0;
                        if (i40 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i40)).link.equals(tL_chatInviteExported.link)) {
                            xe0 l02 = ff0Var2.l0();
                            arrayList5.remove(i40);
                            ff0Var2.n0(l02);
                            break;
                        } else {
                            i40++;
                        }
                    }
                }
            case 8:
                org.telegram.messenger.g0.g3(new fe0(i26, (org.telegram.ui.Components.rh) this.d, org.telegram.messenger.tr.a0(((fh0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                fh0 fh0Var = (fh0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.Components.rh rhVar = (org.telegram.ui.Components.rh) this.d;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    org.telegram.messenger.mp.u1(fh0Var.a).f4(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.mp.u1(fh0Var.a).Z3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.n5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = org.telegram.messenger.mp.u1(fh0Var.a).c2(Long.valueOf(o4));
                        rhVar.a(user);
                        break;
                    }
                }
                user = null;
                rhVar.a(user);
            case 10:
                sh0 sh0Var2 = (sh0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = sh0Var2.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new kg0(sh0Var2, new ArrayList(), new ArrayList(), new ArrayList(), 1));
                    break;
                } else {
                    String T02 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
                    if (lowerCase.equals(T02) || T02.length() == 0) {
                        T02 = null;
                    }
                    int i41 = (T02 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i41];
                    strArr2[0] = lowerCase;
                    if (T02 != null) {
                        strArr2[1] = T02;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i42 = 0;
                    while (i42 < arrayList6.size()) {
                        uh0 uh0Var = (uh0) arrayList6.get(i42);
                        if (org.telegram.messenger.n5.C(uh0Var.d)) {
                            notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                            TLRPC.EncryptedChat c12 = notificationsCustomSettingsActivity2.getMessagesController().c1(Integer.valueOf((int) (uh0Var.d & 4294967295L)));
                            if (c12 != null) {
                                arrayList = arrayList6;
                                TLRPC.User c22 = notificationsCustomSettingsActivity.getMessagesController().c2(Long.valueOf(c12.user_id));
                                if (c22 != null) {
                                    strArr3[z14 ? 1 : 0] = org.telegram.messenger.i5.m(z14 ? 1 : 0, c22.first_name, c22.last_name);
                                    strArr3[1] = org.telegram.messenger.o10.o(c22);
                                }
                            } else {
                                arrayList = arrayList6;
                            }
                        } else {
                            arrayList = arrayList6;
                            notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                            if (org.telegram.messenger.n5.E(uh0Var.d)) {
                                TLRPC.User c23 = notificationsCustomSettingsActivity.getMessagesController().c2(Long.valueOf(uh0Var.d));
                                if (c23 != null && !c23.deleted) {
                                    strArr3[z14 ? 1 : 0] = org.telegram.messenger.i5.m(z14 ? 1 : 0, c23.first_name, c23.last_name);
                                    strArr3[1] = org.telegram.messenger.o10.o(c23);
                                    z13 = true;
                                    chat = c23;
                                    String str5 = strArr3[z14 ? 1 : 0];
                                    strArr3[z14 ? 1 : 0] = str5.toLowerCase();
                                    sh0Var = sh0Var2;
                                    strArr = strArr2;
                                    T0 = org.telegram.messenger.gd.E0().T0(strArr3[z14 ? 1 : 0], z13, z14);
                                    str = strArr3[z14 ? 1 : 0];
                                    if (str != null && str.equals(T0)) {
                                        T0 = null;
                                    }
                                    int i43 = z14 ? 1 : 0;
                                    i19 = i43;
                                    while (i19 < i41) {
                                        r25 = z14 ? 1 : 0;
                                        String str6 = strArr[i19];
                                        int i44 = i43;
                                        String str7 = strArr3[r25];
                                        i18 = i41;
                                        if ((str7 == null || !(str7.startsWith(str6) || i5.c.B(" ", str6, strArr3[r25]))) && (T0 == null || !(T0.startsWith(str6) || i5.c.B(" ", str6, T0)))) {
                                            i20 = 1;
                                            String str8 = strArr3[1];
                                            i21 = (str8 == null || !str8.startsWith(str6)) ? i44 : 2;
                                        } else {
                                            i20 = 1;
                                            i21 = 1;
                                        }
                                        if (i21 != 0) {
                                            if (i21 == i20) {
                                                arrayList9.add(org.telegram.messenger.g0.r0(str5, null, str6));
                                            } else {
                                                arrayList9.add(org.telegram.messenger.g0.r0("@" + strArr3[i20], null, "@" + str6));
                                            }
                                            arrayList8.add(uh0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i19++;
                                            i43 = i21;
                                            i41 = i18;
                                            z14 = r25;
                                        }
                                    }
                                    i18 = i41;
                                    r25 = z14;
                                }
                                sh0Var = sh0Var2;
                                i18 = i41;
                                strArr = strArr2;
                                r25 = z14;
                            } else {
                                TLRPC.Chat O0 = notificationsCustomSettingsActivity.getMessagesController().O0(Long.valueOf(-uh0Var.d));
                                if (O0 != null) {
                                    if (!O0.left && !O0.kicked && O0.migrated_to == null) {
                                        strArr3[z14 ? 1 : 0] = O0.title;
                                        z13 = true;
                                        strArr3[1] = org.telegram.messenger.v3.K(O0, z14);
                                        chat = O0;
                                        String str52 = strArr3[z14 ? 1 : 0];
                                        strArr3[z14 ? 1 : 0] = str52.toLowerCase();
                                        sh0Var = sh0Var2;
                                        strArr = strArr2;
                                        T0 = org.telegram.messenger.gd.E0().T0(strArr3[z14 ? 1 : 0], z13, z14);
                                        str = strArr3[z14 ? 1 : 0];
                                        if (str != null) {
                                            T0 = null;
                                        }
                                        int i432 = z14 ? 1 : 0;
                                        i19 = i432;
                                        while (i19 < i41) {
                                        }
                                        i18 = i41;
                                        r25 = z14;
                                    }
                                    sh0Var = sh0Var2;
                                    i18 = i41;
                                    strArr = strArr2;
                                    r25 = z14;
                                }
                            }
                            i42++;
                            arrayList6 = arrayList;
                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                            sh0Var2 = sh0Var;
                            strArr2 = strArr;
                            i41 = i18;
                            z14 = r25;
                        }
                        z13 = true;
                        chat = null;
                        String str522 = strArr3[z14 ? 1 : 0];
                        strArr3[z14 ? 1 : 0] = str522.toLowerCase();
                        sh0Var = sh0Var2;
                        strArr = strArr2;
                        T0 = org.telegram.messenger.gd.E0().T0(strArr3[z14 ? 1 : 0], z13, z14);
                        str = strArr3[z14 ? 1 : 0];
                        if (str != null) {
                        }
                        int i4322 = z14 ? 1 : 0;
                        i19 = i4322;
                        while (i19 < i41) {
                        }
                        i18 = i41;
                        r25 = z14;
                        i42++;
                        arrayList6 = arrayList;
                        notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                        sh0Var2 = sh0Var;
                        strArr2 = strArr;
                        i41 = i18;
                        z14 = r25;
                    }
                    org.telegram.messenger.g0.g3(new kg0(sh0Var2, arrayList8, arrayList9, arrayList7, 1));
                    break;
                }
                break;
            case 11:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 12:
                hk0 hk0Var = (hk0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                hk0Var.B1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject6;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                    alertDialog$Builder.a.U = org.telegram.messenger.gd.a0("RestoreEmailSent", null, 2131745884, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131745882, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new aj0(i28, hk0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = hk0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error5.text).intValue();
                    hk0Var.Q1(org.telegram.messenger.gd.N0(R.string.AppName, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                    break;
                } else {
                    hk0Var.Q1(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error5.text);
                    break;
                }
                break;
            case 13:
                ((wj0) this.b).d(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 14:
                vj0 vj0Var = (vj0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                hk0 hk0Var2 = vj0Var.e;
                secureRandom.setSeed(hk0Var2.K.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = hk0Var2.K;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.jv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = hk0.t1();
                hk0Var2.d1 = t12;
                hk0Var2.c1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = hk0Var2.K.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.g0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    hk0Var2.f1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(hk0Var2.f1, 32, bArr3, 0, 16);
                    byte[] bArr4 = hk0Var2.d1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = hk0Var2.d1;
                    tL_secureSecretSettings.secure_secret_id = hk0Var2.c1;
                    passwordinputsettings.flags |= 4;
                }
                i22 = ((org.telegram.ui.ActionBar.g2) hk0Var2).currentAccount;
                ConnectionsManager.getInstance(i22).sendRequest(updatepasswordsettings, new tj0(vj0Var, i28));
                break;
            case 15:
                dk0 dk0Var = (dk0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i45 = dk0Var.M;
                hk0 hk0Var3 = dk0Var.R;
                hk0Var3.B1();
                dk0Var.K = false;
                if (tL_error6 == null) {
                    dk0Var.r();
                    dk0Var.q();
                    ((mj0) hk0Var3.C1).c(hk0Var3.F, (String) hk0Var3.t1.get("phone"), null, null, null, null, null, null, null, null, new ui0(hk0Var3, i26), null);
                    break;
                } else {
                    dk0Var.L = tL_error6.text;
                    if ((i45 == 3 && ((i25 = dk0Var.N) == 4 || i25 == 2)) || ((i45 == 2 && ((i23 = dk0Var.N) == 4 || i23 == 3)) || (i45 == 4 && dk0Var.N == 2))) {
                        dk0Var.p();
                    }
                    if (i45 == 2) {
                        org.telegram.messenger.g0.C3(true);
                        org.telegram.messenger.ks.e().b(dk0Var, org.telegram.messenger.ks.j4);
                    } else if (i45 == 3) {
                        org.telegram.messenger.g0.B3(true);
                        org.telegram.messenger.ks.e().b(dk0Var, org.telegram.messenger.ks.k4);
                    }
                    dk0Var.J = true;
                    if (i45 != 3) {
                        i24 = ((org.telegram.ui.ActionBar.g2) hk0Var3).currentAccount;
                        org.telegram.ui.Components.c5.c0(i24, tL_error6, hk0Var3, verifyphone, new Object[0]);
                    }
                    hk0Var3.R1(true, false);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            dk0Var.c(true);
                            hk0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i46 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = dk0Var.d;
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
                ml0.Z((ml0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 17:
                ml0.g0((ml0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 18:
                ml0 ml0Var = (ml0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                fe0 fe0Var = (fe0) this.d;
                ml0Var.F0 = tL_payments_validatedRequestedInfo;
                fe0Var.run();
                ml0Var.J0(false);
                ml0Var.N0(true, false);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                hn0 hn0Var = (hn0) this.d;
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                org.telegram.messenger.g0.r(hn0Var);
                org.telegram.messenger.g0.h3(hn0Var, 800L);
                break;
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.Z8;
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
                boolean[] zArr = (boolean[]) this.c;
                do0 do0Var = (do0) this.d;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.x3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    do0Var.run();
                    break;
                }
                break;
            case 22:
                eq0 eq0Var = (eq0) this.b;
                eq0 eq0Var2 = (eq0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = eq0Var.d;
                if (photoViewer4.E != null && eq0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f10 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = eq0Var.d;
                    photoViewer4.r8 = (long) ((f10 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = eq0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.C3();
                        if (eq0Var.d.Y7 > eq0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = eq0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = eq0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.v51 v51Var = photoViewer8.k1;
                            boolean z15 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = eq0Var.d;
                            v51Var.a(Math.min(photoViewer9.e8, eq0Var.d.f8), z15, photoViewer9.r);
                        }
                        if (org.telegram.messenger.s2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(eq0Var.d.Z7);
                            sb3.append(" w = ");
                            sb3.append(eq0Var.d.c8);
                            sb3.append(" h = ");
                            sb3.append(eq0Var.d.d8);
                            sb3.append(" r = ");
                            i5.c.t(eq0Var.d.b8, sb3);
                        }
                        eq0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = eq0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.k1.a(Math.min(photoViewer10.e8, eq0Var.d.f8), false, photoViewer10.r);
                        }
                        eq0Var.d.Z7 = 0;
                    }
                    eq0Var.d.A3();
                    eq0Var.d.v3();
                    break;
                }
                break;
            case 23:
                as0 as0Var = (as0) this.b;
                bn bnVar = (bn) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.fj fjVar = as0Var.I;
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
                as0Var.c(false);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.lc.e0(tL_error7);
                    break;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.f3.o(null, 2131743636, org.telegram.ui.Components.lc.b0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                RectF rectF = ProfileActivity.Z6;
                if (org.telegram.messenger.g0.g(str11)) {
                    org.telegram.ui.Components.lc.b0(profileActivity).i(str12).j();
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
                for (int i47 = 0; i47 < size2; i47++) {
                    TLRPC.User user3 = (TLRPC.User) arrayList10.get(i47);
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
                            tL_chatParticipant.inviter_id = org.telegram.messenger.j10.i(profileActivity2.getAccountInstance().a).n;
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
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.c;
                bn bnVar2 = (bn) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.ui.Components.yn ynVar = coVar.e;
                ViewGroup viewGroup = (ViewGroup) bnVar2.fragmentView;
                RectF rectF4 = jh.k.h;
                jh.k.c(ynVar, viewGroup, rectF4);
                profileActivity3.k6 = rectF4.left;
                profileActivity3.d4();
                break;
            case 28:
                org.telegram.ui.Components.lc.D((lb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
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
                ai.l0 l0Var = secretMediaViewer.e;
                if (l0Var != null) {
                    l0Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    nz0 nz0Var = secretMediaViewer.n;
                    TLRPC.Message message2 = fjVar2.k;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    nz0Var.e = false;
                    nz0Var.f = j3;
                    nz0Var.h = j10;
                    nz0Var.n.start();
                    nz0Var.invalidate();
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
