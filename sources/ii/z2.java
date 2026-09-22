package ii;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                View z12 = this.b.z1(this.c);
                if (z12 instanceof d6) {
                    d6 d6Var = (d6) z12;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.d3(this.c);
                break;
            case 2:
                this.b.d3(this.c);
                break;
            case 3:
                this.b.e3(this.c);
                break;
            case 4:
                this.b.d3(this.c);
                break;
            default:
                this.b.d3(this.c);
                break;
        }
    }
}
