// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0c implements zw5, yw5 {
    public final /* synthetic */ b1c a;
    public final /* synthetic */ k27 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ l0c(b1c b1cVar, k27 k27Var, long j, int i) {
        this.a = b1cVar;
        this.b = k27Var;
        this.c = j;
        this.d = i;
    }

    @Override // zw5
    public final void a(String str) {
        gl.d3(new i0c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override // yw5
    public final void n(Exception exc) {
        gl.d3(new o57((Object) this.a, (Object) this.b, this.c, this.d, (byte) 20));
    }
}
