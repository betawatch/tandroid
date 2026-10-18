package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
