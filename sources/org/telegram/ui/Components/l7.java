package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
