package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] b;

    public /* synthetic */ ms(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.a = i10;
        this.b = d2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.b[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                break;
        }
    }
}
