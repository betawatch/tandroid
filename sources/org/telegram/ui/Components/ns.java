package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] b;

    public /* synthetic */ ns(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.a = i10;
        this.b = a2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                break;
        }
    }
}
