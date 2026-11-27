// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cja extends bja {
    public final /* synthetic */ dja H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cja(dja djaVar, Context context, int i) {
        super(djaVar.e, context, i, false);
        this.H = djaVar;
    }

    @Override // bja, j79
    public final void f() {
        super.f();
        dja djaVar = this.H;
        eja ejaVar = djaVar.e;
        int i = djaVar.a;
        int[] iArr = eja.t2;
        zha P = ejaVar.P(i);
        if (P != null && P.n.getVisibility() == 0) {
            djaVar.d.f();
        }
        if (P != null) {
            vga vgaVar = P.w;
            u5b u5bVar = this.s;
            vgaVar.e(u5bVar != null && (u5bVar.k() || (ejaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
