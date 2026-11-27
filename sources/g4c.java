// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class g4c implements ez5, dz5 {
    public final /* synthetic */ a5c a;
    public final /* synthetic */ r47 b;
    public final /* synthetic */ v11 c;
    public final /* synthetic */ zo2 d;

    public /* synthetic */ g4c(a5c a5cVar, r47 r47Var, v11 v11Var, zo2 zo2Var) {
        this.a = a5cVar;
        this.b = r47Var;
        this.c = v11Var;
        this.d = zo2Var;
    }

    @Override // ez5
    public final void a(String str) {
        hl.c3(new uwa(this.a, this.b, str, this.c, this.d, (byte) 8));
    }

    @Override // dz5
    public final void l(Exception exc) {
        hl.c3(new kta((Object) this.a, (Object) this.b, (Object) this.c, (Object) this.d, (byte) 16));
    }
}
