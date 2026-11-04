package c8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import k2.p1;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public d(int i3, TaskCompletionSource taskCompletionSource) {
        this.a = i3;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // c8.b
    public final void A0(Status status, n8.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                j.e(status, "status");
                y9.a(status, dVar, this.b);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i10)) {
            return true;
        }
        if (i3 == 1) {
            Status status = (Status) a.a(parcel, Status.CREATOR);
            n8.d dVar = (n8.d) a.a(parcel, n8.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(p1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            A0(status, dVar);
            return true;
        }
        if (i3 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        n8.b bVar = (n8.b) a.a(parcel, n8.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(p1.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        q(status2, bVar);
        return true;
    }

    @Override // c8.b
    public final void q(Status status, n8.b bVar) {
        switch (this.a) {
            case 0:
                j.e(status, "status");
                y9.a(status, bVar, this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void H0(Status status, n8.b bVar) {
    }

    private final void I0(Status status, n8.d dVar) {
    }
}
