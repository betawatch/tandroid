package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;

    public /* synthetic */ ld0(nd0 nd0Var, int i10) {
        this.a = i10;
        this.b = nd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd0 nd0Var = this.b;
                org.telegram.ui.Components.fi0 fi0Var = nd0Var.e;
                fi0Var.getAnimatedDrawable().N(0, false, false);
                fi0Var.d();
                tc0 tc0Var = nd0Var.a;
                if (tc0Var != null) {
                    tc0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                nd0 nd0Var2 = this.b;
                int i10 = 0;
                nd0Var2.x = false;
                while (true) {
                    bs[] bsVarArr = nd0Var2.a.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    }
                }
            case 2:
                nd0 nd0Var3 = this.b;
                nd0Var3.postDelayed(new ld0(nd0Var3, 3), 150L);
                ld0 ld0Var = nd0Var3.y;
                nd0Var3.removeCallbacks(ld0Var);
                nd0Var3.postDelayed(ld0Var, 3000L);
                nd0Var3.x = true;
                break;
            default:
                tc0 tc0Var2 = this.b.a;
                int i11 = 0;
                tc0Var2.e = false;
                tc0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = tc0Var2.f;
                    if (i11 >= bsVarArr2.length) {
                        break;
                    } else {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    }
                }
        }
    }
}
