// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kw4 implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ tu9 c;
    public final /* synthetic */ qw4 d;

    public kw4(qw4 qw4Var, tu9 tu9Var) {
        this.d = qw4Var;
        this.c = tu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tu9 tu9Var = this.c;
        int scrollX = tu9Var.getScrollX();
        int scrollY = tu9Var.getScrollY();
        int i = scrollX - this.a;
        qw4 qw4Var = this.d;
        qw4Var.k += i;
        qw4Var.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qw4Var.g++;
    }
}
