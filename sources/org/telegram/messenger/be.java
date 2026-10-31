package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 c;

    public /* synthetic */ be(org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.c = x1Var;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean[] zArr = this.b;
        org.telegram.ui.ActionBar.x1 x1Var = this.c;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                if (!zArr[0]) {
                    x1Var.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.U1;
                if (!zArr[0]) {
                    x1Var.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.U1;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.U1;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }

    public /* synthetic */ be(boolean[] zArr, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = x1Var;
    }
}
