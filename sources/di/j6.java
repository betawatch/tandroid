package di;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class j6 implements rg.c {
    public final /* synthetic */ rb a;

    public j6(rb rbVar) {
        this.a = rbVar;
    }

    @Override // rg.c
    public final void a() {
        rb rbVar = this.a;
        rbVar.D0(null, true);
        if (rbVar.M0) {
            pc pcVar = rbVar.A2;
            pcVar.c1.f.d();
            pcVar.l0(-1, false, true);
            rbVar.M0 = false;
        }
        rbVar.O0(false);
    }

    @Override // rg.c
    public final rg.k b() {
        return this.a.J0;
    }
}
