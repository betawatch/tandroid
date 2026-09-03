package mh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ s9(long j10, int i10) {
        this.a = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.R9(this.b));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.R9(this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(xn.R9(this.b));
                    break;
                }
                break;
        }
    }
}
