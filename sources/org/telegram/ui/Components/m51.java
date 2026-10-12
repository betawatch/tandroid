package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m51;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ m51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bi.ma maVar) {
        this.d = tL_urlAuthResultRequest;
        this.f = e3Var;
        this.h = e3VarArr;
        this.n = context;
        this.b = iArr;
        this.c = c6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = maVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        View view;
        String A;
        String str;
        switch (this.a) {
            case 0:
                final org.telegram.ui.el elVar = (org.telegram.ui.el) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                ArrayList arrayList = (ArrayList) this.b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.s;
                ArrayList arrayList2 = (ArrayList) this.c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (A = x41.A(x41.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
                        e1Var.setChecked(true);
                        e1Var.setText(A);
                        linearLayout.addView(e1Var);
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str4 = language.code;
                        if (TextUtils.equals(str4, str3)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
                            if (str2 == null || !str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                            } else {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            }
                            e1Var2.setChecked(z11);
                            e1Var2.setText(language.displayName);
                            if (z11) {
                                view = e1Var2;
                            } else {
                                view = e1Var2;
                                final int i12 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k51
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i12) {
                                            case 0:
                                                org.telegram.ui.el elVar2 = elVar;
                                                translateController.setDialogTranslateTo(elVar2.b, str4);
                                                m1Var.d(true);
                                                elVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.b, str4);
                                                m1Var.d(true);
                                                elVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(view);
                            i10 = i11;
                            z11 = z10;
                        }
                    }
                    int i13 = z11 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(elVar.getContext(), elVar.d), w7.a6.n(-1, 8));
                    int size2 = arrayList2.size();
                    int i14 = i13;
                    while (i14 < size2) {
                        int i15 = i14 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i14);
                        final String str5 = language2.code;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z12 = (str2 == null || !str2.equals(str5)) ? i13 : 1;
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
                            e1Var3.setChecked(z12);
                            e1Var3.setText(language2.displayName);
                            if (z12 == 0) {
                                final int i16 = 1;
                                e1Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k51
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i16) {
                                            case 0:
                                                org.telegram.ui.el elVar2 = elVar;
                                                translateController.setDialogTranslateTo(elVar2.b, str5);
                                                m1Var.d(true);
                                                elVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.b, str5);
                                                m1Var.d(true);
                                                elVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(e1Var3);
                        }
                        i14 = i15;
                    }
                    zArr[i13] = true;
                    break;
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.b;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.c;
                ArrayList<TLRPC.EncryptedChat> arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                ArrayList arrayList8 = (ArrayList) this.n;
                ArrayList arrayList9 = (ArrayList) this.r;
                ArrayList arrayList10 = (ArrayList) this.s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(arrayList3, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(arrayList4, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats(arrayList5, true);
                int i17 = notificationsCustomSettingsActivity.s;
                if (i17 == 1) {
                    notificationsCustomSettingsActivity.w = arrayList6;
                } else if (i17 == 0) {
                    notificationsCustomSettingsActivity.w = arrayList7;
                } else if (i17 == 3) {
                    notificationsCustomSettingsActivity.w = arrayList8;
                    notificationsCustomSettingsActivity.v = arrayList9;
                } else {
                    notificationsCustomSettingsActivity.w = arrayList10;
                }
                notificationsCustomSettingsActivity.l0(true);
                break;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.h;
                Context context = (Context) this.n;
                int[] iArr = (int[]) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                bi.ma maVar = (bi.ma) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.rl0.a = e3Var;
                    e3Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.i2 B = org.telegram.ui.Wallet.d2.B(context, iArr[0], null, tL_urlAuthResultRequest, c6Var, new org.telegram.ui.j90(e3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, e3Var, maVar, 2), new org.telegram.ui.wc0(23, e3VarArr, zArr2));
                    e3VarArr[0] = B;
                    org.telegram.ui.rl0.a = B;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                bi.f0 f0Var = (bi.f0) this.s;
                d2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new bi.k8(d2Var, str6, bArr, org.telegram.ui.Wallet.d2.q(g0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, d2Var.f.getCurrentTime()), f0Var, tonconnectsession, 13));
                    break;
                } catch (Exception e) {
                    f0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.a2) this.n).a;
                final bi.f0 f0Var2 = (bi.f0) this.b;
                final org.telegram.ui.Wallet.g0 g0Var2 = (org.telegram.ui.Wallet.g0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.j0 j0Var = d2Var2.b;
                if (!TextUtils.equals(str7, j0Var.r()) || !Arrays.equals(bArr2, j0Var.w()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    f0Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    d2Var2.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.v1
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            d2 d2Var3 = d2.this;
                            bi.f0 f0Var3 = f0Var2;
                            g0 g0Var3 = g0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            d2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                f0Var3.run(null, d2.x(tL_error, "registerKey"));
                            } else {
                                Utilities.globalQueue.postRunnable(new m51(d2Var3, g0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, f0Var3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ m51(org.telegram.ui.el elVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = elVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = translateController;
        this.s = m1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ m51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.b = arrayList;
        this.c = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.h = arrayList5;
        this.n = arrayList6;
        this.r = arrayList7;
        this.s = arrayList8;
    }

    public /* synthetic */ m51(org.telegram.ui.Wallet.d2 d2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, bi.f0 f0Var, org.telegram.ui.Wallet.g0 g0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = d2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = a2Var;
        this.b = f0Var;
        this.c = g0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ m51(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.g0 g0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, bi.f0 f0Var) {
        this.d = d2Var;
        this.e = g0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = f0Var;
    }
}
