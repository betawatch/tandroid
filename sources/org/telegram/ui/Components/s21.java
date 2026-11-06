package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.s21;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements Runnable {
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

    public /* synthetic */ s21(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.l0 l0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f = v2Var;
        this.h = v2VarArr;
        this.n = context;
        this.b = iArr;
        this.c = f6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        View view;
        String K0;
        String str;
        switch (this.a) {
            case 0:
                final org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                ArrayList arrayList = (ArrayList) this.b;
                String str3 = (String) this.h;
                final org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) this.r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.s;
                ArrayList arrayList2 = (ArrayList) this.c;
                boolean z10 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = e21.K0(e21.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                        z0Var.setChecked(true);
                        z0Var.setText(K0);
                        linearLayout.addView(z0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) arrayList.get(i7);
                        final String str4 = y00Var.a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            if (str2 == null || !str2.equals(str4)) {
                                z9 = z10 ? 1 : 0;
                            } else {
                                z9 = z10 ? 1 : 0;
                                z10 = true;
                            }
                            z0Var2.setChecked(z10);
                            z0Var2.setText(y00Var.b);
                            if (z10) {
                                view = z0Var2;
                            } else {
                                view = z0Var2;
                                final int i11 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q21
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i11) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                f10Var.I(bkVar2.b, str4);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                f10Var.I(bkVar3.b, str4);
                                                g1Var.d(true);
                                                bkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(view);
                            i7 = i10;
                            z10 = z9;
                        }
                    }
                    int i12 = z10 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(bkVar.getContext(), bkVar.d), c8.ha.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i13 = i12;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) arrayList2.get(i13);
                        final String str5 = y00Var2.a;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z11 = (str2 == null || !str2.equals(str5)) ? i12 : 1;
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            z0Var3.setChecked(z11);
                            z0Var3.setText(y00Var2.b);
                            if (z11 == 0) {
                                final int i15 = 1;
                                z0Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q21
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i15) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                f10Var.I(bkVar2.b, str5);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                f10Var.I(bkVar3.b, str5);
                                                g1Var.d(true);
                                                bkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(z0Var3);
                        }
                        i13 = i14;
                    }
                    zArr[i12] = true;
                    break;
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                ArrayList arrayList8 = (ArrayList) this.n;
                ArrayList arrayList9 = (ArrayList) this.r;
                ArrayList arrayList10 = (ArrayList) this.s;
                notificationsCustomSettingsActivity.getMessagesController().Y3(arrayList3, true);
                notificationsCustomSettingsActivity.getMessagesController().S3(arrayList4, true);
                notificationsCustomSettingsActivity.getMessagesController().V3(arrayList5);
                int i16 = notificationsCustomSettingsActivity.s;
                if (i16 == 1) {
                    notificationsCustomSettingsActivity.x = arrayList6;
                } else if (i16 == 0) {
                    notificationsCustomSettingsActivity.x = arrayList7;
                } else if (i16 == 3) {
                    notificationsCustomSettingsActivity.x = arrayList8;
                    notificationsCustomSettingsActivity.w = arrayList9;
                } else {
                    notificationsCustomSettingsActivity.x = arrayList10;
                }
                notificationsCustomSettingsActivity.q0(true);
                break;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.h;
                Context context = (Context) this.n;
                int[] iArr = (int[]) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                bg.l0 l0Var = (bg.l0) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.bi0.a = v2Var;
                    v2Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.a3 D = org.telegram.ui.Wallet.f2.D(context, iArr[0], null, tL_urlAuthResultRequest, f6Var, new org.telegram.ui.t60(v2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, v2Var, l0Var, 2), new org.telegram.ui.zc0(15, v2VarArr, zArr2));
                    v2VarArr[0] = D;
                    org.telegram.ui.bi0.a = D;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                org.telegram.ui.Wallet.v1 v1Var = (org.telegram.ui.Wallet.v1) this.s;
                f2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new bi.a3(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.s(k0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f.getCurrentTime()), v1Var, tonconnectsession, 21));
                    break;
                } catch (Exception e10) {
                    v1Var.a(null, org.telegram.ui.Wallet.f2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.n).a;
                final org.telegram.ui.Wallet.v1 v1Var2 = (org.telegram.ui.Wallet.v1) this.b;
                final org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.n0 n0Var = f2Var2.b;
                if (!TextUtils.equals(str7, n0Var.t()) || !Arrays.equals(bArr2, n0Var.y()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    v1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.ui.Wallet.c1
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            f2 f2Var3 = f2.this;
                            v1 v1Var3 = v1Var2;
                            k0 k0Var3 = k0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            f2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                v1Var3.a(null, f2.z(tL_error, "registerKey"));
                            } else {
                                Utilities.e.c(new s21(f2Var3, k0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, v1Var3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ s21(org.telegram.ui.bk bkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.f10 f10Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = bkVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = f10Var;
        this.s = g1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ s21(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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

    public /* synthetic */ s21(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.v1 v1Var, org.telegram.ui.Wallet.k0 k0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = c2Var;
        this.b = v1Var;
        this.c = k0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ s21(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.v1 v1Var) {
        this.d = f2Var;
        this.e = k0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = v1Var;
    }
}
