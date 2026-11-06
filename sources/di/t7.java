package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t7 extends i4 {
    public final /* synthetic */ u7 O3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(u7 u7Var, Context context, p9 p9Var, f4 f4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p9Var, f4Var, f6Var);
        this.O3 = u7Var;
    }

    @Override // di.i4
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
