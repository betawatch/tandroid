package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ca1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements ca1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v10 c;
    public final /* synthetic */ n10 d;
    public final /* synthetic */ f3 e;
    public final /* synthetic */ p10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ cg.u0 r;

    public /* synthetic */ b3(int i3, v10 v10Var, n10 n10Var, f3 f3Var, p10 p10Var, boolean z10, boolean z11, cg.u0 u0Var, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = v10Var;
        this.d = n10Var;
        this.e = f3Var;
        this.f = p10Var;
        this.h = z10;
        this.n = z11;
        this.r = u0Var;
    }

    @Override // org.telegram.ui.ca1
    public final void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                g3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                g3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
