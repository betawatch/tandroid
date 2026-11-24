// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l94 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c94(l94 l94Var, int i, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                l94Var.F0.add(Integer.valueOf(i));
                break;
            case 1:
                l94Var.F0.remove(Integer.valueOf(i));
                break;
            case 2:
                l94Var.F0.remove(Integer.valueOf(i));
                break;
            default:
                z94 z94Var = l94Var.g0;
                if (z94Var != null) {
                    z94Var.b(l94Var, i);
                }
                l94Var.g();
                break;
        }
    }
}
