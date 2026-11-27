// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
