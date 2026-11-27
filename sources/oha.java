// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oha extends bja {
    public final /* synthetic */ eja H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oha(eja ejaVar, Context context) {
        super(ejaVar, context, 0, false);
        this.H = ejaVar;
    }

    @Override // bja, j79
    public final void f() {
        super.f();
        eja ejaVar = this.H;
        zha P = ejaVar.P(8);
        if (P != null && P.n.getVisibility() == 0) {
            ejaVar.g0.f();
        }
        if (P != null) {
            vga vgaVar = P.w;
            u5b u5bVar = this.s;
            vgaVar.e(u5bVar != null && (u5bVar.k() || (ejaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
