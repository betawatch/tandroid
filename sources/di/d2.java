package di;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ d2(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.h3(runnable);
                break;
            case 1:
                Runnable runnable2 = this.b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.h3(runnable2);
                break;
            case 2:
                Runnable runnable3 = this.b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.h3(runnable3);
                break;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.b);
                break;
            default:
                this.b.run();
                break;
        }
    }
}
