package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class q9 extends o5 {
    public final /* synthetic */ r9 e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(r9 r9Var, Context context, pb pbVar, l5 l5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, pbVar, l5Var, f6Var);
        this.e4 = r9Var;
    }

    @Override // bi.o5
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
