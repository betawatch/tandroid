package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements v10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e1(f2 f2Var, bi.p5 p5Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = f2Var;
        this.f = p5Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        f2 f2Var = this.b;
        switch (i7) {
            case 0:
                t tVar = (t) this.f;
                k0 k0Var = (k0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                a2 a2Var = (a2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new bi.n8(f2Var, k0Var, tonconnectsession, str, bArr, a2Var, tonconnectchallenge, tVar, 7));
                    break;
                } else {
                    tVar.a(f2.z(tL_error, "registerKey"));
                    break;
                }
            default:
                bi.p5 p5Var = (bi.p5) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                k0 k0Var2 = (k0) obj;
                String str3 = (String) obj2;
                f2Var.getClass();
                if (str3 == null && k0Var2 != null) {
                    k0 b10 = k0Var2.b();
                    Utilities.e.c(new bi.n8(f2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new v1(1, b10, p5Var), 8));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    p5Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ e1(f2 f2Var, t tVar, k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, a2 a2Var) {
        this.b = f2Var;
        this.f = tVar;
        this.g = k0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = a2Var;
    }
}
