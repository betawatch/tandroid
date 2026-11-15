package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yx;
import org.telegram.ui.f01;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b2 extends wp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.wp
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, (org.telegram.ui.ActionBar.e6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.i).c.b.s0;
            case 2:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, ((yx) this.i).H.a2);
            case 3:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Q5, ((jl0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, ((f01) this.i).G.a1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(yx yxVar) {
        super(1.25f);
        this.h = 2;
        this.i = yxVar;
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
    public b2(f01 f01Var) {
        super(1.25f);
        this.h = 4;
        this.i = f01Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
