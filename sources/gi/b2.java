package gi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.rx;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b2 extends op {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b2(int i3, FrameLayout frameLayout) {
        this.h = i3;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.op
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, (org.telegram.ui.ActionBar.e6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.i).c.b.s0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, ((rx) this.i).H.a2);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((il0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, ((yz0) this.i).G.a1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(rx rxVar) {
        super(1.25f);
        this.h = 2;
        this.i = rxVar;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.i = e6Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(yz0 yz0Var) {
        super(1.25f);
        this.h = 4;
        this.i = yz0Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
