package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ke0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                me0 me0Var = this.b;
                org.telegram.ui.Components.bk0 bk0Var = me0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                od0 od0Var = me0Var.a;
                if (od0Var != null) {
                    od0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                me0 me0Var2 = this.b;
                int i10 = 0;
                me0Var2.w = false;
                while (true) {
                    vr[] vrVarArr = me0Var2.a.f;
                    if (i10 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                me0 me0Var3 = this.b;
                me0Var3.postDelayed(new ke0(me0Var3, 3), 150L);
                ke0 ke0Var = me0Var3.x;
                me0Var3.removeCallbacks(ke0Var);
                me0Var3.postDelayed(ke0Var, 3000L);
                me0Var3.w = true;
                break;
            default:
                od0 od0Var2 = this.b.a;
                int i11 = 0;
                od0Var2.e = false;
                od0Var2.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = od0Var2.f;
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
