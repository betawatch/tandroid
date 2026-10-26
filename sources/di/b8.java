package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b8 extends q4 {
    public final /* synthetic */ c8 T3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(c8 c8Var, Context context, y9 y9Var, n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, y9Var, n4Var, u6Var);
        this.T3 = c8Var;
    }

    @Override // di.q4
    public final boolean I0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.T3.g.getCurrentItem();
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
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.c) {
            w.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
