package ii;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ a3(x3 x3Var, a aVar, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View A1 = this.b.A1(this.c);
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
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
