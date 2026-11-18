package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.j01;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c2 extends dq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.dq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, (org.telegram.ui.ActionBar.i6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.r0) this.i).c.b.s0;
            case 2:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((ey) this.i).H.a2);
            case 3:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Q5, ((rl0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((j01) this.i).G.a1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ey eyVar) {
        super(1.25f);
        this.h = 2;
        this.i = eyVar;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.ActionBar.i6 i6Var) {
        super(1.25f);
        this.h = 0;
        this.i = i6Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(j01 j01Var) {
        super(1.25f);
        this.h = 4;
        this.i = j01Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
