package oi;

import org.telegram.ui.Components.hp0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ hp0 c;
    public final /* synthetic */ q d;

    public k(q qVar, hp0 hp0Var) {
        this.d = qVar;
        this.c = hp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hp0 hp0Var = this.c;
        int scrollX = hp0Var.getScrollX();
        int scrollY = hp0Var.getScrollY();
        int i10 = scrollX - this.a;
        q qVar = this.d;
        qVar.i += i10;
        qVar.j += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qVar.e++;
    }
}
