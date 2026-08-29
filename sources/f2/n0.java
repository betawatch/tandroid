package f2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (recyclerView.E && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.C) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.H) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.G = true;
                        break;
                    }
                }
                break;
            default:
                RecyclerView recyclerView2 = this.b;
                u0 u0Var = recyclerView2.V;
                if (u0Var != null) {
                    u0Var.m();
                }
                recyclerView2.v0 = false;
                break;
        }
    }
}
