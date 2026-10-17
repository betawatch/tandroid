package ei;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.un0;
import org.telegram.ui.q41;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class f2 extends pq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.pq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((gz) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, ((un0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((q41) this.i).y.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(gz gzVar) {
        super(1.25f);
        this.h = 2;
        this.i = gzVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.i = d6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(q41 q41Var) {
        super(1.25f);
        this.h = 4;
        this.i = q41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
