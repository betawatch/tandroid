package bi;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ a c;

    public /* synthetic */ h3(d4 d4Var, a aVar, int i10) {
        this.a = i10;
        this.b = d4Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View C1 = this.b.C1(this.c);
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    q6Var.getEditText().setSelection(0);
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
