// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kma implements fw2, cx2 {
    public final fw2 a;
    public final sw2 b;

    public kma(fw2 fw2Var, sw2 sw2Var) {
        this.a = fw2Var;
        this.b = sw2Var;
    }

    @Override // cx2
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.a;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    @Override // fw2
    public final sw2 getContext() {
        return this.b;
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
