package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ l7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8.n(this.b);
                break;
            default:
                j8.G(this.b);
                break;
        }
    }
}
