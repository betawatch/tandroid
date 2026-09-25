package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ pn0(long j3, int i10) {
        this.a = i10;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(wn.R9(this.b));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.R9(this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(wn.R9(this.b));
                    break;
                }
                break;
        }
    }
}
