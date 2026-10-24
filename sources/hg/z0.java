package hg;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class z0 extends SendMessagesHelper.LocationProvider {
    public final /* synthetic */ j1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, y0 y0Var) {
        super(y0Var);
        this.a = j1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
    public final void stop() {
        super.stop();
        this.a.z0 = null;
    }
}
