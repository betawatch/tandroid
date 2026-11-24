// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d57 extends rc2 {
    public final /* synthetic */ js Ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d57(js jsVar, Context context, int i, mx6 mx6Var, ylb ylbVar) {
        super(context, i, false, mx6Var, ylbVar);
        this.Ld = jsVar;
    }

    @Override // rc2, hg0, android.view.View
    public final void invalidate() {
        super.invalidate();
        ((f57) this.Ld.d).f.invalidate();
    }

    @Override // rc2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f57 f57Var = (f57) this.Ld.d;
        int i5 = f57.e0;
        f57Var.h(this);
    }

    @Override // rc2
    public final void z3(k47 k47Var, f47 f47Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super.z3(k47Var, f47Var, z, z2, z3, z4);
        f57 f57Var = (f57) this.Ld.d;
        int i = f57.e0;
        f57Var.h(this);
    }

    @Override // rc2, android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ((f57) this.Ld.d).f.invalidate();
    }
}
