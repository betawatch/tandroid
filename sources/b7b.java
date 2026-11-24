// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class b7b implements li4 {
    public final /* synthetic */ t7b a;

    public b7b(t7b t7bVar) {
        this.a = t7bVar;
    }

    @Override // li4
    public final void setInvert(float f) {
        t7b t7bVar = this.a;
        gl.j3(t7bVar.n, f > 0.5f);
        gl.m3(t7bVar.n, f > 0.5f);
    }

    @Override // li4
    public final void invalidate() {
    }
}
