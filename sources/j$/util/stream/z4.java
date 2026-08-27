package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class z4 extends b5 {
    @Override // j$.util.stream.a
    public final boolean P0() {
        return true;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !v6.ORDERED.m(this.m) ? this : new x4(this, v6.r);
    }
}
