// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
            v5b v5bVar = this.s;
            vgaVar.e(v5bVar != null && (v5bVar.k() || (ejaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
