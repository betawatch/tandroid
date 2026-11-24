// default package

import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cna implements mw4, nw4 {
    public final /* synthetic */ kna a;

    @Override // nw4
    public final int i() {
        return this.a.Y0();
    }

    @Override // mw4
    public final void j(int i) {
        kna knaVar = this.a;
        cq3 cq3Var = knaVar.m2;
        if (Build.VERSION.SDK_INT < 31 || cq3Var == null) {
            return;
        }
        if (fod.a(i, 4)) {
            cq3Var.h(knaVar.X0.e());
        }
        cq3Var.e(knaVar.r2, knaVar.b.getWidth(), knaVar.b.getHeight());
    }
}
