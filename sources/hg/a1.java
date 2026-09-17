package hg;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class a1 extends SendMessagesHelper.LocationProvider {
    public final /* synthetic */ k1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 k1Var, z0 z0Var) {
        super(z0Var);
        this.a = k1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
    public final void stop() {
        super.stop();
        this.a.z0 = null;
    }
}
