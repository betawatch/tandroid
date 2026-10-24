package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract class p5 extends mm0 implements o7 {
    public final /* synthetic */ int Y2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = notificationCenterDelegate;
    }

    @Override // ci.o7
    public final void a(int[] iArr) {
        switch (this.Y2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((t5) this.Z2).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                sn snVar = (sn) this.Z2;
                iArr[0] = ((int) snVar.E9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.v0.z(3.0f, snVar.x0.getPaddingBottom(), snVar.x0.getMeasuredHeight());
                break;
        }
    }
}
