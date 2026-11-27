package j$.util.stream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
