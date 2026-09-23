package ii;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                View z12 = this.b.z1(this.c);
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
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
