package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h3 extends lp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(21, context, i6Var);
        this.d = i7;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((i3) this.e).invalidate();
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
    public h3(i3 i3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(24, context, i6Var);
        this.d = 0;
        this.e = i3Var;
    }
}
