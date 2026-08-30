package nh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class n7 extends d4 {
    public final /* synthetic */ o7 b4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(o7 o7Var, Context context, i9 i9Var, a4 a4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i9Var, a4Var, f6Var);
        this.b4 = o7Var;
    }

    @Override // nh.d4
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.b4.g.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (u.c) {
            u.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (u.c) {
            u.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
