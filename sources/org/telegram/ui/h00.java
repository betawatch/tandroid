package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
