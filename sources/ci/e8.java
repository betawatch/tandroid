package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e8 extends q4 {
    public final /* synthetic */ f8 e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(f8 f8Var, Context context, aa aaVar, n4 n4Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, aaVar, n4Var, d6Var);
        this.e4 = f8Var;
    }

    @Override // ci.q4
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.e4.g.getCurrentItem();
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
