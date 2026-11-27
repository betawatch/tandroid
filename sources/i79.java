// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class i79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ i79(RecyclerView recyclerView, byte b) {
        this.a = b;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                if (recyclerView.J && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.H) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.M) {
                        recyclerView.q();
                        break;
                    } else {
                        recyclerView.L = true;
                        break;
                    }
                }
                break;
            default:
                o79 o79Var = recyclerView.d0;
                if (o79Var != null) {
                    o79Var.m();
                }
                recyclerView.B0 = false;
                break;
        }
    }
}
