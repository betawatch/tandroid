package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc0 b;

    public /* synthetic */ ic0(kc0 kc0Var, int i7) {
        this.a = i7;
        this.b = kc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kc0 kc0Var = this.b;
                org.telegram.ui.Components.ch0 ch0Var = kc0Var.e;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                ob0 ob0Var = kc0Var.a;
                if (ob0Var != null) {
                    ob0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                kc0 kc0Var2 = this.b;
                int i7 = 0;
                kc0Var2.x = false;
                while (true) {
                    er[] erVarArr = kc0Var2.a.f;
                    if (i7 >= erVarArr.length) {
                        break;
                    } else {
                        erVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 2:
                kc0 kc0Var3 = this.b;
                kc0Var3.postDelayed(new ic0(kc0Var3, 3), 150L);
                ic0 ic0Var = kc0Var3.y;
                kc0Var3.removeCallbacks(ic0Var);
                kc0Var3.postDelayed(ic0Var, 3000L);
                kc0Var3.x = true;
                break;
            default:
                ob0 ob0Var2 = this.b.a;
                int i10 = 0;
                ob0Var2.e = false;
                ob0Var2.f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = ob0Var2.f;
                    if (i10 >= erVarArr2.length) {
                        break;
                    } else {
                        erVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
        }
    }
}
