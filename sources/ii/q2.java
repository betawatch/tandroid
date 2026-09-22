package ii;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        View z12;
        View z13;
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    w3Var.getClass();
                    z12 = null;
                } else {
                    z12 = w3Var.z1(aVar);
                }
                if (z12 instanceof d6) {
                    d6 d6Var = (d6) z12;
                    d6Var.B();
                    d6Var.getEditText().setSelection(Math.min(this.d, d6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                w3 w3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = w3Var2.z1(aVar2);
                }
                if (z13 instanceof d6) {
                    d6 d6Var2 = (d6) z13;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(Math.min(this.d, d6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View z14 = this.b.z1(this.c);
                if (z14 instanceof d6) {
                    d6 d6Var3 = (d6) z14;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof d6) {
                    d6 d6Var4 = (d6) z15;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View z16 = this.b.z1(this.c);
                if (z16 instanceof d6) {
                    d6 d6Var5 = (d6) z16;
                    d6Var5.B();
                    d6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View z17 = this.b.z1(this.c);
                if (z17 instanceof d6) {
                    d6 d6Var6 = (d6) z17;
                    d6Var6.B();
                    d6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
