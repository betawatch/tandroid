package l7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public d(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // l7.b
    public final void Y(Status status, w7.b bVar) {
        switch (this.a) {
            case 0:
                j.e(status, "status");
                g5.a(status, bVar, this.b);
                break;
        }
    }

    @Override // l7.b
    public final void b0(Status status, w7.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                j.e(status, "status");
                g5.a(status, dVar, this.b);
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
            w7.d dVar = (w7.d) a.a(parcel, w7.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(i0.a.k(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            b0(status, dVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        w7.b bVar = (w7.b) a.a(parcel, w7.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(i0.a.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        Y(status2, bVar);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, w7.b bVar) {
    }

    private final void F0(Status status, w7.d dVar) {
    }
}
