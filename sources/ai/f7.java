package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public abstract class f7 extends ml0 implements s9 {
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
                xn xnVar = (xn) this.Y2;
                iArr[0] = ((int) xnVar.s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.z0.z(3.0f, xnVar.x0.getPaddingBottom(), xnVar.x0.getMeasuredHeight());
                break;
        }
    }
}
