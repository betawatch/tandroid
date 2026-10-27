package b8;

import a8.aa;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends Binder implements b, IInterface {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public e(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
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
            m8.d dVar = (m8.d) a.a(parcel, m8.d.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(ic.a.i(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            w0(status, dVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        m8.b bVar = (m8.b) a.a(parcel, m8.b.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(ic.a.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        w(status2, bVar);
        return true;
    }

    @Override // b8.b
    public final void w(Status status, m8.b bVar) {
        switch (this.a) {
            case 0:
                i.e(status, "status");
                aa.a(status, bVar, this.b);
                break;
        }
    }

    @Override // b8.b
    public final void w0(Status status, m8.d dVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                i.e(status, "status");
                aa.a(status, dVar, this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private final void F0(Status status, m8.b bVar) {
    }

    private final void G0(Status status, m8.d dVar) {
    }
}
