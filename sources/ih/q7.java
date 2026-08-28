package ih;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q7 extends i4 {
    public final /* synthetic */ r7 a4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(r7 r7Var, Context context, m9 m9Var, f4 f4Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, m9Var, f4Var, b6Var);
        this.a4 = r7Var;
    }

    @Override // ih.i4
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.a4.g.getCurrentItem();
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
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate(i9, i10, i11, i12);
        }
    }
}
