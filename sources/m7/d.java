package m7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
import j7.l1;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public d(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // m7.b
    public final void i(Status status, x7.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                j.e(status, "status");
                o5.a(status, dVar, this.b);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        if (i10 == 1) {
            Status status = (Status) a.a(parcel, Status.CREATOR);
            x7.d dVar = (x7.d) a.a(parcel, x7.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(l1.k(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            i(status, dVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        x7.b bVar = (x7.b) a.a(parcel, x7.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(l1.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        p(status2, bVar);
        return true;
    }

    @Override // m7.b
    public final void p(Status status, x7.b bVar) {
        switch (this.a) {
            case 0:
                j.e(status, "status");
                o5.a(status, bVar, this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, x7.b bVar) {
    }

    private final void F0(Status status, x7.d dVar) {
    }
}
