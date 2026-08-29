package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ h00(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                i00 i00Var = this.b;
                i00Var.b(i00Var.y);
                break;
        }
    }
}
