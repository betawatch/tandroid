package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] b;

    public /* synthetic */ os(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.a = i10;
        this.b = b2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                break;
        }
    }
}
