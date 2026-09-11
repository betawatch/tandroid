package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
            AndroidUtilities.runOnUIThread(new a3.c(this, 14));
        }
    }
}
