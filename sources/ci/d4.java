package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ d4(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 2:
                AndroidUtilities.removeFromParent(this.b);
                break;
            default:
                AndroidUtilities.removeFromParent(this.b);
                break;
        }
    }

    public /* synthetic */ d4(f4 f4Var, d90 d90Var, ClickableSpan clickableSpan) {
        this.a = 0;
        this.b = f4Var;
    }
}
