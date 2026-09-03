package f2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
