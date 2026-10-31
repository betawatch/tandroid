package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements j20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d1(e2 e2Var, ih.s sVar, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = e2Var;
        this.f = sVar;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        e2 e2Var = this.b;
        switch (i10) {
            case 0:
                f11 f11Var = (f11) this.f;
                h0 h0Var = (h0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new bi.n(e2Var, h0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, f11Var, 7));
                    break;
                } else {
                    f11Var.a(e2.z(tL_error, "registerKey"));
                    break;
                }
            default:
                ih.s sVar = (ih.s) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                h0 h0Var2 = (h0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.e.c(new bi.n(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new ih.s(25, b10, sVar), 8));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    sVar.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ d1(e2 e2Var, f11 f11Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.b = e2Var;
        this.f = f11Var;
        this.g = h0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = z1Var;
    }
}
