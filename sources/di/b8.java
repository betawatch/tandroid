package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b8 extends q4 {
    public final /* synthetic */ c8 U3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(c8 c8Var, Context context, y9 y9Var, n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, y9Var, n4Var, u6Var);
        this.U3 = c8Var;
    }

    @Override // di.q4
    public final boolean I0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.U3.f.getCurrentItem();
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
