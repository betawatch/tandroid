package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.qp;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class p3 extends qp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 21, d6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((r3) this.e).invalidate();
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
    public p3(r3 r3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 24, d6Var);
        this.d = 0;
        this.e = r3Var;
    }
}
