// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
