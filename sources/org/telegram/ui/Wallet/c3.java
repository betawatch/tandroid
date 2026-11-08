package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements ma1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d20 c;
    public final /* synthetic */ v10 d;
    public final /* synthetic */ g3 e;
    public final /* synthetic */ x10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ bg.v0 r;

    public /* synthetic */ c3(int i7, d20 d20Var, v10 v10Var, g3 g3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = d20Var;
        this.d = v10Var;
        this.e = g3Var;
        this.f = x10Var;
        this.h = z9;
        this.n = z10;
        this.r = v0Var;
    }

    @Override // org.telegram.ui.ma1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
