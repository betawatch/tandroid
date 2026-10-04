package ii;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ r2(x3 x3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = x3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View B1;
        View B12;
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    x3Var.getClass();
                    B1 = null;
                } else {
                    B1 = x3Var.B1(aVar);
                }
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(Math.min(this.d, f6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                x3 x3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    B12 = null;
                } else {
                    B12 = x3Var2.B1(aVar2);
                }
                if (B12 instanceof f6) {
                    f6 f6Var2 = (f6) B12;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(Math.min(this.d, f6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View B13 = this.b.B1(this.c);
                if (B13 instanceof f6) {
                    f6 f6Var3 = (f6) B13;
                    f6Var3.B();
                    f6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View B14 = this.b.B1(this.c);
                if (B14 instanceof f6) {
                    f6 f6Var4 = (f6) B14;
                    f6Var4.B();
                    f6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View B15 = this.b.B1(this.c);
                if (B15 instanceof f6) {
                    f6 f6Var5 = (f6) B15;
                    f6Var5.B();
                    f6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View B16 = this.b.B1(this.c);
                if (B16 instanceof f6) {
                    f6 f6Var6 = (f6) B16;
                    f6Var6.B();
                    f6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
