package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] b;

    public /* synthetic */ cs(org.telegram.ui.ActionBar.c2[] c2VarArr, int i9) {
        this.a = i9;
        this.b = c2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                break;
        }
    }
}
