// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class l4c implements ez5, dz5 {
    public final /* synthetic */ a5c a;
    public final /* synthetic */ r47 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ l4c(a5c a5cVar, r47 r47Var, long j, int i) {
        this.a = a5cVar;
        this.b = r47Var;
        this.c = j;
        this.d = i;
    }

    @Override // ez5
    public final void a(String str) {
        hl.c3(new h4c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override // dz5
    public final void l(Exception exc) {
        hl.c3(new r77((Object) this.a, (Object) this.b, this.c, this.d, (byte) 20));
    }
}
