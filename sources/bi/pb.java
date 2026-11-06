package bi;

import org.telegram.ui.Components.dz0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ pb(Runnable runnable, Runnable runnable2, int i7) {
        this.a = i7;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.run();
                break;
            default:
                dz0.b(this.b);
                Runnable runnable = this.c;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
        }
    }
}
