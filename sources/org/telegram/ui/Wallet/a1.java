package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a1(d2 d2Var, bi.f0 f0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = d2Var;
        this.f = f0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        d2 d2Var = this.b;
        switch (i10) {
            case 0:
                mt mtVar = (mt) this.f;
                g0 g0Var = (g0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                y1 y1Var = (y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ji.k(d2Var, g0Var, tonconnectsession, str, bArr, y1Var, tonconnectchallenge, mtVar, 4));
                    break;
                } else {
                    mtVar.run(d2.x(tL_error, "registerKey"));
                    break;
                }
            default:
                bi.f0 f0Var = (bi.f0) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                g0 g0Var2 = (g0) obj;
                String str3 = (String) obj2;
                d2Var.getClass();
                if (str3 == null && g0Var2 != null) {
                    g0 b10 = g0Var2.b();
                    Utilities.globalQueue.postRunnable(new ji.k(d2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new bi.f0(26, b10, f0Var), 5));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    f0Var.run(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ a1(d2 d2Var, mt mtVar, g0 g0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, y1 y1Var) {
        this.b = d2Var;
        this.f = mtVar;
        this.g = g0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = y1Var;
    }
}
