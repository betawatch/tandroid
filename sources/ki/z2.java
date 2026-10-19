package ki;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                View A1 = this.b.A1(this.c);
                if (A1 instanceof c6) {
                    c6 c6Var = (c6) A1;
                    c6Var.B();
                    c6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.e3(this.c);
                break;
            case 2:
                this.b.e3(this.c);
                break;
            case 3:
                this.b.f3(this.c);
                break;
            case 4:
                this.b.e3(this.c);
                break;
            default:
                this.b.e3(this.c);
                break;
        }
    }
}
