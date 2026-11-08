package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class de implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;

    public /* synthetic */ de(org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, int i7) {
        this.a = i7;
        this.c = u1Var;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean[] zArr = this.b;
        org.telegram.ui.ActionBar.u1 u1Var = this.c;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                if (!zArr[0]) {
                    u1Var.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.V1;
                if (!zArr[0]) {
                    u1Var.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.V1;
                try {
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.V1;
                try {
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }

    public /* synthetic */ de(boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = u1Var;
    }
}
