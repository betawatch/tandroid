package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] b;

    public /* synthetic */ qr(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3) {
        this.a = i3;
        this.b = s1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1 s1Var = this.b[0];
                if (s1Var != null) {
                    s1Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.b;
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                s1VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.b;
                try {
                    s1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                s1VarArr2[0] = null;
                break;
        }
    }
}
