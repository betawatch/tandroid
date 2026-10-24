package ki;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        View F1;
        View F12;
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    w3Var.getClass();
                    F1 = null;
                } else {
                    F1 = w3Var.F1(aVar);
                }
                if (F1 instanceof c6) {
                    c6 c6Var = (c6) F1;
                    c6Var.A();
                    c6Var.getEditText().setSelection(Math.min(this.d, c6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                w3 w3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    F12 = null;
                } else {
                    F12 = w3Var2.F1(aVar2);
                }
                if (F12 instanceof c6) {
                    c6 c6Var2 = (c6) F12;
                    c6Var2.A();
                    c6Var2.getEditText().setSelection(Math.min(this.d, c6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View F13 = this.b.F1(this.c);
                if (F13 instanceof c6) {
                    c6 c6Var3 = (c6) F13;
                    c6Var3.A();
                    c6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View F14 = this.b.F1(this.c);
                if (F14 instanceof c6) {
                    c6 c6Var4 = (c6) F14;
                    c6Var4.A();
                    c6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View F15 = this.b.F1(this.c);
                if (F15 instanceof c6) {
                    c6 c6Var5 = (c6) F15;
                    c6Var5.A();
                    c6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View F16 = this.b.F1(this.c);
                if (F16 instanceof c6) {
                    c6 c6Var6 = (c6) F16;
                    c6Var6.A();
                    c6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
