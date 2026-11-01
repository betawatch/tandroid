package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.messenger.m20;
import org.telegram.messenger.s20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ec1;
import org.telegram.ui.z90;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements ec1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s20 c;
    public final /* synthetic */ k20 d;
    public final /* synthetic */ h3 e;
    public final /* synthetic */ m20 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ z90 r;

    public /* synthetic */ d3(int i10, s20 s20Var, k20 k20Var, h3 h3Var, m20 m20Var, boolean z10, boolean z11, z90 z90Var, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = s20Var;
        this.d = k20Var;
        this.e = h3Var;
        this.f = m20Var;
        this.h = z10;
        this.n = z11;
        this.r = z90Var;
    }

    @Override // org.telegram.ui.ec1
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                i3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                i3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
