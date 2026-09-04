package a8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.i;
import v7.f5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public e(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // a8.b
    public final void S(Status status, l8.b bVar) {
        switch (this.a) {
            case 0:
                i.e(status, "status");
                f5.a(status, bVar, this.b);
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
            l8.d dVar = (l8.d) a.a(parcel, l8.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(i2.g.i(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            s(status, dVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        l8.b bVar = (l8.b) a.a(parcel, l8.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(i2.g.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        S(status2, bVar);
        return true;
    }

    @Override // a8.b
    public final void s(Status status, l8.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                i.e(status, "status");
                f5.a(status, dVar, this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void G0(Status status, l8.b bVar) {
    }

    private final void H0(Status status, l8.d dVar) {
    }
}
