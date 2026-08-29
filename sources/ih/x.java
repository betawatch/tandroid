package ih;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh.t3 b;

    public /* synthetic */ x(nh.t3 t3Var, int i10) {
        this.a = i10;
        this.b = t3Var;
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

    public /* synthetic */ x(nh.t3 t3Var, z80 z80Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = t3Var;
    }
}
