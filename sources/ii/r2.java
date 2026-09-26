package ii;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        View z12;
        View z13;
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    x3Var.getClass();
                    z12 = null;
                } else {
                    z12 = x3Var.z1(aVar);
                }
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    e6Var.getEditText().setSelection(Math.min(this.d, e6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                x3 x3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = x3Var2.z1(aVar2);
                }
                if (z13 instanceof e6) {
                    e6 e6Var2 = (e6) z13;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(Math.min(this.d, e6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View z14 = this.b.z1(this.c);
                if (z14 instanceof e6) {
                    e6 e6Var3 = (e6) z14;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof e6) {
                    e6 e6Var4 = (e6) z15;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View z16 = this.b.z1(this.c);
                if (z16 instanceof e6) {
                    e6 e6Var5 = (e6) z16;
                    e6Var5.B();
                    e6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View z17 = this.b.z1(this.c);
                if (z17 instanceof e6) {
                    e6 e6Var6 = (e6) z17;
                    e6Var6.B();
                    e6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
