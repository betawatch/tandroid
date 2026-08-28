package f2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ q0(RecyclerView recyclerView, int i9) {
        this.a = i9;
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
                w0 w0Var = recyclerView2.V;
                if (w0Var != null) {
                    w0Var.m();
                }
                recyclerView2.v0 = false;
                break;
        }
    }
}
