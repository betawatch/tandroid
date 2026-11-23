package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc0 b;

    public /* synthetic */ fc0(hc0 hc0Var, int i7) {
        this.a = i7;
        this.b = hc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hc0 hc0Var = this.b;
                org.telegram.ui.Components.rh0 rh0Var = hc0Var.e;
                rh0Var.getAnimatedDrawable().N(0, false, false);
                rh0Var.d();
                mb0 mb0Var = hc0Var.a;
                if (mb0Var != null) {
                    mb0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                hc0 hc0Var2 = this.b;
                int i7 = 0;
                hc0Var2.x = false;
                while (true) {
                    er[] erVarArr = hc0Var2.a.f;
                    if (i7 >= erVarArr.length) {
                        break;
                    } else {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    }
                }
            case 2:
                hc0 hc0Var3 = this.b;
                hc0Var3.postDelayed(new fc0(hc0Var3, 3), 150L);
                fc0 fc0Var = hc0Var3.y;
                hc0Var3.removeCallbacks(fc0Var);
                hc0Var3.postDelayed(fc0Var, 3000L);
                hc0Var3.x = true;
                break;
            default:
                mb0 mb0Var2 = this.b.a;
                int i10 = 0;
                mb0Var2.e = false;
                mb0Var2.f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = mb0Var2.f;
                    if (i10 >= erVarArr2.length) {
                        break;
                    } else {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    }
                }
        }
    }
}
