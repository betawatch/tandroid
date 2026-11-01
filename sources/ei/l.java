package ei;

import org.telegram.ui.Components.jn0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class l implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ jn0 c;
    public final /* synthetic */ r d;

    public l(r rVar, jn0 jn0Var) {
        this.d = rVar;
        this.c = jn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jn0 jn0Var = this.c;
        int scrollX = jn0Var.getScrollX();
        int scrollY = jn0Var.getScrollY();
        int i10 = scrollX - this.a;
        r rVar = this.d;
        rVar.k += i10;
        rVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        rVar.g++;
    }
}
