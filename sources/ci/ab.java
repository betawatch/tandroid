package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ ab(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(LaunchActivity.U());
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ab(3, this.b));
                break;
            case 2:
                this.b.run(null);
                break;
            default:
                this.b.run(null);
                break;
        }
    }
}
