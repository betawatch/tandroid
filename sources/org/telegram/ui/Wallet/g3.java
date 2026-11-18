package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements oa1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ y10 c;
    public final /* synthetic */ q10 d;
    public final /* synthetic */ m3 e;
    public final /* synthetic */ s10 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ m.b3 r;

    public /* synthetic */ g3(int i7, y10 y10Var, q10 q10Var, m3 m3Var, s10 s10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = y10Var;
        this.d = q10Var;
        this.e = m3Var;
        this.f = s10Var;
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
