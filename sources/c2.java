// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class c2 implements qw2 {
    public final rw2 a;

    public c2(rw2 rw2Var) {
        this.a = rw2Var;
    }

    @Override // sw2
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(obj, this);
    }

    @Override // sw2
    public qw2 get(rw2 rw2Var) {
        return kud.a(this, rw2Var);
    }

    @Override // qw2
    public final rw2 getKey() {
        return this.a;
    }

    @Override // sw2
    public sw2 minusKey(rw2 rw2Var) {
        return kud.b(this, rw2Var);
    }

    @Override // sw2
    public final sw2 plus(sw2 sw2Var) {
        return kud.c(this, sw2Var);
    }
}
