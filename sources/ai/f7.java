package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public abstract class f7 extends zl0 implements s9 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e3 = i10;
        this.f3 = notificationCenterDelegate;
    }

    @Override // ai.s9
    public final void a(int[] iArr) {
        switch (this.e3) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((k7) this.f3).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                yn ynVar = (yn) this.f3;
                iArr[0] = ((int) ynVar.q9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.q.A(3.0f, ynVar.v0.getPaddingBottom(), ynVar.v0.getMeasuredHeight());
                break;
        }
    }
}
