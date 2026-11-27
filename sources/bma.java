// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bma extends vk4 {
    public final zla a;
    public final ama b;
    public float c = 1.0f;

    public bma(zla zlaVar, ama amaVar) {
        this.a = zlaVar;
        this.b = amaVar;
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
