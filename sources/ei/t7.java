package ei;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t7 extends j4 {
    public final /* synthetic */ u7 P3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(u7 u7Var, Context context, r9 r9Var, g4 g4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, r9Var, g4Var, e6Var);
        this.P3 = u7Var;
    }

    @Override // ei.j4
    public final boolean I0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (w.c) {
            w.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (w.c) {
            w.b.add(this);
        } else {
            super.invalidate(i3, i10, i11, i12);
        }
    }
}
