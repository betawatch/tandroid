// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k57 extends wb2 {
    public final /* synthetic */ kr Ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k57(kr krVar, Context context, int i, rx6 rx6Var, vnb vnbVar) {
        super(context, i, false, rx6Var, vnbVar);
        this.Ld = krVar;
    }

    @Override // wb2, jf0, android.view.View
    public final void invalidate() {
        super.invalidate();
        ((m57) this.Ld.d).f.invalidate();
    }

    @Override // wb2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m57 m57Var = (m57) this.Ld.d;
        int i5 = m57.e0;
        m57Var.h(this);
    }

    @Override // wb2
    public final void z3(r47 r47Var, m47 m47Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super.z3(r47Var, m47Var, z, z2, z3, z4);
        m57 m57Var = (m57) this.Ld.d;
        int i = m57.e0;
        m57Var.h(this);
    }

    @Override // wb2, android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ((m57) this.Ld.d).f.invalidate();
    }
}
