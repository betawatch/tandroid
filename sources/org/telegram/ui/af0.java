package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;

    public /* synthetic */ af0(cf0 cf0Var, int i10) {
        this.a = i10;
        this.b = cf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cf0 cf0Var = this.b;
                org.telegram.ui.Components.bj0 bj0Var = cf0Var.e;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                fe0 fe0Var = cf0Var.a;
                if (fe0Var != null) {
                    fe0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                cf0 cf0Var2 = this.b;
                int i10 = 0;
                cf0Var2.w = false;
                while (true) {
                    is[] isVarArr = cf0Var2.a.f;
                    if (i10 >= isVarArr.length) {
                        break;
                    } else {
                        isVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                cf0 cf0Var3 = this.b;
                cf0Var3.postDelayed(new af0(cf0Var3, 3), 150L);
                af0 af0Var = cf0Var3.x;
                cf0Var3.removeCallbacks(af0Var);
                cf0Var3.postDelayed(af0Var, 3000L);
                cf0Var3.w = true;
                break;
            default:
                fe0 fe0Var2 = this.b.a;
                int i11 = 0;
                fe0Var2.e = false;
                fe0Var2.f[0].requestFocus();
                while (true) {
                    is[] isVarArr2 = fe0Var2.f;
                    if (i11 >= isVarArr2.length) {
                        break;
                    } else {
                        isVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
