package org.telegram.ui.Wallet;

import org.telegram.messenger.a20;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ka1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements ka1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a20 c;
    public final /* synthetic */ s10 d;
    public final /* synthetic */ e3 e;
    public final /* synthetic */ u10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ bg.u0 r;

    public /* synthetic */ a3(int i7, a20 a20Var, s10 s10Var, e3 e3Var, u10 u10Var, boolean z10, boolean z11, bg.u0 u0Var, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = a20Var;
        this.d = s10Var;
        this.e = e3Var;
        this.f = u10Var;
        this.h = z10;
        this.n = z11;
        this.r = u0Var;
    }

    @Override // org.telegram.ui.ka1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                f3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                f3.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
