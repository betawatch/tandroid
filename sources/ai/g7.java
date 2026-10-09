package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class g7 extends qm0 implements t9 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override // ai.t9
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((l7) this.W2).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                zn znVar = (zn) this.W2;
                iArr[0] = ((int) znVar.s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.q.A(3.0f, znVar.x0.getPaddingBottom(), znVar.x0.getMeasuredHeight());
                break;
        }
    }
}
