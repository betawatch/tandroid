package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r70 b;

    public /* synthetic */ k70(r70 r70Var, int i10) {
        this.a = i10;
        this.b = r70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r70 r70Var = this.b;
                r70Var.h.postOnAnimation(new k70(r70Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
