package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.im0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class q5 extends im0 implements p7 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override // ci.p7
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((u5) this.W2).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                qn qnVar = (qn) this.W2;
                iArr[0] = ((int) qnVar.s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.g0.A(3.0f, qnVar.x0.getPaddingBottom(), qnVar.x0.getMeasuredHeight());
                break;
        }
    }
}
