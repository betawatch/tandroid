package mg;

import org.telegram.messenger.r20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ g0(r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new g0(this.b, 2));
                break;
            case 1:
                this.b.a(null);
                break;
            case 2:
                this.b.a(null);
                break;
            default:
                this.b.a(LaunchActivity.T());
                break;
        }
    }
}
