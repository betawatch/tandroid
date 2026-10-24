package ki;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ z2(w3 w3Var, a aVar, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View F1 = this.b.F1(this.c);
                if (F1 instanceof c6) {
                    c6 c6Var = (c6) F1;
                    c6Var.A();
                    c6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.j3(this.c);
                break;
            case 2:
                this.b.j3(this.c);
                break;
            case 3:
                this.b.k3(this.c);
                break;
            case 4:
                this.b.j3(this.c);
                break;
            default:
                this.b.j3(this.c);
                break;
        }
    }
}
