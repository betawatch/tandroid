package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
