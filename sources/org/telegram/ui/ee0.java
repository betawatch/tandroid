package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ ee0(ge0 ge0Var, int i10) {
        this.a = i10;
        this.b = ge0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                org.telegram.ui.Components.yj0 yj0Var = ge0Var.e;
                yj0Var.getAnimatedDrawable().N(0, false, false);
                yj0Var.d();
                id0 id0Var = ge0Var.a;
                if (id0Var != null) {
                    id0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ge0 ge0Var2 = this.b;
                int i10 = 0;
                ge0Var2.w = false;
                while (true) {
                    tr[] trVarArr = ge0Var2.a.f;
                    if (i10 >= trVarArr.length) {
                        break;
                    } else {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ge0 ge0Var3 = this.b;
                ge0Var3.postDelayed(new ee0(ge0Var3, 3), 150L);
                ee0 ee0Var = ge0Var3.x;
                ge0Var3.removeCallbacks(ee0Var);
                ge0Var3.postDelayed(ee0Var, 3000L);
                ge0Var3.w = true;
                break;
            default:
                id0 id0Var2 = this.b.a;
                int i11 = 0;
                id0Var2.e = false;
                id0Var2.f[0].requestFocus();
                while (true) {
                    tr[] trVarArr2 = id0Var2.f;
                    if (i11 >= trVarArr2.length) {
                        break;
                    } else {
                        trVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
