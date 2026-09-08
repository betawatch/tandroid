package ji;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
