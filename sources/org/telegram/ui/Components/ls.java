package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] b;

    public /* synthetic */ ls(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.a = i10;
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
