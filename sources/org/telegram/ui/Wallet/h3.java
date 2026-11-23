package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements ma1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ p10 d;
    public final /* synthetic */ n3 e;
    public final /* synthetic */ r10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ m.b3 r;

    public /* synthetic */ h3(int i7, x10 x10Var, p10 p10Var, n3 n3Var, r10 r10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = x10Var;
        this.d = p10Var;
        this.e = n3Var;
        this.f = r10Var;
        this.h = z10;
        this.n = z11;
        this.r = b3Var;
    }

    @Override // org.telegram.ui.ma1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                o3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                o3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
