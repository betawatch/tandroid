package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od0 b;

    public /* synthetic */ md0(od0 od0Var, int i10) {
        this.a = i10;
        this.b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                od0 od0Var = this.b;
                org.telegram.ui.Components.ei0 ei0Var = od0Var.e;
                ei0Var.getAnimatedDrawable().N(0, false, false);
                ei0Var.d();
                uc0 uc0Var = od0Var.a;
                if (uc0Var != null) {
                    uc0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                od0 od0Var2 = this.b;
                int i10 = 0;
                od0Var2.x = false;
                while (true) {
                    bs[] bsVarArr = od0Var2.a.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    }
                }
            case 2:
                od0 od0Var3 = this.b;
                od0Var3.postDelayed(new md0(od0Var3, 3), 150L);
                md0 md0Var = od0Var3.y;
                od0Var3.removeCallbacks(md0Var);
                od0Var3.postDelayed(md0Var, 3000L);
                od0Var3.x = true;
                break;
            default:
                uc0 uc0Var2 = this.b.a;
                int i11 = 0;
                uc0Var2.e = false;
                uc0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = uc0Var2.f;
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
