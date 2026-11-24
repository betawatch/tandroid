// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class b7b implements li4 {
    public final /* synthetic */ t7b a;

    public b7b(t7b t7bVar) {
        this.a = t7bVar;
    }

    @Override // li4
    public final void setInvert(float f) {
        t7b t7bVar = this.a;
        gl.k3(t7bVar.n, f > 0.5f);
        gl.n3(t7bVar.n, f > 0.5f);
    }

    @Override // li4
    public final void invalidate() {
    }
}
