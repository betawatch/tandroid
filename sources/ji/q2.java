package ji;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ q2(x3 x3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = x3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View A1;
        View A12;
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    x3Var.getClass();
                    A1 = null;
                } else {
                    A1 = x3Var.A1(aVar);
                }
                if (A1 instanceof i6) {
                    i6 i6Var = (i6) A1;
                    i6Var.B();
                    i6Var.getEditText().setSelection(Math.min(this.d, i6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                x3 x3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = x3Var2.A1(aVar2);
                }
                if (A12 instanceof i6) {
                    i6 i6Var2 = (i6) A12;
                    i6Var2.B();
                    i6Var2.getEditText().setSelection(Math.min(this.d, i6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View A13 = this.b.A1(this.c);
                if (A13 instanceof i6) {
                    i6 i6Var3 = (i6) A13;
                    i6Var3.B();
                    i6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View A14 = this.b.A1(this.c);
                if (A14 instanceof i6) {
                    i6 i6Var4 = (i6) A14;
                    i6Var4.B();
                    i6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View A15 = this.b.A1(this.c);
                if (A15 instanceof i6) {
                    i6 i6Var5 = (i6) A15;
                    i6Var5.B();
                    i6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View A16 = this.b.A1(this.c);
                if (A16 instanceof i6) {
                    i6 i6Var6 = (i6) A16;
                    i6Var6.B();
                    i6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
