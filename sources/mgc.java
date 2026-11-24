// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mgc extends vgc {
    public final /* synthetic */ wgc u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgc(wgc wgcVar, Context context, boolean z, int i, ylb ylbVar) {
        super(i, ylbVar, context, z);
        this.u0 = wgcVar;
    }

    @Override // vgc
    public final void f(float f, int i, int i2) {
        super.f(f, i, i2);
        this.u0.z(f <= 0.5f ? i : i2, i < i2);
    }
}
