package f2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ n0(RecyclerView recyclerView, int i10) {
        this.a = i10;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b;
                if (recyclerView.F && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.D) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.I) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.H = true;
                        break;
                    }
                }
                break;
            default:
                RecyclerView recyclerView2 = this.b;
                u0 u0Var = recyclerView2.W;
                if (u0Var != null) {
                    u0Var.m();
                }
                recyclerView2.w0 = false;
                break;
        }
    }
}
