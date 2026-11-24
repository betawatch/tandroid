// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ nd9(ye9 ye9Var, int i, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                ye9Var.d4(i);
                break;
            case 1:
                ye9Var.f4(i);
                break;
            case 2:
                ye9Var.scrollBy(0, i);
                break;
            default:
                ye9Var.e4(i);
                break;
        }
    }
}
