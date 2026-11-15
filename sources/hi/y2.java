package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.fp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y2 extends fp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(21, context, e6Var);
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
                ((org.telegram.ui.Cells.t2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
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
