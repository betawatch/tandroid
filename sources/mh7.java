// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mh7 implements la1, akc {
    public final na1 a;
    public final /* synthetic */ nh7 b;

    public mh7(nh7 nh7Var, na1 na1Var) {
        this.b = nh7Var;
        this.a = na1Var;
    }

    @Override // akc
    public final void a(nv9 nv9Var, int i) {
        this.a.a(nv9Var, i);
    }

    @Override // la1
    public final lo5 b(Object obj, gq4 gq4Var) {
        nh7 nh7Var = this.b;
        ma1 ma1Var = new ma1(nh7Var, this);
        lo5 E = this.a.E((g5c) obj, ma1Var);
        if (E != null) {
            nh7.h.set(nh7Var, null);
        }
        return E;
    }

    @Override // la1
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // fw2
    public final sw2 getContext() {
        return this.a.e;
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
