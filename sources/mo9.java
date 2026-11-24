// default package

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mo9 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ oo9 a;

    public mo9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i, boolean z) {
        fc4.b("[LivePlayer] connectionState = " + i);
        oo9 oo9Var = this.a;
        boolean z2 = true;
        if (i != 3 && i != 1 && i != 2) {
            z2 = false;
        }
        if (oo9Var.G == z2) {
            return;
        }
        oo9Var.G = z2;
        gm.c3(new q96(oo9Var, (byte) 8));
    }
}
