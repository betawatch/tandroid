// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e44 extends g44 {
    public final na1 c;
    public final /* synthetic */ i44 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e44(i44 i44Var, long j, na1 na1Var) {
        super(j);
        this.d = i44Var;
        this.c = na1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.C(this.d);
    }

    @Override // g44
    public final String toString() {
        return super.toString() + this.c;
    }
}
