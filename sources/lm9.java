// default package

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        gl.c3(new r76(nm9Var, (byte) 8));
    }
}
