// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o45 extends yo {
    public final /* synthetic */ h75 c;

    public o45(h75 h75Var) {
        this.c = h75Var;
    }

    @Override // yo
    public final int i(int i) {
        int size = this.c.g4.e.size();
        if (size <= 1 || size == 2) {
            return 6;
        }
        return (size != 3 || i == 0 || i == 1) ? 3 : 6;
    }
}
