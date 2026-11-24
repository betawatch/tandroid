// default package

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lm9 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ nm9 a;

    public lm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i, boolean z) {
        fa4.b("[LivePlayer] connectionState = " + i);
        nm9 nm9Var = this.a;
        boolean z2 = true;
        if (i != 3 && i != 1 && i != 2) {
            z2 = false;
        }
        if (nm9Var.G == z2) {
            return;
        }
        nm9Var.G = z2;
        gl.d3(new r76(nm9Var, (byte) 8));
    }
}
