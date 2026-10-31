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
import org.telegram.ui.Components.b41;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements Runnable {
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

    public /* synthetic */ b41(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.p6 p6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, m4.a1 a1Var) {
        this.d = tL_urlAuthResultRequest;
        this.f = z2Var;
        this.h = z2VarArr;
        this.n = context;
        this.b = iArr;
        this.c = p6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = a1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        View view;
        String K0;
        String str;
        switch (this.a) {
            case 0:
                final org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                ArrayList arrayList = (ArrayList) this.b;
                String str3 = (String) this.h;
                final org.telegram.messenger.t10 t10Var = (org.telegram.messenger.t10) this.r;
                final org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) this.s;
                ArrayList arrayList2 = (ArrayList) this.c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = m31.K0(m31.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, xkVar.getContext(), xkVar.d, false, false);
                        b1Var.setChecked(true);
                        b1Var.setText(K0);
                        linearLayout.addView(b1Var);
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) arrayList.get(i10);
                        final String str4 = m10Var.a;
                        if (TextUtils.equals(str4, str3)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(2, xkVar.getContext(), xkVar.d, false, false);
                            if (str2 == null || !str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                            } else {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            }
                            b1Var2.setChecked(z11);
                            b1Var2.setText(m10Var.b);
                            if (z11) {
                                view = b1Var2;
                            } else {
                                view = b1Var2;
                                final int i12 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.z31
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i12) {
                                            case 0:
                                                org.telegram.ui.xk xkVar2 = xkVar;
                                                t10Var.I(xkVar2.b, str4);
                                                k1Var.d(true);
                                                xkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.xk xkVar3 = xkVar;
                                                t10Var.I(xkVar3.b, str4);
                                                k1Var.d(true);
                                                xkVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.h1(xkVar.getContext(), xkVar.d), w7.b6.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i14 = i13;
                    while (i14 < size2) {
                        int i15 = i14 + 1;
                        org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) arrayList2.get(i14);
                        final String str5 = m10Var2.a;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z12 = (str2 == null || !str2.equals(str5)) ? i13 : 1;
                            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(2, xkVar.getContext(), xkVar.d, false, false);
                            b1Var3.setChecked(z12);
                            b1Var3.setText(m10Var2.b);
                            if (z12 == 0) {
                                final int i16 = 1;
                                b1Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.z31
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i16) {
                                            case 0:
                                                org.telegram.ui.xk xkVar2 = xkVar;
                                                t10Var.I(xkVar2.b, str5);
                                                k1Var.d(true);
                                                xkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.xk xkVar3 = xkVar;
                                                t10Var.I(xkVar3.b, str5);
                                                k1Var.d(true);
                                                xkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(b1Var3);
                        }
                        i14 = i15;
                    }
                    zArr[i13] = true;
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
                notificationsCustomSettingsActivity.getMessagesController().V3(arrayList3, true);
                notificationsCustomSettingsActivity.getMessagesController().P3(arrayList4, true);
                notificationsCustomSettingsActivity.getMessagesController().S3(arrayList5);
                int i17 = notificationsCustomSettingsActivity.s;
                if (i17 == 1) {
                    notificationsCustomSettingsActivity.x = arrayList6;
                } else if (i17 == 0) {
                    notificationsCustomSettingsActivity.x = arrayList7;
                } else if (i17 == 3) {
                    notificationsCustomSettingsActivity.x = arrayList8;
                    notificationsCustomSettingsActivity.w = arrayList9;
                } else {
                    notificationsCustomSettingsActivity.x = arrayList10;
                }
                notificationsCustomSettingsActivity.p0(true);
                break;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.h;
                Context context = (Context) this.n;
                int[] iArr = (int[]) this.b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                m4.a1 a1Var = (m4.a1) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.jj0.a = z2Var;
                    z2Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.z2 D = org.telegram.ui.Wallet.e2.D(context, iArr[0], null, tL_urlAuthResultRequest, p6Var, new org.telegram.ui.r70(z2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, z2Var, a1Var, 2), new org.telegram.ui.uf0(7, z2VarArr, zArr2));
                    z2VarArr[0] = D;
                    org.telegram.ui.jj0.a = D;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                ih.s sVar = (ih.s) this.s;
                e2Var.getClass();
                try {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.v8(e2Var, str6, bArr, org.telegram.ui.Wallet.e2.s(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, e2Var.f.getCurrentTime()), sVar, tonconnectsession, 11));
                    break;
                } catch (Exception e) {
                    sVar.a(null, org.telegram.ui.Wallet.e2.i("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.b2) this.n).a;
                final ih.s sVar2 = (ih.s) this.b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.k0 k0Var = e2Var2.b;
                if (!TextUtils.equals(str7, k0Var.t()) || !Arrays.equals(bArr2, k0Var.y()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    sVar2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    e2Var2.f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new org.telegram.messenger.j20() { // from class: org.telegram.ui.Wallet.b1
                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            e2 e2Var3 = e2.this;
                            ih.s sVar3 = sVar2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            e2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                sVar3.a(null, e2.z(tL_error, "registerKey"));
                            } else {
                                Utilities.e.c(new b41(e2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, sVar3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ b41(org.telegram.ui.xk xkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.t10 t10Var, org.telegram.ui.ActionBar.k1 k1Var, ArrayList arrayList2) {
        this.d = xkVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = t10Var;
        this.s = k1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ b41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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

    public /* synthetic */ b41(org.telegram.ui.Wallet.e2 e2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.b2 b2Var, ih.s sVar, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = e2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = b2Var;
        this.b = sVar;
        this.c = h0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ b41(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, ih.s sVar) {
        this.d = e2Var;
        this.e = h0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = sVar;
    }
}
