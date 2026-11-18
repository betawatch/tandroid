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
import org.telegram.ui.Components.n31;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements Runnable {
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

    public /* synthetic */ n31(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.i6 i6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.m0 m0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f = x2Var;
        this.h = x2VarArr;
        this.n = context;
        this.b = iArr;
        this.c = i6Var;
        this.e = zArr;
        this.r = inputtonconnectoauthsessionArr;
        this.s = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        View view;
        String L0;
        String str;
        switch (this.a) {
            case 0:
                final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                ArrayList arrayList = (ArrayList) this.b;
                String str3 = (String) this.h;
                final org.telegram.messenger.z00 z00Var = (org.telegram.messenger.z00) this.r;
                final org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.s;
                ArrayList arrayList2 = (ArrayList) this.c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (L0 = y21.L0(y21.P0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, ckVar.getContext(), ckVar.d, false, false);
                        z0Var.setChecked(true);
                        z0Var.setText(L0);
                        linearLayout.addView(z0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) arrayList.get(i7);
                        final String str4 = s00Var.a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, ckVar.getContext(), ckVar.d, false, false);
                            if (str2 == null || !str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                            } else {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            }
                            z0Var2.setChecked(z11);
                            z0Var2.setText(s00Var.b);
                            if (z11) {
                                view = z0Var2;
                            } else {
                                view = z0Var2;
                                final int i11 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l31
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i11) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                z00Var.I(ckVar2.b, str4);
                                                h1Var.d(true);
                                                ckVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                z00Var.I(ckVar3.b, str4);
                                                h1Var.d(true);
                                                ckVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(view);
                            i7 = i10;
                            z11 = z10;
                        }
                    }
                    int i12 = z11 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.e1(ckVar.getContext(), ckVar.d), c8.ma.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i13 = i12;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        org.telegram.messenger.s00 s00Var2 = (org.telegram.messenger.s00) arrayList2.get(i13);
                        final String str5 = s00Var2.a;
                        if (!TextUtils.equals(str5, str3)) {
                            boolean z12 = (str2 == null || !str2.equals(str5)) ? i12 : 1;
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, ckVar.getContext(), ckVar.d, false, false);
                            z0Var3.setChecked(z12);
                            z0Var3.setText(s00Var2.b);
                            if (z12 == 0) {
                                final int i15 = 1;
                                z0Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l31
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i15) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                z00Var.I(ckVar2.b, str5);
                                                h1Var.d(true);
                                                ckVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                z00Var.I(ckVar3.b, str5);
                                                h1Var.d(true);
                                                ckVar3.b();
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
                notificationsCustomSettingsActivity.getMessagesController().f4(arrayList3, true);
                notificationsCustomSettingsActivity.getMessagesController().Z3(arrayList4, true);
                notificationsCustomSettingsActivity.getMessagesController().c4(arrayList5);
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
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.h;
                Context context = (Context) this.n;
                int[] iArr = (int[]) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.r;
                bg.m0 m0Var = (bg.m0) this.s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.gi0.a = x2Var;
                    x2Var.show();
                    break;
                } else {
                    org.telegram.ui.Wallet.e3 D = org.telegram.ui.Wallet.l2.D(context, iArr[0], null, tL_urlAuthResultRequest, i6Var, new org.telegram.ui.t60(x2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, x2Var, m0Var, 2), new org.telegram.ui.ve0(6, x2VarArr, zArr2));
                    x2VarArr[0] = D;
                    org.telegram.ui.gi0.a = D;
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f;
                byte[] bArr = (byte[]) this.n;
                JSONArray jSONArray = (JSONArray) this.b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.s;
                l2Var.getClass();
                try {
                    org.telegram.messenger.g0.g3(new bi.h2(l2Var, str6, bArr, org.telegram.ui.Wallet.l2.s(r0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, l2Var.f.getCurrentTime()), e0Var, tonconnectsession, 22));
                    break;
                } catch (Exception e10) {
                    e0Var.a(null, org.telegram.ui.Wallet.l2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.d;
                final String str7 = (String) this.f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.i2) this.n).a;
                final org.telegram.ui.Wallet.e0 e0Var2 = (org.telegram.ui.Wallet.e0) this.b;
                final org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.c;
                final JSONArray jSONArray2 = (JSONArray) this.r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.s;
                org.telegram.ui.Wallet.u0 u0Var = l2Var2.b;
                if (!TextUtils.equals(str7, u0Var.y()) || !Arrays.equals(bArr2, u0Var.E()) || ((str = tonconnectsession2.client_id) != null && !str8.equalsIgnoreCase(str))) {
                    e0Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str8;
                    l2Var2.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.q10() { // from class: org.telegram.ui.Wallet.j1
                        @Override // org.telegram.messenger.q10
                        public final void a(Object obj, Object obj2) {
                            l2 l2Var3 = l2.this;
                            e0 e0Var3 = e0Var2;
                            r0 r0Var3 = r0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            l2Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                e0Var3.a(null, l2.z(tL_error, "registerKey"));
                            } else {
                                Utilities.e.c(new n31(l2Var3, r0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, e0Var3));
                            }
                        }
                    });
                    break;
                }
        }
    }

    public /* synthetic */ n31(org.telegram.ui.ck ckVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.z00 z00Var, org.telegram.ui.ActionBar.h1 h1Var, ArrayList arrayList2) {
        this.d = ckVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = z00Var;
        this.s = h1Var;
        this.c = arrayList2;
    }

    public /* synthetic */ n31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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

    public /* synthetic */ n31(org.telegram.ui.Wallet.l2 l2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.Wallet.e0 e0Var, org.telegram.ui.Wallet.r0 r0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = l2Var;
        this.f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.n = i2Var;
        this.b = e0Var;
        this.c = r0Var;
        this.r = jSONArray;
        this.s = tL_urlAuthResultRequest;
    }

    public /* synthetic */ n31(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.e0 e0Var) {
        this.d = l2Var;
        this.e = r0Var;
        this.h = tonconnectsession;
        this.f = str;
        this.n = bArr;
        this.b = jSONArray;
        this.c = tL_urlAuthResultRequest;
        this.r = tonconnectchallenge;
        this.s = e0Var;
    }
}
