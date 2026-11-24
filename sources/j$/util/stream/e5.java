package j$.util.stream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class e5 extends f5 {
    @Override // j$.util.stream.a
    public final boolean L() {
        return false;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !b7.ORDERED.n(this.f) ? this : new b5(this, b7.r);
    }
}
