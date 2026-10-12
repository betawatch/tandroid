package di;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.i61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i2 extends sq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ i2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.sq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Je, (org.telegram.ui.ActionBar.c6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Je, ((iz) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Q5, ((zn0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Je, ((i61) this.i).y.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(iz izVar) {
        super(1.25f);
        this.h = 2;
        this.i = izVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.i = c6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(i61 i61Var) {
        super(1.25f);
        this.h = 4;
        this.i = i61Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
