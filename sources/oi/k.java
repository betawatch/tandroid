package oi;

import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ im0 c;
    public final /* synthetic */ q d;

    public k(q qVar, im0 im0Var) {
        this.d = qVar;
        this.c = im0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im0 im0Var = this.c;
        int scrollX = im0Var.getScrollX();
        int scrollY = im0Var.getScrollY();
        int i7 = scrollX - this.a;
        q qVar = this.d;
        qVar.k += i7;
        qVar.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.g++;
    }
}
