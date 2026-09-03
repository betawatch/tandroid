package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ yc0 b;

    public tc0(yc0 yc0Var) {
        this.b = yc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.a;
        yc0 yc0Var = this.b;
        yc0Var.a(z4);
        yc0Var.postDelayed(this, yc0Var.I);
    }
}
