package di;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.a61;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class j2 extends eq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.eq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, (org.telegram.ui.ActionBar.f6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((xy) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, ((wm0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((a61) this.i).y.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(xy xyVar) {
        super(1.25f);
        this.h = 2;
        this.i = xyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.i = f6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(a61 a61Var) {
        super(1.25f);
        this.h = 4;
        this.i = a61Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
