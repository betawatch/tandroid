package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;

    public /* synthetic */ wf0(ag0 ag0Var, int i10) {
        this.a = i10;
        this.b = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
