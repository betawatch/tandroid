package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class t9 extends q5 {
    public final /* synthetic */ u9 e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(u9 u9Var, Context context, sb sbVar, n5 n5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, sbVar, n5Var, c6Var);
        this.e4 = u9Var;
    }

    @Override // bi.q5
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.e4.g.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (b0.c) {
            b0.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (b0.c) {
            b0.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
