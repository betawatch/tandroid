package ii;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                View B1 = this.b.B1(this.c);
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.f3(this.c);
                break;
            case 2:
                this.b.f3(this.c);
                break;
            case 3:
                this.b.g3(this.c);
                break;
            case 4:
                this.b.f3(this.c);
                break;
            default:
                this.b.f3(this.c);
                break;
        }
    }
}
