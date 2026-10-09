package org.telegram.ui.Components;

import org.json.JSONArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pr(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = str;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ci.d dVar = (ci.d) this.c;
                String[] strArr = (String[]) this.d;
                String[] strArr2 = (String[]) this.e;
                String str = this.b;
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) this.f;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.g;
                int[] iArr = (int[]) this.h;
                dVar.setLoading(false);
                strArr[0] = null;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    strArr2[0] = null;
                    dVar.setEnabled(false);
                    e9Var.setText(LocaleController.getString(R.string.UsernameInUse));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, e6Var));
                    int i10 = -iArr[0];
                    iArr[0] = i10;
                    AndroidUtilities.shakeViewSpring(e9Var, i10);
                    break;
                } else {
                    strArr2[0] = str;
                    dVar.setEnabled(true);
                    e9Var.setText(LocaleController.formatString(R.string.UsernameAvailable, sc.v.i("@", str)));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.w6, e6Var));
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.c;
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f;
                String str2 = this.b;
                byte[] bArr = (byte[]) this.g;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ii.k(d2Var, h0Var, tonconnectsession, str2, bArr, y1Var, tonconnectchallenge, ftVar, 4));
                    break;
                } else {
                    ftVar.run(org.telegram.ui.Wallet.d2.x(tL_error, "registerKey"));
                    break;
                }
            default:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.c;
                ai.m0 m0Var = (ai.m0) this.d;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.e;
                String str3 = this.b;
                byte[] bArr2 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj;
                String str4 = (String) obj2;
                d2Var2.getClass();
                if (str4 == null && h0Var2 != null) {
                    org.telegram.ui.Wallet.h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ii.k(d2Var2, b10, tonconnectsession2, str3, bArr2, jSONArray, tL_urlAuthResultRequest, new ai.m0(26, b10, m0Var), 5));
                    break;
                } else {
                    if (str4 == null) {
                        str4 = "Recovery phrase is unavailable";
                    }
                    m0Var.run(null, str4);
                    break;
                }
        }
    }

    public /* synthetic */ pr(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.ft ftVar, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, org.telegram.ui.Wallet.y1 y1Var) {
        this.a = 1;
        this.c = d2Var;
        this.d = ftVar;
        this.e = h0Var;
        this.f = tonconnectsession;
        this.b = str;
        this.g = bArr;
        this.h = y1Var;
    }
}
