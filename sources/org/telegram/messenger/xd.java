package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 c;

    public /* synthetic */ xd(org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr, int i3) {
        this.a = i3;
        this.c = s1Var;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        boolean[] zArr = this.b;
        org.telegram.ui.ActionBar.s1 s1Var = this.c;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    s1Var.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    s1Var.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (s1Var.isShowing()) {
                        s1Var.dismiss();
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
                    if (s1Var.isShowing()) {
                        s1Var.dismiss();
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

    public /* synthetic */ xd(boolean[] zArr, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a = i3;
        this.b = zArr;
        this.c = s1Var;
    }
}
