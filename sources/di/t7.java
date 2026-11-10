package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t7 extends j4 {
    public final /* synthetic */ u7 O3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(u7 u7Var, Context context, q9 q9Var, g4 g4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, q9Var, g4Var, h6Var);
        this.O3 = u7Var;
    }

    @Override // di.j4
    public final boolean I0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.O3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
