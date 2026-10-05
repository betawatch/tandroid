package li;

import org.telegram.ui.Components.so0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class j implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ so0 c;
    public final /* synthetic */ p d;

    public j(p pVar, so0 so0Var) {
        this.d = pVar;
        this.c = so0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        so0 so0Var = this.c;
        int scrollX = so0Var.getScrollX();
        int scrollY = so0Var.getScrollY();
        int i10 = scrollX - this.a;
        p pVar = this.d;
        pVar.i += i10;
        pVar.j += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        pVar.e++;
    }
}
