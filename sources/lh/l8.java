package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a11;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ l8(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
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
                a11.b(this.b);
                Runnable runnable = this.c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
        }
    }
}
