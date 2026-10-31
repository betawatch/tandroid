package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kp(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        byte[] bArr2;
        int i10;
        int i11;
        String str = null;
        r5 = null;
        byte[] bArr3 = null;
        str = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                mp mpVar = (mp) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                boolean z10 = this.b;
                org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) this.e;
                chat.join_request = z10;
                mpVar.y.d.getMessagesController().Z4(chat.id, 0L, z10, false, false, new lp(mpVar, i13), new zg(18, mpVar, w70Var));
                break;
            case 1:
                boolean z11 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z11 && org.telegram.messenger.w3.T(chat2)) {
                    View d = alertDialog$Builder.a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            textView.setText(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat2) ? 2131752422 : 2131751531, null));
                            break;
                        } else if (chat2.monoforum) {
                            textView.setText(org.telegram.messenger.cd.L0(2131749005, null));
                            break;
                        } else if (chat2.megagroup) {
                            textView.setText(org.telegram.messenger.cd.L0(2131749001, null));
                            break;
                        } else {
                            textView.setText(org.telegram.messenger.cd.L0(2131749014, null));
                            break;
                        }
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.wj wjVar = (org.telegram.ui.Components.wj) this.d;
                String str2 = (String) this.c;
                boolean z12 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                wjVar.getClass();
                String lowerCase = str2.trim().toLowerCase();
                int i14 = 14;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.cd(i14, wjVar, new ArrayList()));
                    break;
                } else {
                    String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (!lowerCase.equals(R0) && R0.length() != 0) {
                        str = R0;
                    }
                    int i15 = (str != null ? 1 : 0) + 1;
                    String[] strArr = new String[i15];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (!z12) {
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            org.telegram.ui.Components.qj qjVar = (org.telegram.ui.Components.qj) arrayList.get(i16);
                            File file = qjVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 < i15) {
                                        String str3 = strArr[i17];
                                        String str4 = qjVar.b;
                                        if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                            arrayList2.add(qjVar);
                                        } else {
                                            i17++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.cd(i14, wjVar, arrayList2));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.u70 u70Var = (org.telegram.ui.Components.u70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                boolean z13 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = u70Var.k1;
                if (k2Var != null && k2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                            u70Var.setOnDismissListener(new org.telegram.ui.Components.o70(i12, u70Var, z13));
                        } else {
                            org.telegram.ui.Components.s4.e0(u70Var.a, tL_error, k2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    u70Var.dismiss();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) this.d;
                TLObject tLObject = (TLObject) this.c;
                boolean z14 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                org.telegram.ui.Components.cx0 cx0Var = rw0Var.a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).I1(tL_messages_stickerSet, true);
                    if (z14) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).f2(null, tLObject, 0, null, false, false);
                    } else {
                        cx0Var.J1 = tL_messages_stickerSet;
                        cx0Var.R0();
                        cx0Var.Z0();
                    }
                }
                x1Var.dismiss();
                break;
            case 5:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                boolean z15 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.e;
                if (z2Var != null && !z2Var.I) {
                    z2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z15) {
                        org.telegram.messenger.i0.g3(new bh(editTextBoldCursor, 3));
                        break;
                    }
                } else if (x1Var2 != null && x1Var2.isShowing()) {
                    x1Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z15) {
                        org.telegram.messenger.i0.g3(new bh(editTextBoldCursor, 4));
                        break;
                    }
                }
                break;
            case 6:
                b50 b50Var = (b50) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.e;
                boolean z16 = this.b;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                        break;
                    } else {
                        b50Var.w1(null, tL_chatInviteExported.link, true, z16);
                        break;
                    }
                }
                break;
            case 7:
                e60 e60Var = (e60) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z17 = this.b;
                if (tL_error2 == null) {
                    e60Var.f = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (z17) {
                        if (e60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e60Var.getParentActivity());
                            alertDialog$Builder2.a.T = org.telegram.messenger.cd.L0(2131746042, null);
                            alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                            e60Var.showDialog(alertDialog$Builder2.a);
                        }
                    }
                }
                e60Var.e = false;
                e60Var.a.f();
                break;
            case 8:
                yk0 yk0Var = (yk0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z18 = this.b;
                ll0 ll0Var = yk0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    ll0Var.J = password;
                    TwoStepVerificationActivity.q0(password);
                    ll0Var.E1(z18);
                    break;
                }
                break;
            case 9:
                yk0 yk0Var2 = (yk0) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                String str5 = (String) this.e;
                boolean z19 = this.b;
                ll0 ll0Var2 = yk0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject5;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    ll0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    ll0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        ll0Var2.e1 = Utilities.s(bArr, org.telegram.messenger.i0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        ll0Var2.e1 = Utilities.m(org.telegram.messenger.i0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.i0.g3(new kp(yk0Var2, passwordsettings, z19, bArr2, 10));
                        break;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.i0.g3(new mg0(yk0Var2, 7));
                        break;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = ll0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        ll0Var2.e1 = Utilities.m(org.telegram.messenger.i0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    ll0Var2.c1 = null;
                    ll0Var2.b1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.i0.g3(new kp(yk0Var2, passwordsettings, z19, bArr2, 10));
            case 10:
                yk0 yk0Var3 = (yk0) this.d;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.c;
                boolean z20 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                ll0 ll0Var3 = yk0Var3.e;
                ll0Var3.d1 = passwordsettings2.email;
                if (z20) {
                    ll0Var3.e1 = ll0Var3.P0;
                }
                byte[] bArr7 = ll0Var3.c1;
                byte[] bArr8 = ll0Var3.e1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (ll0.c1(bArr3, Long.valueOf(ll0Var3.b1)) && bArr6.length != 0 && ll0Var3.b1 != 0) {
                    if (ll0Var3.c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i11 = ((org.telegram.ui.ActionBar.k2) ll0Var3).currentAccount;
                        ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new wk0(yk0Var3, i13));
                        break;
                    } else {
                        yk0Var3.a();
                        break;
                    }
                } else if (z20) {
                    i10 = ((org.telegram.ui.ActionBar.k2) ll0Var3).currentAccount;
                    org.telegram.messenger.d20.i(i10).u();
                    ll0Var3.N0 = 0;
                    ll0Var3.V1();
                    break;
                } else {
                    TL_account.authorizationForm authorizationform = ll0Var3.D;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        ll0Var3.D.errors.clear();
                    }
                    byte[] bArr12 = ll0Var3.c1;
                    if (bArr12 != null && bArr12.length != 0) {
                        yk0Var3.b();
                        break;
                    } else {
                        Utilities.e.c(new qd0(yk0Var3, yk0Var3.b, yk0Var3.d, 15));
                        break;
                    }
                }
                break;
            case 11:
                sm0 sm0Var = (sm0) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z21 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    sm0Var.a0 = password2;
                    TwoStepVerificationActivity.q0(password2);
                    sm0Var.F0(z21);
                    break;
                }
                break;
            case 12:
                tc1.g0((tc1) this.d, (TLRPC.TL_error) this.c, (TLObject) this.e, this.b);
                break;
            case 13:
                rh.v5 v5Var = (rh.v5) this.d;
                int[] iArr = (int[]) this.c;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z22 = this.b;
                ArrayList arrayList3 = v5Var.l;
                int i18 = v5Var.a;
                if (iArr[0] == v5Var.m) {
                    v5Var.i = false;
                    v5Var.m = -1;
                    if (tLObject7 instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject7;
                        org.telegram.messenger.vp.r1(i18).V3(tL_payments_savedStarGifts.users, false);
                        org.telegram.messenger.vp.r1(i18).P3(tL_payments_savedStarGifts.chats, false);
                        if (z22) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(tL_payments_savedStarGifts.gifts);
                        v5Var.k = tL_payments_savedStarGifts.next_offset;
                        v5Var.n = tL_payments_savedStarGifts.count;
                        v5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        v5Var.j = arrayList3.size() > v5Var.n || v5Var.k == null;
                    } else {
                        v5Var.j = true;
                    }
                    org.telegram.messenger.zs.f(i18).k(org.telegram.messenger.zs.G3, Long.valueOf(v5Var.b), v5Var);
                    break;
                }
                break;
            case 14:
                th.d2 d2Var = (th.d2) this.d;
                View view = (View) this.c;
                sg.o0 o0Var = (sg.o0) this.e;
                boolean z23 = this.b;
                th.z2 z2Var2 = d2Var.a;
                org.telegram.ui.Components.s4.Z(z2Var2.l2, 1, z2Var2.k1, new org.telegram.ui.Components.nd(d2Var, z23, o0Var, view));
                break;
            case 15:
                vh.e1 e1Var = (vh.e1) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                String str6 = (String) this.e;
                boolean z24 = this.b;
                vh.g1 g1Var = e1Var.s;
                if (e1Var.r) {
                    if (tLObject8 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject8;
                        vh.u1 u1Var = g1Var.r;
                        ArrayList arrayList4 = g1Var.n;
                        int i19 = vh.u1.y1;
                        org.telegram.messenger.hs.a0(u1Var.a).v1(str6, messages_botresults);
                        e1Var.h = messages_botresults.next_offset;
                        if (z24) {
                            arrayList4.clear();
                        }
                        arrayList4.size();
                        arrayList4.addAll(messages_botresults.results);
                        e1Var.f();
                    }
                    g1Var.d.c(false);
                    e1Var.r = false;
                    break;
                }
                break;
            case 16:
                vh.n5 n5Var = (vh.n5) this.d;
                Bitmap bitmap = (Bitmap) this.c;
                boolean z25 = this.b;
                Runnable runnable = (Runnable) this.e;
                n5Var.getClass();
                try {
                    bitmap.compress(z25 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(n5Var.Z0));
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, false);
                    if (z25) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(n5Var.Z0));
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, false);
                        }
                    }
                }
                bitmap.recycle();
                org.telegram.messenger.i0.g3(runnable);
                break;
            default:
                zf.z zVar = (zf.z) this.d;
                boolean z26 = this.b;
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) this.c;
                zf.w wVar = (zf.w) this.e;
                if (!z26) {
                    zVar.c = wVar;
                    z3Var.setRightText(zVar.H(wVar));
                    z3Var.setRightTextMargin(6);
                    zVar.I.clear();
                    zVar.d = true;
                    zVar.f();
                    zVar.P();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kp(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ kp(th.d2 d2Var, View view, sg.o0 o0Var, boolean z10, boolean z11) {
        this.a = 14;
        this.d = d2Var;
        this.c = view;
        this.e = o0Var;
        this.b = z10;
    }

    public /* synthetic */ kp(zf.z zVar, boolean z10, org.telegram.ui.Cells.z3 z3Var, zf.w wVar) {
        this.a = 17;
        this.d = zVar;
        this.b = z10;
        this.c = z3Var;
        this.e = wVar;
    }

    public /* synthetic */ kp(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 1;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
