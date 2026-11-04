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
import org.telegram.ui.Components.t21;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements Runnable {
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

    public /* synthetic */ t21(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.t2[] t2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, cg.k0 k0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f = t2Var;
        this.h = t2VarArr;
        this.n = context;
        this.b = iArr;
        this.c = e6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = k0Var;
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
                final org.telegram.ui.xj xjVar = (org.telegram.ui.xj) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                ArrayList arrayList = (ArrayList) this.b;
                String str3 = (String) this.h;
                final org.telegram.messenger.x00 x00Var = (org.telegram.messenger.x00) this.r;
                final org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.s;
                ArrayList arrayList2 = (ArrayList) this.c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = f21.K0(f21.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, xjVar.getContext(), xjVar.d, false, false);
                        y0Var.setChecked(true);
                        y0Var.setText(K0);
                        linearLayout.addView(y0Var);
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i10 = i3 + 1;
                        org.telegram.messenger.q00 q00Var = (org.telegram.messenger.q00) arrayList.get(i3);
                        final String str4 = q00Var.a;
                        if (TextUtils.equals(str4, str3)) {
                            i3 = i10;
                        } else {
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, xjVar.getContext(), xjVar.d, false, false);
                            if (str2 == null || !str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                            } else {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            }
                            y0Var2.setChecked(z11);
                            y0Var2.setText(q00Var.b);
                            if (z11) {
                                view = y0Var2;
                            } else {
                                view = y0Var2;
                                final int i11 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.r21
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i11) {
                                            case 0:
                                                org.telegram.ui.xj xjVar2 = xjVar;
                                                x00Var.I(xjVar2.b, str4);
                                                f1Var.d(true);
                                                xjVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.xj xjVar3 = xjVar;
                                                x00Var.I(xjVar3.b, str4);
                                                f1Var.d(true);
                                                xjVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(view);
                            i3 = i10;
                            z11 = z10;
                        }
                    }
                    int i12 = z11 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.c1(xjVar.getContext(), xjVar.d), b8.mf.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i13 = i12;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) arrayList2.get(i13);
                        final String str5 = q00Var2.a;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z12 = (str2 == null || !str2.equals(str5)) ? i12 : 1;
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(2, xjVar.getContext(), xjVar.d, false, false);
                            y0Var3.setChecked(z12);
                            y0Var3.setText(q00Var2.b);
                            if (z12 == 0) {
                                final int i15 = 1;
                                y0Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.r21
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i15) {
                                            case 0:
                                                org.telegram.ui.xj xjVar2 = xjVar;
                                                x00Var.I(xjVar2.b, str5);
                                                f1Var.d(true);
                                                xjVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.xj xjVar3 = xjVar;
                                                x00Var.I(xjVar3.b, str5);
                                                f1Var.d(true);
                                                xjVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(y0Var3);
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
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.h;
                Context context = (Context) this.n;
                int[] iArr = (int[]) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                cg.k0 k0Var = (cg.k0) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.yh0.a = t2Var;
                    t2Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.y2 D = org.telegram.ui.Wallet.c2.D(context, iArr[0], null, tL_urlAuthResultRequest, e6Var, new org.telegram.ui.n60(t2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, t2Var, k0Var, 2), new org.telegram.ui.tb0(19, t2VarArr, zArr2));
                    t2VarArr[0] = D;
                    org.telegram.ui.yh0.a = D;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.s;
                c2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new ai.w1(c2Var, str6, bArr, org.telegram.ui.Wallet.c2.s(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, c2Var.f.getCurrentTime()), s1Var, tonconnectsession, 22));
                    break;
                } catch (Exception e10) {
                    s1Var.a(null, org.telegram.ui.Wallet.c2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.z1) this.n).a;
                final org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.k0 k0Var2 = c2Var2.b;
                if (!TextUtils.equals(str7, k0Var2.t()) || !Arrays.equals(bArr2, k0Var2.y()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    s1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    c2Var2.f.sendRequestTyped(tonconnectregisterkey, new c3.b(1), new org.telegram.messenger.n10() { // from class: org.telegram.ui.Wallet.z0
                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            c2 c2Var3 = c2.this;
                            s1 s1Var3 = s1Var2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            c2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                s1Var3.a(null, c2.z(tL_error, "registerKey"));
                            } else {
                                Utilities.e.c(new t21(c2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, s1Var3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ t21(org.telegram.ui.xj xjVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.x00 x00Var, org.telegram.ui.ActionBar.f1 f1Var, ArrayList arrayList2) {
        this.d = xjVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = x00Var;
        this.s = f1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ t21(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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

    public /* synthetic */ t21(org.telegram.ui.Wallet.c2 c2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.s1 s1Var, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = c2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = z1Var;
        this.b = s1Var;
        this.c = h0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ t21(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.s1 s1Var) {
        this.d = c2Var;
        this.e = h0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = s1Var;
    }
}
