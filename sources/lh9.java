// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi9 b;
    public final /* synthetic */ mk0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ lh9(pi9 pi9Var, mk0 mk0Var, int i, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = mk0Var;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View D1;
        byte b = this.a;
        int i = this.d;
        mk0 mk0Var = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                D1 = mk0Var != null ? pi9Var.D1(mk0Var) : null;
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    km9Var.A();
                    km9Var.getEditText().setSelection(Math.min(i, km9Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                D1 = mk0Var != null ? pi9Var.D1(mk0Var) : null;
                if (D1 instanceof km9) {
                    km9 km9Var2 = (km9) D1;
                    km9Var2.A();
                    km9Var2.getEditText().setSelection(Math.min(i, km9Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View D12 = pi9Var.D1(mk0Var);
                if (D12 instanceof km9) {
                    km9 km9Var3 = (km9) D12;
                    km9Var3.A();
                    km9Var3.getEditText().setSelection(Math.max(0, Math.min(i, km9Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View D13 = pi9Var.D1(mk0Var);
                if (D13 instanceof km9) {
                    km9 km9Var4 = (km9) D13;
                    km9Var4.A();
                    km9Var4.getEditText().setSelection(Math.max(0, Math.min(i, km9Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View D14 = pi9Var.D1(mk0Var);
                if (D14 instanceof km9) {
                    km9 km9Var5 = (km9) D14;
                    km9Var5.A();
                    km9Var5.getEditText().setSelection(Math.max(0, Math.min(i, km9Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View D15 = pi9Var.D1(mk0Var);
                if (D15 instanceof km9) {
                    km9 km9Var6 = (km9) D15;
                    km9Var6.A();
                    km9Var6.getEditText().setSelection(Math.max(0, Math.min(i, km9Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
