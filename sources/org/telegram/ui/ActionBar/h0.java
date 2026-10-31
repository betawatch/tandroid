package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.vp;
import org.telegram.ui.a21;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 extends vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ h0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.vp
    public final int a() {
        switch (this.h) {
            case 0:
                return ((t0) this.i).c.b.r0;
            case 1:
                return t6.w0(t6.yf, ((iy) this.i).G.Z1);
            case 2:
                return t6.w0(t6.Q5, ((hm0) this.i).e);
            case 3:
                return t6.w0(t6.yf, ((a21) this.i).F.Z0);
            default:
                return t6.w0(t6.yf, (p6) this.i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(iy iyVar) {
        super(1.25f);
        this.h = 1;
        this.i = iyVar;
        this.f = org.telegram.messenger.i0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p6 p6Var) {
        super(1.25f);
        this.h = 4;
        this.i = p6Var;
        this.f = org.telegram.messenger.i0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a21 a21Var) {
        super(1.25f);
        this.h = 3;
        this.i = a21Var;
        this.f = org.telegram.messenger.i0.L(7.0f);
    }
}
