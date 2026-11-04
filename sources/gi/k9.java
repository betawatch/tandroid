package gi;

import org.telegram.messenger.u10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;

    public /* synthetic */ k9(u10 u10Var, int i3) {
        this.a = i3;
        this.b = u10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(LaunchActivity.T());
                break;
            case 1:
                org.telegram.messenger.g0.h3(new k9(this.b, 3));
                break;
            case 2:
                this.b.a(null);
                break;
            default:
                this.b.a(null);
                break;
        }
    }
}
