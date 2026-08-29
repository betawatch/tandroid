package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s70 b;

    public /* synthetic */ l70(s70 s70Var, int i10) {
        this.a = i10;
        this.b = s70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s70 s70Var = this.b;
                s70Var.h.postOnAnimation(new l70(s70Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
