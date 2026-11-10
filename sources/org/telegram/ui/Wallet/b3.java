package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pa1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements pa1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d20 c;
    public final /* synthetic */ v10 d;
    public final /* synthetic */ f3 e;
    public final /* synthetic */ x10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ bg.v0 r;

    public /* synthetic */ b3(int i7, d20 d20Var, v10 v10Var, f3 f3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = d20Var;
        this.d = v10Var;
        this.e = f3Var;
        this.f = x10Var;
        this.h = z9;
        this.n = z10;
        this.r = v0Var;
    }

    @Override // org.telegram.ui.pa1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
