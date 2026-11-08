package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ux;
import org.telegram.ui.i01;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c2 extends op {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.op
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, (org.telegram.ui.ActionBar.f6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.r0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, ((ux) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((el0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, ((i01) this.i).F.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ux uxVar) {
        super(1.25f);
        this.h = 2;
        this.i = uxVar;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.i = f6Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(i01 i01Var) {
        super(1.25f);
        this.h = 4;
        this.i = i01Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
