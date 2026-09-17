package ji;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ y2(v3 v3Var, a aVar, int i10) {
        this.a = i10;
        this.b = v3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View y12 = this.b.y1(this.c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.c3(this.c);
                break;
            case 2:
                this.b.c3(this.c);
                break;
            case 3:
                this.b.d3(this.c);
                break;
            case 4:
                this.b.c3(this.c);
                break;
            default:
                this.b.c3(this.c);
                break;
        }
    }
}
