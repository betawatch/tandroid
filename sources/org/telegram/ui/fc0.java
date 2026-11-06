package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                org.telegram.ui.Components.ch0 ch0Var = hc0Var.e;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                lb0 lb0Var = hc0Var.a;
                if (lb0Var != null) {
                    lb0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                hc0 hc0Var2 = this.b;
                int i7 = 0;
                hc0Var2.x = false;
                while (true) {
                    br[] brVarArr = hc0Var2.a.f;
                    if (i7 >= brVarArr.length) {
                        break;
                    } else {
                        brVarArr[i7].z(0.0f);
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
                lb0 lb0Var2 = this.b.a;
                int i10 = 0;
                lb0Var2.e = false;
                lb0Var2.f[0].requestFocus();
                while (true) {
                    br[] brVarArr2 = lb0Var2.f;
                    if (i10 >= brVarArr2.length) {
                        break;
                    } else {
                        brVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
        }
    }
}
