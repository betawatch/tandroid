package li;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ x2(t3 t3Var, a aVar, int i7) {
        this.a = i7;
        this.b = t3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View C1 = this.b.C1(this.c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.g3(this.c);
                break;
            case 2:
                this.b.g3(this.c);
                break;
            case 3:
                this.b.h3(this.c);
                break;
            case 4:
                this.b.g3(this.c);
                break;
            default:
                this.b.g3(this.c);
                break;
        }
    }
}
