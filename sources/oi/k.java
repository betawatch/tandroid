package oi;

import org.telegram.ui.Components.gp0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ gp0 c;
    public final /* synthetic */ q d;

    public k(q qVar, gp0 gp0Var) {
        this.d = qVar;
        this.c = gp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gp0 gp0Var = this.c;
        int scrollX = gp0Var.getScrollX();
        int scrollY = gp0Var.getScrollY();
        int i10 = scrollX - this.a;
        q qVar = this.d;
        qVar.i += i10;
        qVar.j += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.e++;
    }
}
