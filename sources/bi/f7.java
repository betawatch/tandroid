package bi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 b;

    public /* synthetic */ f7(org.telegram.ui.ActionBar.j5 j5Var, int i7) {
        this.a = i7;
        this.b = j5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            case 1:
                this.b.a(true);
                break;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = this.b;
                if (!j5Var.I && j5Var.S) {
                    j5Var.c();
                    break;
                }
                break;
        }
    }
}
