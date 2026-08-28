package hd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // hd.k
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((zc.l) this.b).invoke(th);
                break;
            default:
                ((p0) this.b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((zc.l) this.b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.b) + ']';
        }
    }
}
