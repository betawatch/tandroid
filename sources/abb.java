// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class abb implements qk4 {
    public final /* synthetic */ sbb a;

    public abb(sbb sbbVar) {
        this.a = sbbVar;
    }

    @Override // qk4
    public final void setInvert(float f) {
        sbb sbbVar = this.a;
        hl.j3(sbbVar.n, f > 0.5f);
        hl.m3(sbbVar.n, f > 0.5f);
    }

    @Override // qk4
    public final void invalidate() {
    }
}
