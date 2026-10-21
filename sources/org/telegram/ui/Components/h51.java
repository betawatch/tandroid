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
import org.telegram.ui.Components.h51;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements Runnable {
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

    public /* synthetic */ h51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.vb vbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f = f3Var;
        this.h = f3VarArr;
        this.n = context;
        this.b = iArr;
        this.c = d6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = vbVar;
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
                final org.telegram.ui.rk rkVar = (org.telegram.ui.rk) this.d;
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
                    if (str2 != null && (A = t41.A(t41.E(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, rkVar.getContext(), rkVar.d, false, false);
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, rkVar.getContext(), rkVar.d, false, false);
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
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f51
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i12) {
                                            case 0:
                                                org.telegram.ui.rk rkVar2 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar2.b, str4);
                                                m1Var.d(true);
                                                rkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.rk rkVar3 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar3.b, str4);
                                                m1Var.d(true);
                                                rkVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(rkVar.getContext(), rkVar.d), w7.z5.n(-1, 8));
                    int size2 = arrayList2.size();
                    int i14 = i13;
                    while (i14 < size2) {
                        int i15 = i14 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i14);
                        final String str5 = language2.code;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z12 = (str2 == null || !str2.equals(str5)) ? i13 : 1;
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, rkVar.getContext(), rkVar.d, false, false);
                            e1Var3.setChecked(z12);
                            e1Var3.setText(language2.displayName);
                            if (z12 == 0) {
                                final int i16 = 1;
                                e1Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f51
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i16) {
                                            case 0:
                                                org.telegram.ui.rk rkVar2 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar2.b, str5);
                                                m1Var.d(true);
                                                rkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.rk rkVar3 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar3.b, str5);
                                                m1Var.d(true);
                                                rkVar3.b();
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
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.h;
                Context context = (Context) this.n;
                int[] iArr = (int[]) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                ai.vb vbVar = (ai.vb) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.uk0.a = f3Var;
                    f3Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.k2 B = org.telegram.ui.Wallet.f2.B(context, iArr[0], null, tL_urlAuthResultRequest, d6Var, new org.telegram.ui.l80(f3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, f3Var, vbVar, 2), new org.telegram.ui.xg0(6, f3VarArr, zArr2));
                    f3VarArr[0] = B;
                    org.telegram.ui.uk0.a = B;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.s;
                f2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.g3(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.q(j0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f.getCurrentTime()), s1Var, tonconnectsession, 20));
                    break;
                } catch (Exception e) {
                    s1Var.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.n).a;
                final org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.b;
                final org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.m0 m0Var = f2Var2.b;
                if (!TextUtils.equals(str7, m0Var.s()) || !Arrays.equals(bArr2, m0Var.x()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    s1Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.x1
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            f2 f2Var3 = f2.this;
                            s1 s1Var3 = s1Var2;
                            j0 j0Var3 = j0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            f2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                s1Var3.run(null, f2.x(tL_error, "registerKey"));
                            } else {
                                Utilities.globalQueue.postRunnable(new h51(f2Var3, j0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, s1Var3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ h51(org.telegram.ui.rk rkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = rkVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = translateController;
        this.s = m1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ h51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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

    public /* synthetic */ h51(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.s1 s1Var, org.telegram.ui.Wallet.j0 j0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = c2Var;
        this.b = s1Var;
        this.c = j0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ h51(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.s1 s1Var) {
        this.d = f2Var;
        this.e = j0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = s1Var;
    }
}
