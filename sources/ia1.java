// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
