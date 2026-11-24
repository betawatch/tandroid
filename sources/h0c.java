// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0c implements zw5, yw5 {
    public final /* synthetic */ b1c a;
    public final /* synthetic */ k27 b;
    public final /* synthetic */ m11 c;
    public final /* synthetic */ go2 d;

    public /* synthetic */ h0c(b1c b1cVar, k27 k27Var, m11 m11Var, go2 go2Var) {
        this.a = b1cVar;
        this.b = k27Var;
        this.c = m11Var;
        this.d = go2Var;
    }

    @Override // zw5
    public final void a(String str) {
        gl.d3(new tsa(this.a, this.b, str, this.c, this.d, (byte) 7));
    }

    @Override // yw5
    public final void n(Exception exc) {
        gl.d3(new exa((Object) this.a, (Object) this.b, (Object) this.c, (Object) this.d, (byte) 15));
    }
}
