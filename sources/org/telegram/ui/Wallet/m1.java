package org.telegram.ui.Wallet;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements p10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m1(m2 m2Var, a31 a31Var, s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, h2 h2Var) {
        this.b = m2Var;
        this.f = a31Var;
        this.g = s0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = h2Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        m2 m2Var = this.b;
        switch (i7) {
            case 0:
                a31 a31Var = (a31) this.f;
                s0 s0Var = (s0) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                h2 h2Var = (h2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m2Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new di.j7(m2Var, s0Var, tonconnectsession, str, bArr, h2Var, tonconnectchallenge, a31Var, 7));
                    break;
                } else {
                    a31Var.a(m2.z(tL_error, "registerKey"));
                    break;
                }
            default:
                f0 f0Var = (f0) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                s0 s0Var2 = (s0) obj;
                String str3 = (String) obj2;
                m2Var.getClass();
                if (str3 == null && s0Var2 != null) {
                    s0 b10 = s0Var2.b();
                    Utilities.e.c(new di.j7(m2Var, b10, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new f0(5, b10, f0Var), 8));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    f0Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ m1(m2 m2Var, f0 f0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = m2Var;
        this.f = f0Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }
}
