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
import org.telegram.ui.Components.q51;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q51 implements Runnable {
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

    public /* synthetic */ q51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.db dbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f = f3Var;
        this.h = f3VarArr;
        this.n = context;
        this.b = iArr;
        this.c = e6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = dbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        View view;
        String B;
        String str;
        switch (this.a) {
            case 0:
                final org.telegram.ui.al alVar = (org.telegram.ui.al) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                ArrayList arrayList = (ArrayList) this.b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.s;
                ArrayList arrayList2 = (ArrayList) this.c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (B = b51.B(b51.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, alVar.getContext(), alVar.d, false, false);
                        f1Var.setChecked(true);
                        f1Var.setText(B);
                        linearLayout.addView(f1Var);
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
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, alVar.getContext(), alVar.d, false, false);
                            if (str2 == null || !str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                            } else {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            }
                            f1Var2.setChecked(z11);
                            f1Var2.setText(language.displayName);
                            if (z11) {
                                view = f1Var2;
                            } else {
                                view = f1Var2;
                                final int i12 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o51
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i12) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.b, str4);
                                                n1Var.d(true);
                                                alVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.b, str4);
                                                n1Var.d(true);
                                                alVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(alVar.getContext(), alVar.d), w7.x5.n(-1, 8));
                    int size2 = arrayList2.size();
                    int i14 = i13;
                    while (i14 < size2) {
                        int i15 = i14 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i14);
                        final String str5 = language2.code;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z12 = (str2 == null || !str2.equals(str5)) ? i13 : 1;
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, alVar.getContext(), alVar.d, false, false);
                            f1Var3.setChecked(z12);
                            f1Var3.setText(language2.displayName);
                            if (z12 == 0) {
                                final int i16 = 1;
                                f1Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o51
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i16) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.b, str5);
                                                n1Var.d(true);
                                                alVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.b, str5);
                                                n1Var.d(true);
                                                alVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var3);
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
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                ai.db dbVar = (ai.db) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.ml0.a = f3Var;
                    f3Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.i2 B2 = org.telegram.ui.Wallet.d2.B(context, iArr[0], null, tL_urlAuthResultRequest, e6Var, new org.telegram.ui.e90(f3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, f3Var, dbVar, 2), new org.telegram.ui.tf0(12, f3VarArr, zArr2));
                    f3VarArr[0] = B2;
                    org.telegram.ui.ml0.a = B2;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                ai.m0 m0Var = (ai.m0) this.s;
                d2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.a9(d2Var, str6, bArr, org.telegram.ui.Wallet.d2.q(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, d2Var.f.getCurrentTime()), m0Var, tonconnectsession, 13));
                    break;
                } catch (Exception e7) {
                    m0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth connect", e7));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.a2) this.n).a;
                final ai.m0 m0Var2 = (ai.m0) this.b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.k0 k0Var = d2Var2.b;
                if (!TextUtils.equals(str7, k0Var.r()) || !Arrays.equals(bArr2, k0Var.w()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    m0Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    d2Var2.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.v1
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            d2 d2Var3 = d2.this;
                            ai.m0 m0Var3 = m0Var2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            d2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                m0Var3.run(null, d2.x(tL_error, "registerKey"));
                            } else {
                                Utilities.globalQueue.postRunnable(new q51(d2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, m0Var3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ q51(org.telegram.ui.al alVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = alVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = translateController;
        this.s = n1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ q51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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

    public /* synthetic */ q51(org.telegram.ui.Wallet.d2 d2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, ai.m0 m0Var, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = d2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = a2Var;
        this.b = m0Var;
        this.c = h0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ q51(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, ai.m0 m0Var) {
        this.d = d2Var;
        this.e = h0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = m0Var;
    }
}
