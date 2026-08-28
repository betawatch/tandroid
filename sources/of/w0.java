package of;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w0 extends SendMessagesHelper.LocationProvider {
    public final /* synthetic */ f1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(f1 f1Var, v0 v0Var) {
        super(v0Var);
        this.a = f1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
    public final void stop() {
        super.stop();
        this.a.v0 = null;
    }
}
