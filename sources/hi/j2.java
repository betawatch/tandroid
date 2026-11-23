package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.i01;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j2 extends cq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.cq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, (org.telegram.ui.ActionBar.i6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.i).c.b.s0;
            case 2:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((dy) this.i).H.a2);
            case 3:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Q5, ((tl0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((i01) this.i).G.a1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(dy dyVar) {
        super(1.25f);
        this.h = 2;
        this.i = dyVar;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(org.telegram.ui.ActionBar.i6 i6Var) {
        super(1.25f);
        this.h = 0;
        this.i = i6Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(i01 i01Var) {
        super(1.25f);
        this.h = 4;
        this.i = i01Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
