package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;

    public /* synthetic */ ge0(ie0 ie0Var, int i10) {
        this.a = i10;
        this.b = ie0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ie0 ie0Var = this.b;
                org.telegram.ui.Components.xj0 xj0Var = ie0Var.e;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                kd0 kd0Var = ie0Var.a;
                if (kd0Var != null) {
                    kd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ie0 ie0Var2 = this.b;
                int i10 = 0;
                ie0Var2.w = false;
                while (true) {
                    vr[] vrVarArr = ie0Var2.a.f;
                    if (i10 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ie0 ie0Var3 = this.b;
                ie0Var3.postDelayed(new ge0(ie0Var3, 3), 150L);
                ge0 ge0Var = ie0Var3.x;
                ie0Var3.removeCallbacks(ge0Var);
                ie0Var3.postDelayed(ge0Var, 3000L);
                ie0Var3.w = true;
                break;
            default:
                kd0 kd0Var2 = this.b.a;
                int i11 = 0;
                kd0Var2.e = false;
                kd0Var2.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = kd0Var2.f;
                    if (i11 >= vrVarArr2.length) {
                        break;
                    } else {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
