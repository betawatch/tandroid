package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.of1;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements of1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Utilities.CallbackReturn c;
    public final /* synthetic */ Utilities.Callback2 d;
    public final /* synthetic */ q2 e;
    public final /* synthetic */ Utilities.Callback3 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ ta0 r;

    public /* synthetic */ m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ta0 ta0Var, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f = callback3;
        this.h = z10;
        this.n = z11;
        this.r = ta0Var;
    }

    @Override // org.telegram.ui.of1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                r2.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                r2.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
