package fi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ v5(p6 p6Var, int i7) {
        this.a = i7;
        this.b = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p6 p6Var = this.b;
                p6Var.R = false;
                p6Var.S = null;
                break;
            case 1:
                p6 p6Var2 = this.b;
                p6Var2.s = true;
                p6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                p6 p6Var3 = this.b;
                p6Var3.R = false;
                p6Var3.S = null;
                break;
        }
    }
}
