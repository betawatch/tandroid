package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 b;

    public /* synthetic */ g0(org.telegram.ui.ActionBar.t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.b;
                ((u5) t2Var.d).e(true, 0.0f);
                t2Var.invalidateSelf();
                break;
        }
    }
}
