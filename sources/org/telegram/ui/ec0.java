package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc0 b;

    public /* synthetic */ ec0(gc0 gc0Var, int i7) {
        this.a = i7;
        this.b = gc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc0 gc0Var = this.b;
                org.telegram.ui.Components.fh0 fh0Var = gc0Var.e;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                lb0 lb0Var = gc0Var.a;
                if (lb0Var != null) {
                    lb0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                gc0 gc0Var2 = this.b;
                int i7 = 0;
                gc0Var2.x = false;
                while (true) {
                    dr[] drVarArr = gc0Var2.a.f;
                    if (i7 >= drVarArr.length) {
                        break;
                    } else {
                        drVarArr[i7].A(0.0f);
                        i7++;
                    }
                }
            case 2:
                gc0 gc0Var3 = this.b;
                gc0Var3.postDelayed(new ec0(gc0Var3, 3), 150L);
                ec0 ec0Var = gc0Var3.y;
                gc0Var3.removeCallbacks(ec0Var);
                gc0Var3.postDelayed(ec0Var, 3000L);
                gc0Var3.x = true;
                break;
            default:
                lb0 lb0Var2 = this.b.a;
                int i10 = 0;
                lb0Var2.e = false;
                lb0Var2.f[0].requestFocus();
                while (true) {
                    dr[] drVarArr2 = lb0Var2.f;
                    if (i10 >= drVarArr2.length) {
                        break;
                    } else {
                        drVarArr2[i10].A(0.0f);
                        i10++;
                    }
                }
        }
    }
}
