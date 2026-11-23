package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.op;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class y2 extends op {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(21, context, h6Var);
        this.d = i7;
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
                ((org.telegram.ui.Cells.u2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z2 z2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(24, context, h6Var);
        this.d = 0;
        this.e = z2Var;
    }
}
