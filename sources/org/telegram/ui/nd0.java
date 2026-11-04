package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd0 b;

    public /* synthetic */ nd0(wd0 wd0Var, int i3) {
        this.a = i3;
        this.b = wd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wd0 wd0Var = this.b;
                ud0 ud0Var = wd0Var.a;
                xd0 xd0Var = wd0Var.b0;
                ud0 ud0Var2 = wd0Var.b;
                if (ud0Var2 != null) {
                    if (xd0Var.d0) {
                        ud0Var.clearFocus();
                        ud0Var2.clearFocus();
                    } else if (ud0Var.length() != 0) {
                        ud0Var2.requestFocus();
                        if (!wd0Var.U) {
                            ud0Var2.setSelection(ud0Var2.length());
                        }
                        xd0.a1(xd0Var, ud0Var2);
                    } else {
                        ud0Var.requestFocus();
                        xd0.a1(xd0Var, ud0Var);
                    }
                }
                if (xd0Var.G == 0) {
                    wd0Var.r(false);
                    break;
                }
                break;
            case 1:
                wd0 wd0Var2 = this.b;
                wd0Var2.postDelayed(new nd0(wd0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.r(true);
                break;
            default:
                wd0 wd0Var3 = this.b;
                xd0.a1(wd0Var3.b0, wd0Var3.b);
                break;
        }
    }
}
