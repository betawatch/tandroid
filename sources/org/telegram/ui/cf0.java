package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef0 b;

    public /* synthetic */ cf0(ef0 ef0Var, int i10) {
        this.a = i10;
        this.b = ef0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ef0 ef0Var = this.b;
                org.telegram.ui.Components.bk0 bk0Var = ef0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ge0 ge0Var = ef0Var.a;
                if (ge0Var != null) {
                    ge0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ef0 ef0Var2 = this.b;
                int i10 = 0;
                ef0Var2.w = false;
                while (true) {
                    ks[] ksVarArr = ef0Var2.a.f;
                    if (i10 >= ksVarArr.length) {
                        break;
                    } else {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ef0 ef0Var3 = this.b;
                ef0Var3.postDelayed(new cf0(ef0Var3, 3), 150L);
                cf0 cf0Var = ef0Var3.x;
                ef0Var3.removeCallbacks(cf0Var);
                ef0Var3.postDelayed(cf0Var, 3000L);
                ef0Var3.w = true;
                break;
            default:
                ge0 ge0Var2 = this.b.a;
                int i11 = 0;
                ge0Var2.e = false;
                ge0Var2.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr2 = ge0Var2.f;
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
