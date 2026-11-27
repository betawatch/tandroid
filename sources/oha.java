// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
            v5b v5bVar = this.s;
            vgaVar.e(v5bVar != null && (v5bVar.k() || (ejaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
