package k7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import j3.r0;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public d(int i9, TaskCompletionSource taskCompletionSource) {
        this.a = i9;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // k7.b
    public final void h(Status status, v7.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                i.e(status, "status");
                h5.a(status, dVar, this.b);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i9, parcel, parcel2, i10)) {
            return true;
        }
        if (i9 == 1) {
            Status status = (Status) a.a(parcel, Status.CREATOR);
            v7.d dVar = (v7.d) a.a(parcel, v7.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(r0.l(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            h(status, dVar);
            return true;
        }
        if (i9 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        v7.b bVar = (v7.b) a.a(parcel, v7.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(r0.l(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        y(status2, bVar);
        return true;
    }

    @Override // k7.b
    public final void y(Status status, v7.b bVar) {
        switch (this.a) {
            case 0:
                i.e(status, "status");
                h5.a(status, bVar, this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, v7.b bVar) {
    }

    private final void F0(Status status, v7.d dVar) {
    }
}
