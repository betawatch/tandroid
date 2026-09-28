package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class c2 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ d2 a;

    public c2(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i10, boolean z10) {
        d2 d2Var = this.a;
        boolean m10 = d2Var.m();
        d2Var.y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != d2Var.m()) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 4));
        }
    }
}
