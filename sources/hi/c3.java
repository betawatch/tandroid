package hi;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ c3(z3 z3Var, a aVar, int i10) {
        this.a = i10;
        this.b = z3Var;
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
