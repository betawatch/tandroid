// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ia1 implements ja1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ia1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ja1
    public final void a(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((qp4) obj).invoke(th);
                break;
            default:
                ((no3) obj).dispose();
                break;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((qp4) obj).getClass().getSimpleName() + '@' + s83.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((no3) obj) + ']';
        }
    }
}
