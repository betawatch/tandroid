package hg;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
