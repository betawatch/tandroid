package d8;

import a8.k8;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import jg.g;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public d(int i7, TaskCompletionSource taskCompletionSource) {
        this.a = i7;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // d8.b
    public final void n(Status status, o8.b bVar) {
        switch (this.a) {
            case 0:
                j.e(status, "status");
                k8.a(status, bVar, this.b);
                break;
        }
    }

    @Override // d8.b
    public final void n0(Status status, o8.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                j.e(status, "status");
                k8.a(status, dVar, this.b);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i10)) {
            return true;
        }
        if (i7 == 1) {
            Status status = (Status) a.a(parcel, Status.CREATOR);
            o8.d dVar = (o8.d) a.a(parcel, o8.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(g.j(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            n0(status, dVar);
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        o8.b bVar = (o8.b) a.a(parcel, o8.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(g.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        n(status2, bVar);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void H0(Status status, o8.b bVar) {
    }

    private final void I0(Status status, o8.d dVar) {
    }
}
