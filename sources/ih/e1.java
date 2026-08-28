package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ f1 a;

    public e1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i9, boolean z10) {
        f1 f1Var = this.a;
        boolean m10 = f1Var.m();
        f1Var.y = i9;
        FileLog.d("[LivePlayer] connectionState = " + i9);
        if (m10 != f1Var.m()) {
            AndroidUtilities.runOnUIThread(new g(this, 2));
        }
    }
}
