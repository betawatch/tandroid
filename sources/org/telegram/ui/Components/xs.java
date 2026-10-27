package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
