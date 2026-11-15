package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements s10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c1(d2 d2Var, x21 x21Var, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, y1 y1Var) {
        this.b = d2Var;
        this.f = x21Var;
        this.g = i0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = y1Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        d2 d2Var = this.b;
        switch (i7) {
            case 0:
                x21 x21Var = (x21) this.f;
                i0 i0Var = (i0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                y1 y1Var = (y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new di.g7(d2Var, i0Var, tonconnectsession, str, bArr, y1Var, tonconnectchallenge, x21Var, 7));
                    break;
                } else {
                    x21Var.a(d2.z(tL_error, "registerKey"));
                    break;
                }
            default:
                t1 t1Var = (t1) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                i0 i0Var2 = (i0) obj;
                String str3 = (String) obj2;
                d2Var.getClass();
                if (str3 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.e.c(new di.g7(d2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new t1(2, b10, t1Var), 8));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    t1Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ c1(d2 d2Var, t1 t1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = d2Var;
        this.f = t1Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
