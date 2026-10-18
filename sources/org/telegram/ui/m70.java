package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;

    public /* synthetic */ m70(t70 t70Var, int i10) {
        this.a = i10;
        this.b = t70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t70 t70Var = this.b;
                t70Var.h.postOnAnimation(new m70(t70Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
