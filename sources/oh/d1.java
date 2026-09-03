package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ e1 a;

    public d1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i10, boolean z4) {
        e1 e1Var = this.a;
        boolean m9 = e1Var.m();
        e1Var.y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m9 != e1Var.m()) {
            AndroidUtilities.runOnUIThread(new lh.c3(this, 26));
        }
    }
}
