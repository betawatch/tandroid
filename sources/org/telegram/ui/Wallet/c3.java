package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aa0;
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements gc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r20 c;
    public final /* synthetic */ j20 d;
    public final /* synthetic */ g3 e;
    public final /* synthetic */ l20 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ aa0 r;

    public /* synthetic */ c3(int i10, r20 r20Var, j20 j20Var, g3 g3Var, l20 l20Var, boolean z10, boolean z11, aa0 aa0Var, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = r20Var;
        this.d = j20Var;
        this.e = g3Var;
        this.f = l20Var;
        this.h = z10;
        this.n = z11;
        this.r = aa0Var;
    }

    @Override // org.telegram.ui.gc1
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                h3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                h3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
