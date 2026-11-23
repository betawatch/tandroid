package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements oa1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ z10 c;
    public final /* synthetic */ r10 d;
    public final /* synthetic */ m3 e;
    public final /* synthetic */ t10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ m.b3 r;

    public /* synthetic */ g3(int i7, z10 z10Var, r10 r10Var, m3 m3Var, t10 t10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = z10Var;
        this.d = r10Var;
        this.e = m3Var;
        this.f = t10Var;
        this.h = z10;
        this.n = z11;
        this.r = b3Var;
    }

    @Override // org.telegram.ui.oa1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                n3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                n3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
