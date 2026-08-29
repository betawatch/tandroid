package nh;

import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ o8(y8 y8Var, int i10) {
        this.a = i10;
        this.b = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e9 e9Var = this.b.S;
                mc.h(e9Var.container);
                super/*org.telegram.ui.ActionBar.f3*/.dismiss();
                break;
            case 1:
                y8 y8Var = this.b;
                y8Var.v.setLoading(false);
                e9 e9Var2 = y8Var.S;
                e9Var2.f1();
                e9Var2.b.D(0);
                break;
            case 2:
                this.b.Q = false;
                break;
            case 3:
                e9 e9Var3 = this.b.S;
                e9Var3.I = 6;
                e9Var3.b.D(1);
                break;
            case 4:
                y8 y8Var2 = this.b;
                y8Var2.n.m(2);
                y8Var2.f.forceLayout();
                y8Var2.j();
                break;
            default:
                y8 y8Var3 = this.b;
                e9 e9Var4 = y8Var3.S;
                if (y8Var3.a != 0) {
                    e9Var4.onBackPressed();
                    break;
                } else {
                    e9Var4.dismiss();
                    break;
                }
        }
    }
}
