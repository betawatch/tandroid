package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements n10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b1(c2 c2Var, e51 e51Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, x1 x1Var) {
        this.b = c2Var;
        this.f = e51Var;
        this.g = h0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = x1Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        c2 c2Var = this.b;
        switch (i3) {
            case 0:
                e51 e51Var = (e51) this.f;
                h0 h0Var = (h0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                x1 x1Var = (x1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new ci.o7(c2Var, h0Var, tonconnectsession, str, bArr, x1Var, tonconnectchallenge, e51Var, 7));
                    break;
                } else {
                    e51Var.a(c2.z(tL_error, "registerKey"));
                    break;
                }
            default:
                s1 s1Var = (s1) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                h0 h0Var2 = (h0) obj;
                String str3 = (String) obj2;
                c2Var.getClass();
                if (str3 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.e.c(new ci.o7(c2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new s1(2, b10, s1Var), 8));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    s1Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ b1(c2 c2Var, s1 s1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = c2Var;
        this.f = s1Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
