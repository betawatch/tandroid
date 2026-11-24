// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ez5 d;

    public /* synthetic */ ab6(jb6 jb6Var, String str, ez5 ez5Var, byte b) {
        this.a = b;
        this.b = jb6Var;
        this.c = str;
        this.d = ez5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        ez5 ez5Var = this.d;
        String str = this.c;
        jb6 jb6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ab6(jb6Var, str, ez5Var, b2));
                break;
            default:
                oc7.d1().edit().putBoolean("langpack_patched" + str, true).apply();
                ez5Var.run();
                jb6Var.Q = false;
                break;
        }
    }
}
