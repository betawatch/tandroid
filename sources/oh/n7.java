package oh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n7 extends f4 {
    public final /* synthetic */ o7 b4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(o7 o7Var, Context context, i9 i9Var, c4 c4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i9Var, c4Var, g6Var);
        this.b4 = o7Var;
    }

    @Override // oh.f4
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.b4.g.getCurrentItem();
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
