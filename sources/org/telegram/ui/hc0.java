package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc0 b;

    public /* synthetic */ hc0(jc0 jc0Var, int i7) {
        this.a = i7;
        this.b = jc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jc0 jc0Var = this.b;
                org.telegram.ui.Components.dh0 dh0Var = jc0Var.e;
                dh0Var.getAnimatedDrawable().N(0, false, false);
                dh0Var.d();
                nb0 nb0Var = jc0Var.a;
                if (nb0Var != null) {
                    nb0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                jc0 jc0Var2 = this.b;
                int i7 = 0;
                jc0Var2.x = false;
                while (true) {
                    dr[] drVarArr = jc0Var2.a.f;
                    if (i7 >= drVarArr.length) {
                        break;
                    } else {
                        drVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 2:
                jc0 jc0Var3 = this.b;
                jc0Var3.postDelayed(new hc0(jc0Var3, 3), 150L);
                hc0 hc0Var = jc0Var3.y;
                jc0Var3.removeCallbacks(hc0Var);
                jc0Var3.postDelayed(hc0Var, 3000L);
                jc0Var3.x = true;
                break;
            default:
                nb0 nb0Var2 = this.b.a;
                int i10 = 0;
                nb0Var2.e = false;
                nb0Var2.f[0].requestFocus();
                while (true) {
                    dr[] drVarArr2 = nb0Var2.f;
                    if (i10 >= drVarArr2.length) {
                        break;
                    } else {
                        drVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
        }
    }
}
