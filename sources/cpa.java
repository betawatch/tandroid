// default package

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cpa implements oy4, py4 {
    public final /* synthetic */ kpa a;

    @Override // py4
    public final int i() {
        return this.a.Y0();
    }

    @Override // oy4
    public final void s(int i) {
        kpa kpaVar = this.a;
        mr3 mr3Var = kpaVar.m2;
        if (Build.VERSION.SDK_INT < 31 || mr3Var == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            mr3Var.h(kpaVar.X0.e());
        }
        mr3Var.e(kpaVar.r2, kpaVar.b.getWidth(), kpaVar.b.getHeight());
    }
}
