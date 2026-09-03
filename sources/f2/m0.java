package f2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ m0(RecyclerView recyclerView, int i10) {
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
                t0 t0Var = recyclerView2.W;
                if (t0Var != null) {
                    t0Var.m();
                }
                recyclerView2.w0 = false;
                break;
        }
    }
}
