package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class d8 extends p4 {
    public final /* synthetic */ e8 e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e8 e8Var, Context context, z9 z9Var, m4 m4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, z9Var, m4Var, g6Var);
        this.e4 = e8Var;
    }

    @Override // ci.p4
    public final boolean J0() {
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
