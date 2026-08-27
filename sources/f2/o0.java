package f2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ o0(RecyclerView recyclerView, int i10) {
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
                v0 v0Var = recyclerView2.V;
                if (v0Var != null) {
                    v0Var.m();
                }
                recyclerView2.v0 = false;
                break;
        }
    }
}
