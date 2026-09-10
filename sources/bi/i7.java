package bi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i7 implements pg.c {
    public final /* synthetic */ ad a;

    public i7(ad adVar) {
        this.a = adVar;
    }

    @Override // pg.c
    public final void a() {
        ad adVar = this.a;
        adVar.D0(null, true);
        if (adVar.M0) {
            ce ceVar = adVar.A2;
            ceVar.c1.f.d();
            ceVar.l0(-1, false, true);
            adVar.M0 = false;
        }
        adVar.O0(false);
    }

    @Override // pg.c
    public final pg.j b() {
        return this.a.J0;
    }
}
