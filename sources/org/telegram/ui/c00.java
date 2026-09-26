package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ c00(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b10.V(this.b);
                break;
            default:
                b10.W(this.b);
                break;
        }
    }
}
