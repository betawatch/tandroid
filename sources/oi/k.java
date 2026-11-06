package oi;

import org.telegram.ui.Components.hm0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ hm0 c;
    public final /* synthetic */ q d;

    public k(q qVar, hm0 hm0Var) {
        this.d = qVar;
        this.c = hm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hm0 hm0Var = this.c;
        int scrollX = hm0Var.getScrollX();
        int scrollY = hm0Var.getScrollY();
        int i7 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i7;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
