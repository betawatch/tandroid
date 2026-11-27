package j$.util.stream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract class d5 extends f5 {
    @Override // j$.util.stream.a
    public final boolean L() {
        return true;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !b7.ORDERED.n(this.f) ? this : new b5(this, b7.r);
    }
}
