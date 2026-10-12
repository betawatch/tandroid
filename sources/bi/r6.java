package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class r6 extends mm0 implements e9 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override // bi.e9
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((w6) this.W2).e);
                iArr[1] = getMeasuredHeight();
                break;
            default:
                fo foVar = (fo) this.W2;
                iArr[0] = ((int) foVar.s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.q.C(3.0f, foVar.x0.getPaddingBottom(), foVar.x0.getMeasuredHeight());
                break;
        }
    }
}
