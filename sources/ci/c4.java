package ci;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o90;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ c4(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
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

    public /* synthetic */ c4(e4 e4Var, o90 o90Var, ClickableSpan clickableSpan) {
        this.a = 0;
        this.b = e4Var;
    }
}
