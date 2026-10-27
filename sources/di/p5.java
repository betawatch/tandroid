package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class p5 extends nm0 implements o7 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f3 = i10;
        this.g3 = notificationCenterDelegate;
    }

    @Override // di.o7
    public final void a(int[] iArr) {
        switch (this.f3) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((t5) this.g3).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                wn wnVar = (wn) this.g3;
                iArr[0] = ((int) wnVar.I9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.t.B(3.0f, wnVar.x0.getPaddingBottom(), wnVar.x0.getMeasuredHeight());
                break;
        }
    }
}
