package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ h1 a;

    public g1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i10, boolean z10) {
        h1 h1Var = this.a;
        boolean m10 = h1Var.m();
        h1Var.y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != h1Var.m()) {
            AndroidUtilities.runOnUIThread(new bi.u6(this, 15));
        }
    }
}
