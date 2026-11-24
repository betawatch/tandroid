// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class my4 implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ ww9 c;
    public final /* synthetic */ sy4 d;

    public my4(sy4 sy4Var, ww9 ww9Var) {
        this.d = sy4Var;
        this.c = ww9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ww9 ww9Var = this.c;
        int scrollX = ww9Var.getScrollX();
        int scrollY = ww9Var.getScrollY();
        int i = scrollX - this.a;
        sy4 sy4Var = this.d;
        sy4Var.k += i;
        sy4Var.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        sy4Var.g++;
    }
}
