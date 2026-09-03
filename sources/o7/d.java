package o7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public d(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // o7.b
    public final void k(Status status, z7.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                j.e(status, "status");
                p5.a(status, dVar, this.b);
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
            z7.d dVar = (z7.d) a.a(parcel, z7.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(l.d.j(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            k(status, dVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        z7.b bVar = (z7.b) a.a(parcel, z7.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(l.d.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        w0(status2, bVar);
        return true;
    }

    @Override // o7.b
    public final void w0(Status status, z7.b bVar) {
        switch (this.a) {
            case 0:
                j.e(status, "status");
                p5.a(status, bVar, this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, z7.b bVar) {
    }

    private final void F0(Status status, z7.d dVar) {
    }
}
