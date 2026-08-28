package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ o8(Runnable runnable, Runnable runnable2, int i9) {
        this.a = i9;
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
                d01.b(this.b);
                Runnable runnable = this.c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
        }
    }
}
