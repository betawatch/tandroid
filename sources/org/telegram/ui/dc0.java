package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc0 b;

    public /* synthetic */ dc0(fc0 fc0Var, int i3) {
        this.a = i3;
        this.b = fc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fc0 fc0Var = this.b;
                org.telegram.ui.Components.fh0 fh0Var = fc0Var.e;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                ib0 ib0Var = fc0Var.a;
                if (ib0Var != null) {
                    ib0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                fc0 fc0Var2 = this.b;
                int i3 = 0;
                fc0Var2.x = false;
                while (true) {
                    zq[] zqVarArr = fc0Var2.a.f;
                    if (i3 >= zqVarArr.length) {
                        break;
                    } else {
                        zqVarArr[i3].z(0.0f);
                        i3++;
                    }
                }
            case 2:
                fc0 fc0Var3 = this.b;
                fc0Var3.postDelayed(new dc0(fc0Var3, 3), 150L);
                dc0 dc0Var = fc0Var3.y;
                fc0Var3.removeCallbacks(dc0Var);
                fc0Var3.postDelayed(dc0Var, 3000L);
                fc0Var3.x = true;
                break;
            default:
                ib0 ib0Var2 = this.b.a;
                int i10 = 0;
                ib0Var2.e = false;
                ib0Var2.f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr2 = ib0Var2.f;
                    if (i10 >= zqVarArr2.length) {
                        break;
                    } else {
                        zqVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
        }
    }
}
