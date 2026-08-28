package bg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ t0(z0 z0Var, int i9) {
        this.a = i9;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.b, 1));
                break;
            default:
                this.b.run(null);
                break;
        }
    }
}
