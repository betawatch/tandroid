package ei;

import org.telegram.ui.Components.in0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class l implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ in0 c;
    public final /* synthetic */ r d;

    public l(r rVar, in0 in0Var) {
        this.d = rVar;
        this.c = in0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in0 in0Var = this.c;
        int scrollX = in0Var.getScrollX();
        int scrollY = in0Var.getScrollY();
        int i10 = scrollX - this.a;
        r rVar = this.d;
        rVar.k += i10;
        rVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        rVar.g++;
    }
}
