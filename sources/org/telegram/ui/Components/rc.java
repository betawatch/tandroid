package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb b;

    public /* synthetic */ rc(yb ybVar, int i10) {
        this.a = i10;
        this.b = ybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performHapticFeedback(3, 2);
                break;
            default:
                this.b.performHapticFeedback(3, 2);
                break;
        }
    }
}
