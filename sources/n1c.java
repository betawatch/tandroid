// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n1c implements bja {
    public int a;
    public boolean b;
    public final /* synthetic */ o1c c;

    public n1c(o1c o1cVar) {
        this.c = o1cVar;
    }

    @Override // bja
    public final void L(int i, boolean z) {
        if (this.a == i && this.b == z) {
            return;
        }
        this.a = i;
        this.b = z;
        if (i > gl.L(20.0f)) {
            o1c o1cVar = this.c;
            if (o1cVar.n0) {
                return;
            }
            o1cVar.u0.r0 = false;
            o1cVar.n0 = true;
        }
    }
}
