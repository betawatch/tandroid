// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class aga extends bja {
    public final /* synthetic */ eja H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aga(eja ejaVar, Context context) {
        super(ejaVar, context, 0, true);
        this.H = ejaVar;
    }

    @Override // bja, j79
    public final void f() {
        super.f();
        eja ejaVar = this.H;
        zha P = ejaVar.P(9);
        if (P != null && P.n.getVisibility() == 0) {
            ejaVar.i0.f();
        }
        if (P != null) {
            vga vgaVar = P.w;
            u5b u5bVar = this.s;
            vgaVar.e(u5bVar != null && (u5bVar.k() || (ejaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
