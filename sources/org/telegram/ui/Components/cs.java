package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ cs(is isVar, int i10) {
        this.a = i10;
        this.b = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U(false);
                break;
            default:
                is.O(this.b);
                break;
        }
    }
}
