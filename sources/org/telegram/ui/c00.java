package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
