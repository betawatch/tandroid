// default package

import android.view.Surface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ep9 implements aq9 {
    public final /* synthetic */ pp9 a;

    public ep9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override // aq9
    public final void a(int i, int i2) {
        gm.c3(new ku(this, i / i2, (byte) 4));
    }

    @Override // aq9
    public final boolean b() {
        return true;
    }

    @Override // aq9
    public final Surface getSurface() {
        return this.a.r0;
    }
}
