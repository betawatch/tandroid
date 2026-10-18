package ki;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ q2(w3 w3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = w3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View A1;
        View A12;
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    w3Var.getClass();
                    A1 = null;
                } else {
                    A1 = w3Var.A1(aVar);
                }
                if (A1 instanceof c6) {
                    c6 c6Var = (c6) A1;
                    c6Var.B();
                    c6Var.getEditText().setSelection(Math.min(this.d, c6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                w3 w3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = w3Var2.A1(aVar2);
                }
                if (A12 instanceof c6) {
                    c6 c6Var2 = (c6) A12;
                    c6Var2.B();
                    c6Var2.getEditText().setSelection(Math.min(this.d, c6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View A13 = this.b.A1(this.c);
                if (A13 instanceof c6) {
                    c6 c6Var3 = (c6) A13;
                    c6Var3.B();
                    c6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View A14 = this.b.A1(this.c);
                if (A14 instanceof c6) {
                    c6 c6Var4 = (c6) A14;
                    c6Var4.B();
                    c6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View A15 = this.b.A1(this.c);
                if (A15 instanceof c6) {
                    c6 c6Var5 = (c6) A15;
                    c6Var5.B();
                    c6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View A16 = this.b.A1(this.c);
                if (A16 instanceof c6) {
                    c6 c6Var6 = (c6) A16;
                    c6Var6.B();
                    c6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
