// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
