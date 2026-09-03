package kh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph.f3 b;

    public /* synthetic */ w(ph.f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 2:
                AndroidUtilities.removeFromParent(this.b);
                break;
            default:
                this.b.getClass();
                break;
        }
    }

    public /* synthetic */ w(ph.f3 f3Var, g90 g90Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = f3Var;
    }
}
