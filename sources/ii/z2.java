package ii;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                if (A1 instanceof d6) {
                    d6 d6Var = (d6) A1;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
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
