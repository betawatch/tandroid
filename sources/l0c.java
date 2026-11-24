// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        gl.c3(new i0c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override // yw5
    public final void n(Exception exc) {
        gl.c3(new o57((Object) this.a, (Object) this.b, this.c, this.d, (byte) 20));
    }
}
