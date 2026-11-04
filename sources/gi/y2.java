package gi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y2 extends wo {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(21, context, e6Var);
        this.d = i3;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((z2) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.t2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z2 z2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(24, context, e6Var);
        this.d = 0;
        this.e = z2Var;
    }
}
