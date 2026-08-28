package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ s0(int i9, Utilities.Callback callback) {
        this.a = i9;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(2, this.b));
                break;
            case 1:
                this.b.run(null);
                break;
            case 2:
                this.b.run(null);
                break;
            default:
                this.b.run(LaunchActivity.U());
                break;
        }
    }
}
