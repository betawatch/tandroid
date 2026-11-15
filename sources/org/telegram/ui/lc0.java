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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a69, code lost:
    
        if (r3 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a73, code lost:
    
        if (r3 == 3) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a81, code lost:
    
        if (r3 == 16) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0ba6, code lost:
    
        if (r7 != 16) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0bb0, code lost:
    
        if (r7 == 3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0bbe, code lost:
    
        if (r7 == 16) goto L445;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0bd3  */
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
        int i18;
        boolean z13;
        boolean z14;
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
        boolean z15;
        int i24;
        int i25;
        TLRPC.Message message;
        int i26 = 5;
        int i27 = 3;
        int i28 = 2;
        qm qmVar = null;
        switch (this.a) {
            case 0:
                oc0 oc0Var = (oc0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oc0Var.O = fileLocation;
                oc0Var.P = photoSize2.location;
                oc0Var.e.j(org.telegram.messenger.gc.e(fileLocation), "50_50", oc0Var.f, null);
                break;
            case 1:
                ed0 ed0Var = (ed0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i29 = ed0Var.i0;
                ce0 ce0Var = ed0Var.v0;
                ed0Var.y(false);
                ed0Var.g0 = false;
                if (tL_error == null) {
                    Activity parentActivity = ce0Var.getParentActivity();
                    if (parentActivity != null) {
                        ed0Var.p(new g50(26, ed0Var, parentActivity));
                        break;
                    }
                } else {
                    ed0Var.h0 = tL_error.text;
                    if (i29 == 3) {
                        int i30 = ed0Var.j0;
                        if (i30 != 4) {
                            i7 = 2;
                            if (i30 != 2) {
                                if (i30 != 17) {
                                    break;
                                }
                            }
                        }
                        ed0Var.s();
                        if (i29 == 15) {
                            org.telegram.messenger.ns.e().b(ed0Var, org.telegram.messenger.ns.g4);
                            z10 = true;
                        } else if (i29 == 2) {
                            z10 = true;
                            org.telegram.messenger.g0.D3(true);
                            org.telegram.messenger.ns.e().b(ed0Var, org.telegram.messenger.ns.g4);
                        } else {
                            z10 = true;
                            if (i29 == 3) {
                                org.telegram.messenger.g0.C3(true);
                                org.telegram.messenger.ns.e().b(ed0Var, org.telegram.messenger.ns.h4);
                            }
                        }
                        ed0Var.f0 = z10;
                        if (i29 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                            org.telegram.ui.Components.t4.c0(i10, tL_error, ce0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            ed0Var.w();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ed0Var.c(true);
                            ce0Var.M1(0, true, null, true);
                            break;
                        }
                    } else {
                        i7 = 2;
                    }
                    if (i29 == i7) {
                        int i31 = ed0Var.j0;
                        if (i31 != 4) {
                        }
                        ed0Var.s();
                        if (i29 == 15) {
                        }
                        ed0Var.f0 = z10;
                        if (i29 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        ed0Var.w();
                    }
                    if (i29 == 4) {
                        int i32 = ed0Var.j0;
                        if (i32 != i7) {
                            if (i32 != 17) {
                                break;
                            }
                        }
                        ed0Var.s();
                    }
                    if (i29 == 15) {
                    }
                    ed0Var.f0 = z10;
                    if (i29 != 3) {
                    }
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    ed0Var.w();
                }
                break;
            case 2:
                ed0 ed0Var2 = (ed0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i33 = ed0Var2.i0;
                ce0 ce0Var2 = ed0Var2.v0;
                ed0Var2.y(false);
                ed0Var2.g0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    ed0Var2.u();
                    ed0Var2.t();
                    i12 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                    org.telegram.messenger.m10.i(i12).w(user2);
                    i13 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                    org.telegram.messenger.m10.i(i13).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i14 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                    org.telegram.messenger.vr.a0(i14).m1(arrayList2, null, true, true);
                    i15 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                    org.telegram.messenger.np.s1(i15).X3(user2, false, false);
                    i16 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                    org.telegram.messenger.ns.f(i16).k(46, new Object[0]);
                    ce0Var2.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i33 == 3) {
                        org.telegram.messenger.g0.T();
                    }
                    ed0Var2.p(new sc0(ed0Var2, i26));
                    break;
                } else {
                    ed0Var2.h0 = tL_error2.text;
                    ed0Var2.g0 = false;
                    ce0Var2.N1(false, true);
                    if (i33 == 3) {
                        int i34 = ed0Var2.j0;
                        if (i34 != 4) {
                            i11 = 2;
                            if (i34 != 2) {
                                if (i34 != 17) {
                                    break;
                                }
                            }
                        }
                        ed0Var2.s();
                        if (i33 == 15) {
                            org.telegram.messenger.ns.e().b(ed0Var2, org.telegram.messenger.ns.g4);
                            z11 = true;
                        } else if (i33 == 2) {
                            z11 = true;
                            org.telegram.messenger.g0.D3(true);
                            org.telegram.messenger.ns.e().b(ed0Var2, org.telegram.messenger.ns.g4);
                        } else {
                            z11 = true;
                            if (i33 == 3) {
                                org.telegram.messenger.g0.C3(true);
                                org.telegram.messenger.ns.e().b(ed0Var2, org.telegram.messenger.ns.h4);
                            }
                        }
                        ed0Var2.f0 = z11;
                        if (i33 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                ed0Var2.w();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                ed0Var2.c(true);
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, "FloodWait"));
                            } else {
                                String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.ui.Cells.y0.r("ErrorOccurred", 2131751105, sb2, "\n");
                                sb2.append(tL_error2.text);
                                ce0Var2.D1(M0, sb2.toString());
                            }
                            int i35 = 0;
                            while (true) {
                                ar arVar = ed0Var2.f;
                                dr[] drVarArr = arVar.f;
                                if (i35 >= drVarArr.length) {
                                    arVar.e = false;
                                    drVarArr[0].requestFocus();
                                    break;
                                } else {
                                    drVarArr[i35].setText("");
                                    i35++;
                                }
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                    if (i33 == i11) {
                        int i36 = ed0Var2.j0;
                        if (i36 != 4) {
                        }
                        ed0Var2.s();
                        if (i33 == 15) {
                        }
                        ed0Var2.f0 = z11;
                        if (i33 != 3) {
                        }
                    }
                    if (i33 == 4) {
                        int i37 = ed0Var2.j0;
                        if (i37 != i11) {
                            if (i37 != 17) {
                                break;
                            }
                        }
                        ed0Var2.s();
                    }
                    if (i33 == 15) {
                    }
                    ed0Var2.f0 = z11;
                    if (i33 != 3) {
                    }
                }
                break;
            case 3:
                ed0 ed0Var3 = (ed0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                ed0Var3.r0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                ed0Var3.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    ed0Var3.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    ed0Var3.j0 = 16;
                }
                ed0Var3.v0.y1(bundle, tL_auth_sentCode, true);
                break;
            case 4:
                kd0 kd0Var = (kd0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                hi.d dVar = kd0Var.b;
                ce0 ce0Var3 = kd0Var.w;
                kd0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    kd0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.o4 parentLayout = ce0Var3.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.e2) r.b.h(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i38 = 0;
                        while (i38 < size) {
                            Object obj = arrayList3.get(i38);
                            i38++;
                            org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj;
                            if ((e2Var2 instanceof jl0) && e2Var2 != e2Var) {
                                e2Var2.removeSelfFromStack();
                            }
                        }
                        if (e2Var instanceof jl0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ce0Var3.y1(kd0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                            break;
                        }
                    }
                    z12 = true;
                    ce0Var3.y1(kd0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            kd0Var.e = tL_error3.text;
                            kd0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.cc(ce0Var3.a0, null).H(R.raw.error, org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error3.text));
                            break;
                        } else {
                            ce0Var3.M1(0, true, null, true);
                            ce0Var3.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new fd0(kd0Var, 0), Integer.parseInt(tL_error3.text.substring(11)) * 1000);
                        break;
                    }
                }
                break;
            case 5:
                kd0 kd0Var2 = (kd0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                ce0 ce0Var4 = kd0Var2.w;
                ce0Var4.e = true;
                ce0 ce0Var5 = (ce0) LaunchActivity.L();
                if (ce0Var5 == null) {
                    i17 = ((org.telegram.ui.ActionBar.e2) ce0Var4).currentAccount;
                    ce0Var5 = new ce0(i17);
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
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
                        ArrayList arrayList4 = be0Var.H;
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
                                zd0Var.setText(psVar.c);
                                be0Var.F = 0;
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
                    cf0 cf0Var2 = cf0Var.t0.a;
                    int i40 = 0;
                    while (true) {
                        ArrayList arrayList5 = cf0Var2.k0;
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
                org.telegram.messenger.g0.h3(new jd0(9, (org.telegram.ui.Components.gh) this.d, org.telegram.messenger.vr.a0(((bh0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                bh0 bh0Var = (bh0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.Components.gh ghVar = (org.telegram.ui.Components.gh) this.d;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    org.telegram.messenger.np.s1(bh0Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.np.s1(bh0Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = org.telegram.messenger.np.s1(bh0Var.a).a2(Long.valueOf(o4));
                        ghVar.a(user);
                        break;
                    }
                }
                user = null;
                ghVar.a(user);
            case 10:
                oh0 oh0Var = (oh0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = oh0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(oh0Var, new ArrayList(), new ArrayList(), new ArrayList(), 27));
                    break;
                } else {
                    String S02 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                        qh0 qh0Var = (qh0) arrayList6.get(i42);
                        if (org.telegram.messenger.m5.C(qh0Var.d)) {
                            TLRPC.EncryptedChat a12 = notificationsCustomSettingsActivity2.getMessagesController().a1(Integer.valueOf((int) (qh0Var.d & 4294967295L)));
                            if (a12 != null) {
                                i18 = i41;
                                TLRPC.User a22 = notificationsCustomSettingsActivity2.getMessagesController().a2(Long.valueOf(a12.user_id));
                                if (a22 != null) {
                                    strArr4[0] = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                                    strArr4[1] = org.telegram.messenger.q10.n(a22);
                                }
                            } else {
                                i18 = i41;
                            }
                        } else {
                            i18 = i41;
                            if (org.telegram.messenger.m5.E(qh0Var.d)) {
                                TLRPC.User a23 = notificationsCustomSettingsActivity2.getMessagesController().a2(Long.valueOf(qh0Var.d));
                                if (a23 != null && !a23.deleted) {
                                    strArr4[0] = org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name);
                                    strArr4[1] = org.telegram.messenger.q10.n(a23);
                                    z14 = true;
                                    z13 = false;
                                    chat = a23;
                                    String str5 = strArr4[z13 ? 1 : 0];
                                    strArr4[z13 ? 1 : 0] = str5.toLowerCase();
                                    strArr = strArr3;
                                    arrayList = arrayList6;
                                    S0 = org.telegram.messenger.hd.E0().S0(strArr4[z13 ? 1 : 0], z14, z13);
                                    str = strArr4[z13 ? 1 : 0];
                                    if (str != null && str.equals(S0)) {
                                        S0 = null;
                                    }
                                    int i43 = z13 ? 1 : 0;
                                    i19 = i43;
                                    while (i19 < i18) {
                                        ?? r21 = z13;
                                        String str6 = strArr[i19];
                                        int i44 = i43;
                                        String str7 = strArr4[r21];
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                        if ((str7 == null || !(str7.startsWith(str6) || i5.c.A(" ", str6, strArr4[r21]))) && (S0 == null || !(S0.startsWith(str6) || i5.c.A(" ", str6, S0)))) {
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
                                            arrayList8.add(qh0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i19++;
                                            i43 = i21;
                                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                                            z13 = false;
                                        }
                                    }
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                }
                                strArr = strArr3;
                                arrayList = arrayList6;
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                            } else {
                                TLRPC.Chat M02 = notificationsCustomSettingsActivity2.getMessagesController().M0(Long.valueOf(-qh0Var.d));
                                if (M02 != null) {
                                    if (!M02.left && !M02.kicked && M02.migrated_to == null) {
                                        z13 = false;
                                        strArr4[0] = M02.title;
                                        z14 = true;
                                        strArr4[1] = org.telegram.messenger.t3.K(M02, false);
                                        chat = M02;
                                        String str52 = strArr4[z13 ? 1 : 0];
                                        strArr4[z13 ? 1 : 0] = str52.toLowerCase();
                                        strArr = strArr3;
                                        arrayList = arrayList6;
                                        S0 = org.telegram.messenger.hd.E0().S0(strArr4[z13 ? 1 : 0], z14, z13);
                                        str = strArr4[z13 ? 1 : 0];
                                        if (str != null) {
                                            S0 = null;
                                        }
                                        int i432 = z13 ? 1 : 0;
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
                        z14 = true;
                        z13 = false;
                        chat = null;
                        String str522 = strArr4[z13 ? 1 : 0];
                        strArr4[z13 ? 1 : 0] = str522.toLowerCase();
                        strArr = strArr3;
                        arrayList = arrayList6;
                        S0 = org.telegram.messenger.hd.E0().S0(strArr4[z13 ? 1 : 0], z14, z13);
                        str = strArr4[z13 ? 1 : 0];
                        if (str != null) {
                        }
                        int i4322 = z13 ? 1 : 0;
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(oh0Var, arrayList8, arrayList9, arrayList7, 27));
                    break;
                }
                break;
            case 11:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 12:
                ek0 ek0Var = (ek0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                ek0Var.B1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject6;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                    alertDialog$Builder.a.U = org.telegram.messenger.hd.a0("RestoreEmailSent", null, 2131746080, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131746078, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new xi0(i27, ek0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = ek0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error5.text).intValue();
                    if (intValue < 60) {
                        c10 = 0;
                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        c10 = 0;
                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    String M03 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                    Object[] objArr = new Object[1];
                    objArr[c10] = G;
                    ek0Var.Q1(M03, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, objArr));
                    break;
                } else {
                    ek0Var.Q1(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error5.text);
                    break;
                }
                break;
            case 13:
                ((tj0) this.b).d(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 14:
                sj0 sj0Var = (sj0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                ek0 ek0Var2 = sj0Var.e;
                secureRandom.setSeed(ek0Var2.K.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = ek0Var2.K;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.nv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = ek0.t1();
                ek0Var2.d1 = t12;
                ek0Var2.c1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = ek0Var2.K.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.g0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    ek0Var2.f1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(ek0Var2.f1, 32, bArr3, 0, 16);
                    byte[] bArr4 = ek0Var2.d1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = ek0Var2.d1;
                    tL_secureSecretSettings.secure_secret_id = ek0Var2.c1;
                    passwordinputsettings.flags |= 4;
                }
                i22 = ((org.telegram.ui.ActionBar.e2) ek0Var2).currentAccount;
                ConnectionsManager.getInstance(i22).sendRequest(updatepasswordsettings, new qj0(sj0Var, i28));
                break;
            case 15:
                ak0 ak0Var = (ak0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i45 = ak0Var.M;
                ek0 ek0Var3 = ak0Var.R;
                ek0Var3.B1();
                ak0Var.K = false;
                if (tL_error6 == null) {
                    ak0Var.r();
                    ak0Var.q();
                    ((jj0) ek0Var3.C1).c(ek0Var3.F, (String) ek0Var3.t1.get("phone"), null, null, null, null, null, null, null, null, new ri0(ek0Var3, 6), null);
                    break;
                } else {
                    ak0Var.L = tL_error6.text;
                    if ((i45 == 3 && ((i25 = ak0Var.N) == 4 || i25 == 2)) || ((i45 == 2 && ((i23 = ak0Var.N) == 4 || i23 == 3)) || (i45 == 4 && ak0Var.N == 2))) {
                        ak0Var.p();
                    }
                    if (i45 == 2) {
                        org.telegram.messenger.g0.D3(true);
                        org.telegram.messenger.ns.e().b(ak0Var, org.telegram.messenger.ns.g4);
                    } else if (i45 == 3) {
                        org.telegram.messenger.g0.C3(true);
                        org.telegram.messenger.ns.e().b(ak0Var, org.telegram.messenger.ns.h4);
                    }
                    ak0Var.J = true;
                    if (i45 != 3) {
                        i24 = ((org.telegram.ui.ActionBar.e2) ek0Var3).currentAccount;
                        z15 = false;
                        org.telegram.ui.Components.t4.c0(i24, tL_error6, ek0Var3, verifyphone, new Object[0]);
                    } else {
                        z15 = false;
                    }
                    ek0Var3.R1(true, z15);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            ak0Var.c(true);
                            ek0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i46 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = ak0Var.d;
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
                jl0.Z((jl0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 17:
                jl0.g0((jl0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 18:
                jl0 jl0Var = (jl0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                jd0 jd0Var = (jd0) this.d;
                jl0Var.F0 = tL_payments_validatedRequestedInfo;
                jd0Var.run();
                jl0Var.J0(false);
                jl0Var.N0(true, false);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                dn0 dn0Var = (dn0) this.d;
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                org.telegram.messenger.g0.r(dn0Var);
                org.telegram.messenger.g0.i3(dn0Var, 800L);
                break;
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer2.getClass();
                icVar.a();
                if (str10.equals(photoViewer2.C4.R)) {
                    photoViewer2.w4 = 2;
                    photoViewer2.x4 = str10;
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ao0 ao0Var = (ao0) this.d;
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
                    ao0Var.run();
                    break;
                }
                break;
            case 22:
                cq0 cq0Var = (cq0) this.b;
                cq0 cq0Var2 = (cq0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = cq0Var.d;
                if (photoViewer4.E != null && cq0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f10 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = cq0Var.d;
                    photoViewer4.r8 = (long) ((f10 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = cq0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.C3();
                        if (cq0Var.d.Y7 > cq0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = cq0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = cq0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.i51 i51Var = photoViewer8.k1;
                            boolean z16 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = cq0Var.d;
                            i51Var.a(Math.min(photoViewer9.e8, cq0Var.d.f8), z16, photoViewer9.r);
                        }
                        if (org.telegram.messenger.r2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(cq0Var.d.Z7);
                            sb3.append(" w = ");
                            sb3.append(cq0Var.d.c8);
                            sb3.append(" h = ");
                            sb3.append(cq0Var.d.d8);
                            sb3.append(" r = ");
                            i5.c.r(cq0Var.d.b8, sb3);
                        }
                        cq0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = cq0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.k1.a(Math.min(photoViewer10.e8, cq0Var.d.f8), false, photoViewer10.r);
                        }
                        cq0Var.d.Z7 = 0;
                    }
                    cq0Var.d.A3();
                    cq0Var.d.v3();
                    break;
                }
                break;
            case 23:
                xr0 xr0Var = (xr0) this.b;
                an anVar = (an) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.gj gjVar = xr0Var.I;
                byte[] bArr5 = pollAnswer.option;
                if (gjVar != null && (message = gjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.gj.B0(message);
                    qmVar = new qm();
                    qmVar.a = gjVar;
                    qmVar.b = -1;
                    qmVar.c = -1;
                    qmVar.h = true;
                    qmVar.e = bArr5;
                    qmVar.f();
                }
                anVar.jc(gjVar, qmVar);
                xr0Var.c(false);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.cc.d0(tL_error7);
                    break;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.cc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                RectF rectF = ProfileActivity.X6;
                if (org.telegram.messenger.g0.g(str11)) {
                    org.telegram.ui.Components.cc.a0(profileActivity).i(str12).j();
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                RectF rectF2 = ProfileActivity.X6;
                profileActivity2.getClass();
                int size2 = arrayList10.size();
                for (int i47 = 0; i47 < size2; i47++) {
                    TLRPC.User user3 = (TLRPC.User) arrayList10.get(i47);
                    if (!hashSet.contains(Long.valueOf(user3.id))) {
                        TLRPC.ChatFull chatFull = profileActivity2.v2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (org.telegram.messenger.t3.T(profileActivity2.F2)) {
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
                            tL_chatParticipant.inviter_id = org.telegram.messenger.m10.i(profileActivity2.getAccountInstance().a).n;
                            profileActivity2.v2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity2.v2.participants_count++;
                        profileActivity2.getMessagesController().X3(user3, false, false);
                    }
                }
                profileActivity2.G5(true, false);
                break;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.c;
                an anVar2 = (an) this.d;
                RectF rectF3 = ProfileActivity.X6;
                org.telegram.ui.Components.on onVar = snVar.e;
                ViewGroup viewGroup = (ViewGroup) anVar2.fragmentView;
                RectF rectF4 = jh.k.h;
                jh.k.c(onVar, viewGroup, rectF4);
                profileActivity3.i6 = rectF4.left;
                profileActivity3.c4();
                break;
            case 28:
                org.telegram.ui.Components.cc.D((lb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.d;
                secretMediaViewer.l0 = 0;
                secretMediaViewer.J0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ai.j0 j0Var = secretMediaViewer.e;
                if (j0Var != null) {
                    j0Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    iz0 iz0Var = secretMediaViewer.n;
                    TLRPC.Message message2 = gjVar2.k;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    iz0Var.e = false;
                    iz0Var.f = j3;
                    iz0Var.h = j10;
                    iz0Var.n.start();
                    iz0Var.invalidate();
                    if (secretMediaViewer.g1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.p1 && org.telegram.messenger.np.e1().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.m();
                        break;
                    }
                }
                break;
        }
    }
}
