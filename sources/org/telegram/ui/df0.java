package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class df0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ df0(ff0 ff0Var, int i10) {
        this.a = i10;
        this.b = ff0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                org.telegram.ui.Components.bk0 bk0Var = ff0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ie0 ie0Var = ff0Var.a;
                if (ie0Var != null) {
                    ie0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ff0 ff0Var2 = this.b;
                int i10 = 0;
                ff0Var2.w = false;
                while (true) {
                    ks[] ksVarArr = ff0Var2.a.f;
                    if (i10 >= ksVarArr.length) {
                        break;
                    } else {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ff0 ff0Var3 = this.b;
                ff0Var3.postDelayed(new df0(ff0Var3, 3), 150L);
                df0 df0Var = ff0Var3.x;
                ff0Var3.removeCallbacks(df0Var);
                ff0Var3.postDelayed(df0Var, 3000L);
                ff0Var3.w = true;
                break;
            default:
                ie0 ie0Var2 = this.b.a;
                int i11 = 0;
                ie0Var2.e = false;
                ie0Var2.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr2 = ie0Var2.f;
                    if (i11 >= ksVarArr2.length) {
                        break;
                    } else {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
