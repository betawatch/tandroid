package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;

    public /* synthetic */ ce(org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, int i7) {
        this.a = i7;
        this.c = t1Var;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean[] zArr = this.b;
        org.telegram.ui.ActionBar.t1 t1Var = this.c;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    t1Var.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    t1Var.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
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

    public /* synthetic */ ce(boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = t1Var;
    }
}
