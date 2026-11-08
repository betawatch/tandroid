package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements v10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d1(e2 e2Var, bi.p5 p5Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = e2Var;
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
        e2 e2Var = this.b;
        switch (i7) {
            case 0:
                t tVar = (t) this.f;
                j0 j0Var = (j0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                z1 z1Var = (z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new bi.n8(e2Var, j0Var, tonconnectsession, str, bArr, z1Var, tonconnectchallenge, tVar, 7));
                    break;
                } else {
                    tVar.a(e2.z(tL_error, "registerKey"));
                    break;
                }
            default:
                bi.p5 p5Var = (bi.p5) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                j0 j0Var2 = (j0) obj;
                String str3 = (String) obj2;
                e2Var.getClass();
                if (str3 == null && j0Var2 != null) {
                    j0 b10 = j0Var2.b();
                    Utilities.e.c(new bi.n8(e2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new u1(1, b10, p5Var), 8));
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

    public /* synthetic */ d1(e2 e2Var, t tVar, j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, z1 z1Var) {
        this.b = e2Var;
        this.f = tVar;
        this.g = j0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = z1Var;
    }
}
