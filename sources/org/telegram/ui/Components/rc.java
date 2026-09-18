package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
