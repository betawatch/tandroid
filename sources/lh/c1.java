package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ d1 a;

    public c1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i10, boolean z10) {
        d1 d1Var = this.a;
        boolean m10 = d1Var.m();
        d1Var.y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != d1Var.m()) {
            AndroidUtilities.runOnUIThread(new jh.o(this, 23));
        }
    }
}
