package gg;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
