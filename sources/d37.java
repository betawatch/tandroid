// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d37 extends gb2 {
    public final /* synthetic */ jr Ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d37(jr jrVar, Context context, int i, mv6 mv6Var, wjb wjbVar) {
        super(context, i, false, mv6Var, wjbVar);
        this.Ld = jrVar;
    }

    @Override // gb2, hf0, android.view.View, mib
    public final void invalidate() {
        super.invalidate();
        ((f37) this.Ld.d).f.invalidate();
    }

    @Override // gb2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f37 f37Var = (f37) this.Ld.d;
        int i5 = f37.e0;
        f37Var.h(this);
    }

    @Override // gb2
    public final void z3(k27 k27Var, f27 f27Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super.z3(k27Var, f27Var, z, z2, z3, z4);
        f37 f37Var = (f37) this.Ld.d;
        int i = f37.e0;
        f37Var.h(this);
    }

    @Override // gb2, android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ((f37) this.Ld.d).f.invalidate();
    }
}
