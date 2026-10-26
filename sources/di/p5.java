package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class p5 extends mm0 implements o7 {
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
                un unVar = (un) this.g3;
                iArr[0] = ((int) unVar.E9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.t.B(3.0f, unVar.x0.getPaddingBottom(), unVar.x0.getMeasuredHeight());
                break;
        }
    }
}
