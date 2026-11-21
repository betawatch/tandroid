package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] b;

    public /* synthetic */ fs(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.a = i7;
        this.b = t1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.b[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                break;
        }
    }
}
