package lg;

import org.telegram.messenger.i0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ b(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                ConnectionsManager.lambda$cancelRequest$9(this.b);
                break;
            case 2:
                Runnable runnable = this.b;
                i0.r(runnable);
                i0.g3(runnable);
                break;
            case 3:
                Runnable runnable2 = this.b;
                i0.r(runnable2);
                i0.g3(runnable2);
                break;
            default:
                Runnable runnable3 = this.b;
                i0.r(runnable3);
                i0.g3(runnable3);
                break;
        }
    }
}
