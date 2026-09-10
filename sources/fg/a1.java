package fg;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a1 extends SendMessagesHelper.LocationProvider {
    public final /* synthetic */ l1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l1 l1Var, z0 z0Var) {
        super(z0Var);
        this.a = l1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
    public final void stop() {
        super.stop();
        this.a.z0 = null;
    }
}
