package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
