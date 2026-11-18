package di;

import org.telegram.ui.Components.mz0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ea(Runnable runnable, Runnable runnable2, int i7) {
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
                mz0.b(this.b);
                Runnable runnable = this.c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    break;
                }
                break;
        }
    }
}
