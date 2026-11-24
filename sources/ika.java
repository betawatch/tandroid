// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ika extends vk4 {
    public final gka a;
    public final hka b;
    public float c = 1.0f;

    public ika(gka gkaVar, hka hkaVar) {
        this.a = gkaVar;
        this.b = hkaVar;
    }

    @Override // vk4
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // vk4
    public final void b(Object obj, float f) {
        this.b.d(obj, f / this.c);
    }
}
