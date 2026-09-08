package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
