package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] b;

    public /* synthetic */ qr(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.a = i7;
        this.b = u1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = this.b[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                break;
        }
    }
}
