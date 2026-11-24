// default package

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d24 implements Runnable {
    public final /* synthetic */ e24 a;

    public d24(e24 e24Var) {
        this.a = e24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        pv3 pv3Var = new pv3(this, str, (byte) 8);
        if (gw3.d(str)) {
            u0b.G3.c(z8c.t0, str, new qy1((Object) linkedHashSet, (Object) pv3Var, (byte) 17));
        } else {
            pv3Var.run();
        }
    }
}
