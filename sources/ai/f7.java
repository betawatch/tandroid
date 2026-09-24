package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public abstract class f7 extends wl0 implements s9 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        this.Y2 = notificationCenterDelegate;
    }

    @Override // ai.s9
    public final void a(int[] iArr) {
        switch (this.X2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((k7) this.Y2).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                wn wnVar = (wn) this.Y2;
                iArr[0] = ((int) wnVar.s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.f0.A(3.0f, wnVar.x0.getPaddingBottom(), wnVar.x0.getMeasuredHeight());
                break;
        }
    }
}
