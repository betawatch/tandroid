package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class s1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ t1 a;

    public s1(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i10, boolean z10) {
        t1 t1Var = this.a;
        boolean m10 = t1Var.m();
        t1Var.y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != t1Var.m()) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 14));
        }
    }
}
