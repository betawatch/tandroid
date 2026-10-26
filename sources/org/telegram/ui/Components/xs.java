package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] b;

    public /* synthetic */ xs(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.a = i10;
        this.b = e2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.b[0];
                if (e2Var != null) {
                    e2Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.b;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.b;
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                break;
        }
    }
}
