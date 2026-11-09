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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oc0(Object obj, Object obj2, Object obj3, int i7) {
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
        os osVar;
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
        sm smVar = null;
        switch (this.a) {
            case 0:
                rc0 rc0Var = (rc0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                rc0Var.N = fileLocation;
                rc0Var.O = photoSize2.location;
                rc0Var.e.j(org.telegram.messenger.hc.e(fileLocation), "50_50", rc0Var.f, null);
                break;
            case 1:
                id0 id0Var = (id0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i28 = id0Var.h0;
                ee0 ee0Var = id0Var.u0;
                int i29 = 0;
                id0Var.y(false);
                id0Var.f0 = false;
                if (tL_error == null) {
                    Activity parentActivity = ee0Var.getParentActivity();
                    if (parentActivity != null) {
                        id0Var.p(new bd0(i29, id0Var, parentActivity));
                        break;
                    }
                } else {
                    id0Var.g0 = tL_error.text;
                    if (i28 == 3) {
                        int i30 = id0Var.i0;
                        if (i30 != 4) {
                            i7 = 2;
                            if (i30 != 2) {
                                if (i30 != 17) {
                                    break;
                                }
                            }
                        }
                        id0Var.s();
                        if (i28 == 15) {
                            org.telegram.messenger.qs.e().b(id0Var, org.telegram.messenger.qs.g4);
                            z9 = true;
                        } else if (i28 == 2) {
                            z9 = true;
                            org.telegram.messenger.g0.E3(true);
                            org.telegram.messenger.qs.e().b(id0Var, org.telegram.messenger.qs.g4);
                        } else {
                            z9 = true;
                            if (i28 == 3) {
                                org.telegram.messenger.g0.D3(true);
                                org.telegram.messenger.qs.e().b(id0Var, org.telegram.messenger.qs.h4);
                            }
                        }
                        id0Var.e0 = z9;
                        if (i28 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                            org.telegram.ui.Components.v4.c0(i10, tL_error, ee0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            id0Var.w();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            id0Var.c(true);
                            ee0Var.M1(0, true, null, true);
                            break;
                        }
                    } else {
                        i7 = 2;
                    }
                    if (i28 == i7) {
                        int i31 = id0Var.i0;
                        if (i31 != 4) {
                        }
                        id0Var.s();
                        if (i28 == 15) {
                        }
                        id0Var.e0 = z9;
                        if (i28 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        id0Var.w();
                    }
                    if (i28 == 4) {
                        int i32 = id0Var.i0;
                        if (i32 != i7) {
                            if (i32 != 17) {
                                break;
                            }
                        }
                        id0Var.s();
                    }
                    if (i28 == 15) {
                    }
                    id0Var.e0 = z9;
                    if (i28 != 3) {
                    }
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    id0Var.w();
                }
                break;
            case 2:
                id0 id0Var2 = (id0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i33 = id0Var2.h0;
                ee0 ee0Var2 = id0Var2.u0;
                id0Var2.y(false);
                id0Var2.f0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    id0Var2.u();
                    id0Var2.t();
                    i12 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                    org.telegram.messenger.p10.i(i12).w(user2);
                    i13 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                    org.telegram.messenger.p10.i(i13).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i14 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                    org.telegram.messenger.yr.a0(i14).m1(arrayList2, null, true, true);
                    i15 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                    org.telegram.messenger.qp.s1(i15).X3(user2, false, false);
                    i16 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                    org.telegram.messenger.qs.f(i16).k(46, new Object[0]);
                    ee0Var2.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i33 == 3) {
                        org.telegram.messenger.g0.T();
                    }
                    id0Var2.p(new vc0(id0Var2, i26));
                    break;
                } else {
                    id0Var2.g0 = tL_error2.text;
                    id0Var2.f0 = false;
                    ee0Var2.N1(false, true);
                    if (i33 == 3) {
                        int i34 = id0Var2.i0;
                        if (i34 != 4) {
                            i11 = 2;
                            if (i34 != 2) {
                                if (i34 != 17) {
                                    break;
                                }
                            }
                        }
                        id0Var2.s();
                        if (i33 == 15) {
                            org.telegram.messenger.qs.e().b(id0Var2, org.telegram.messenger.qs.g4);
                            z10 = true;
                        } else if (i33 == 2) {
                            z10 = true;
                            org.telegram.messenger.g0.E3(true);
                            org.telegram.messenger.qs.e().b(id0Var2, org.telegram.messenger.qs.g4);
                        } else {
                            z10 = true;
                            if (i33 == 3) {
                                org.telegram.messenger.g0.D3(true);
                                org.telegram.messenger.qs.e().b(id0Var2, org.telegram.messenger.qs.h4);
                            }
                        }
                        id0Var2.e0 = z10;
                        if (i33 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                id0Var2.w();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                id0Var2.c(true);
                                ee0Var2.M1(0, true, null, true);
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                            } else {
                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                sb2.append(tL_error2.text);
                                ee0Var2.D1(M0, sb2.toString());
                            }
                            int i35 = 0;
                            while (true) {
                                ar arVar = id0Var2.f;
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
                        int i36 = id0Var2.i0;
                        if (i36 != 4) {
                        }
                        id0Var2.s();
                        if (i33 == 15) {
                        }
                        id0Var2.e0 = z10;
                        if (i33 != 3) {
                        }
                    }
                    if (i33 == 4) {
                        int i37 = id0Var2.i0;
                        if (i37 != i11) {
                            if (i37 != 17) {
                                break;
                            }
                        }
                        id0Var2.s();
                    }
                    if (i33 == 15) {
                    }
                    id0Var2.e0 = z10;
                    if (i33 != 3) {
                    }
                }
                break;
            case 3:
                id0 id0Var3 = (id0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                id0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                id0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    id0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    id0Var3.i0 = 16;
                }
                id0Var3.u0.y1(bundle, tL_auth_sentCode, true);
                break;
            case 4:
                nd0 nd0Var = (nd0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                fi.d dVar = nd0Var.b;
                ee0 ee0Var3 = nd0Var.w;
                nd0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    nd0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.q4 parentLayout = ee0Var3.getParentLayout();
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
                            if ((f2Var2 instanceof jl0) && f2Var2 != f2Var) {
                                f2Var2.removeSelfFromStack();
                            }
                        }
                        if (f2Var instanceof jl0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ee0Var3.y1(nd0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    ee0Var3.y1(nd0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            nd0Var.e = tL_error3.text;
                            nd0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.hc(ee0Var3.Z, null).H(R.raw.error, org.telegram.messenger.id.a0(null, null, 2131743878, tL_error3.text));
                            break;
                        } else {
                            ee0Var3.M1(0, true, null, true);
                            ee0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new jd0(nd0Var, 0), Integer.parseInt(tL_error3.text.substring(11)) * 1000);
                        break;
                    }
                }
                break;
            case 5:
                nd0 nd0Var2 = (nd0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                ee0 ee0Var4 = nd0Var2.w;
                ee0Var4.e = true;
                ee0 ee0Var5 = (ee0) LaunchActivity.L();
                if (ee0Var5 == null) {
                    i17 = ((org.telegram.ui.ActionBar.f2) ee0Var4).currentAccount;
                    ee0Var5 = new ee0(i17);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ee0Var5);
                    }
                }
                ee0Var5.I1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 6:
                de0 de0Var = (de0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                be0 be0Var = de0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (be0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = de0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i39 = 0;
                            while (true) {
                                if (i39 >= arrayList4.size()) {
                                    osVar = null;
                                } else if (arrayList4.get(i39) == null || !((os) arrayList4.get(i39)).a.equals(upperCase)) {
                                    i39++;
                                } else {
                                    osVar = (os) arrayList4.get(i39);
                                }
                            }
                            if (osVar != null) {
                                be0Var.setText(osVar.c);
                                de0Var.E = 0;
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
                    ef0 ef0Var2 = ef0Var.s0.a;
                    int i40 = 0;
                    while (true) {
                        ArrayList arrayList5 = ef0Var2.j0;
                        if (i40 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i40)).link.equals(tL_chatInviteExported.link)) {
                            we0 l02 = ef0Var2.l0();
                            arrayList5.remove(i40);
                            ef0Var2.n0(l02);
                            break;
                        } else {
                            i40++;
                        }
                    }
                }
            case 8:
                org.telegram.messenger.g0.h3(new bd0(13, (org.telegram.ui.Components.fx) this.d, org.telegram.messenger.yr.a0(((ch0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                ch0 ch0Var = (ch0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.Components.fx fxVar = (org.telegram.ui.Components.fx) this.d;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    org.telegram.messenger.qp.s1(ch0Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.qp.s1(ch0Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = org.telegram.messenger.qp.s1(ch0Var.a).a2(Long.valueOf(o4));
                        fxVar.a(user);
                        break;
                    }
                }
                user = null;
                fxVar.a(user);
            case 10:
                oh0 oh0Var = (oh0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = oh0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0(oh0Var, new ArrayList(), new ArrayList(), new ArrayList(), 24));
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
                        qh0 qh0Var = (qh0) arrayList6.get(i42);
                        if (org.telegram.messenger.m5.C(qh0Var.d)) {
                            TLRPC.EncryptedChat a12 = notificationsCustomSettingsActivity2.getMessagesController().a1(Integer.valueOf((int) (qh0Var.d & 4294967295L)));
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
                            if (org.telegram.messenger.m5.E(qh0Var.d)) {
                                TLRPC.User a23 = notificationsCustomSettingsActivity2.getMessagesController().a2(Long.valueOf(qh0Var.d));
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
                                            arrayList8.add(qh0Var);
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
                                TLRPC.Chat M02 = notificationsCustomSettingsActivity2.getMessagesController().M0(Long.valueOf(-qh0Var.d));
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0(oh0Var, arrayList8, arrayList9, arrayList7, 24));
                    break;
                }
                break;
            case 11:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 12:
                dk0 dk0Var = (dk0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                dk0Var.B1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject6;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dk0Var.getParentActivity());
                    alertDialog$Builder.a.T = org.telegram.messenger.id.a0("RestoreEmailSent", null, 2131746080, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131746078, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new ru(29, dk0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = dk0Var.showDialog(alertDialog$Builder.a);
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
                    dk0Var.Q1(M03, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, objArr));
                    break;
                } else {
                    dk0Var.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error5.text);
                    break;
                }
                break;
            case 13:
                ((sj0) this.b).a(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 14:
                rj0 rj0Var = (rj0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                dk0 dk0Var2 = rj0Var.e;
                secureRandom.setSeed(dk0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = dk0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.pv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = dk0.t1();
                dk0Var2.c1 = t12;
                dk0Var2.b1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = dk0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.g0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    dk0Var2.e1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(dk0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = dk0Var2.c1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = dk0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = dk0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i22 = ((org.telegram.ui.ActionBar.f2) dk0Var2).currentAccount;
                ConnectionsManager.getInstance(i22).sendRequest(updatepasswordsettings, new pj0(rj0Var, i27));
                break;
            case 15:
                zj0 zj0Var = (zj0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i45 = zj0Var.L;
                dk0 dk0Var3 = zj0Var.Q;
                dk0Var3.B1();
                zj0Var.J = false;
                if (tL_error6 == null) {
                    zj0Var.r();
                    zj0Var.q();
                    ((ij0) dk0Var3.B1).c(dk0Var3.E, (String) dk0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new ri0(dk0Var3, 6), null);
                    break;
                } else {
                    zj0Var.K = tL_error6.text;
                    if ((i45 == 3 && ((i25 = zj0Var.M) == 4 || i25 == 2)) || ((i45 == 2 && ((i23 = zj0Var.M) == 4 || i23 == 3)) || (i45 == 4 && zj0Var.M == 2))) {
                        zj0Var.p();
                    }
                    if (i45 == 2) {
                        org.telegram.messenger.g0.E3(true);
                        org.telegram.messenger.qs.e().b(zj0Var, org.telegram.messenger.qs.g4);
                    } else if (i45 == 3) {
                        org.telegram.messenger.g0.D3(true);
                        org.telegram.messenger.qs.e().b(zj0Var, org.telegram.messenger.qs.h4);
                    }
                    zj0Var.I = true;
                    if (i45 != 3) {
                        i24 = ((org.telegram.ui.ActionBar.f2) dk0Var3).currentAccount;
                        z14 = false;
                        org.telegram.ui.Components.v4.c0(i24, tL_error6, dk0Var3, verifyphone, new Object[0]);
                    } else {
                        z14 = false;
                    }
                    dk0Var3.R1(true, z14);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            zj0Var.c(true);
                            dk0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i46 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = zj0Var.d;
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
                bd0 bd0Var = (bd0) this.d;
                jl0Var.E0 = tL_payments_validatedRequestedInfo;
                bd0Var.run();
                jl0Var.J0(false);
                jl0Var.N0(true, false);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                en0 en0Var = (en0) this.d;
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                org.telegram.messenger.g0.r(en0Var);
                org.telegram.messenger.g0.i3(en0Var, 800L);
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
                co0 co0Var = (co0) this.d;
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
                    co0Var.run();
                    break;
                }
                break;
            case 22:
                fq0 fq0Var = (fq0) this.b;
                fq0 fq0Var2 = (fq0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = fq0Var.d;
                if (photoViewer4.D != null && fq0Var2 == photoViewer4.w8) {
                    photoViewer4.w8 = null;
                    photoViewer4.p8 = iArr[5];
                    photoViewer4.h8 = iArr[4];
                    photoViewer4.i8 = iArr[7];
                    float f10 = photoViewer4.f8 / 8;
                    PhotoViewer photoViewer5 = fq0Var.d;
                    photoViewer4.q8 = (long) ((f10 * photoViewer5.h8) / 1000.0f);
                    if (photoViewer5.j8) {
                        PhotoViewer photoViewer6 = fq0Var.d;
                        photoViewer6.a8 = iArr[8];
                        photoViewer6.B3();
                        if (fq0Var.d.X7 > fq0Var.d.Y7 - 1) {
                            PhotoViewer photoViewer7 = fq0Var.d;
                            photoViewer7.X7 = photoViewer7.Y7 - 1;
                        }
                        PhotoViewer photoViewer8 = fq0Var.d;
                        if (!photoViewer8.I4) {
                            org.telegram.ui.Components.g51 g51Var = photoViewer8.j1;
                            boolean z15 = photoViewer8.Y7 > 1;
                            PhotoViewer photoViewer9 = fq0Var.d;
                            g51Var.a(Math.min(photoViewer9.d8, fq0Var.d.e8), z15, photoViewer9.r);
                        }
                        if (org.telegram.messenger.r2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(fq0Var.d.Y7);
                            sb3.append(" w = ");
                            sb3.append(fq0Var.d.b8);
                            sb3.append(" h = ");
                            sb3.append(fq0Var.d.c8);
                            sb3.append(" r = ");
                            jg.g.s(fq0Var.d.a8, sb3);
                        }
                        fq0Var.d.N7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = fq0Var.d;
                        if (!photoViewer10.I4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.d8, fq0Var.d.e8), false, photoViewer10.r);
                        }
                        fq0Var.d.Y7 = 0;
                    }
                    fq0Var.d.z3();
                    fq0Var.d.u3();
                    break;
                }
                break;
            case 23:
                bs0 bs0Var = (bs0) this.b;
                cn cnVar = (cn) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.ij ijVar = bs0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (ijVar != null && (message = ijVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.ij.B0(message);
                    smVar = new sm();
                    smVar.a = ijVar;
                    smVar.b = -1;
                    smVar.c = -1;
                    smVar.h = true;
                    smVar.e = bArr5;
                    smVar.f();
                }
                cnVar.ic(ijVar, smVar);
                bs0Var.c(false);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.hc.d0(tL_error7);
                    break;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.k5.p(null, 2131743879, org.telegram.ui.Components.hc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                RectF rectF = ProfileActivity.V6;
                if (org.telegram.messenger.g0.g(str11)) {
                    org.telegram.ui.Components.hc.a0(profileActivity).i(str12).j();
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                RectF rectF2 = ProfileActivity.V6;
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
                profileActivity2.G5(true, false);
                break;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                org.telegram.ui.Components.kn knVar = (org.telegram.ui.Components.kn) this.c;
                cn cnVar2 = (cn) this.d;
                RectF rectF3 = ProfileActivity.V6;
                org.telegram.ui.Components.gn gnVar = knVar.e;
                ViewGroup viewGroup = (ViewGroup) cnVar2.fragmentView;
                RectF rectF4 = jh.k.h;
                jh.k.c(gnVar, viewGroup, rectF4);
                profileActivity3.g6 = rectF4.left;
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
                    nz0 nz0Var = secretMediaViewer.n;
                    TLRPC.Message message2 = ijVar2.k;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    nz0Var.e = false;
                    nz0Var.f = j3;
                    nz0Var.h = j10;
                    nz0Var.n.start();
                    nz0Var.invalidate();
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
