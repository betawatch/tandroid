package lh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n7 extends d4 {
    public final /* synthetic */ o7 a4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(o7 o7Var, Context context, i9 i9Var, a4 a4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i9Var, a4Var, c6Var);
        this.a4 = o7Var;
    }

    @Override // lh.d4
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.a4.g.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (t.c) {
            t.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.c) {
            t.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
