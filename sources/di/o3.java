package di;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.aq;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class o3 extends aq {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 21, c6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((q3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(q3 q3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 24, c6Var);
        this.d = 0;
        this.e = q3Var;
    }
}
