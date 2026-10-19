package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hf1;
import org.telegram.ui.na0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements hf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Utilities.CallbackReturn c;
    public final /* synthetic */ Utilities.Callback2 d;
    public final /* synthetic */ r2 e;
    public final /* synthetic */ Utilities.Callback3 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ na0 r;

    public /* synthetic */ n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, na0 na0Var, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = callbackReturn;
        this.d = callback2;
        this.e = r2Var;
        this.f = callback3;
        this.h = z10;
        this.n = z11;
        this.r = na0Var;
    }

    @Override // org.telegram.ui.hf1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                s2.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                s2.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
