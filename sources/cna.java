// default package

import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
