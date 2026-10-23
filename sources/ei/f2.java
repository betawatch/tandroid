package ei;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.s41;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, (org.telegram.ui.ActionBar.g6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, ((gz) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((yn0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, ((s41) this.i).F.Z0);
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
    public f2(org.telegram.ui.ActionBar.g6 g6Var) {
        super(1.25f);
        this.h = 0;
        this.i = g6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(s41 s41Var) {
        super(1.25f);
        this.h = 4;
        this.i = s41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
