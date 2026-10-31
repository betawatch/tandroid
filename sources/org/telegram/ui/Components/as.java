package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] b;

    public /* synthetic */ as(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10) {
        this.a = i10;
        this.b = x1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1 x1Var = this.b[0];
                if (x1Var != null) {
                    x1Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.b;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.b;
                try {
                    x1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                x1VarArr2[0] = null;
                break;
        }
    }
}
