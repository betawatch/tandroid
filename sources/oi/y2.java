package oi;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ y2(t3 t3Var, a aVar, int i7) {
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
