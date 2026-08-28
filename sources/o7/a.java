package o7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends Binder implements j, IInterface {
    public final /* synthetic */ int a;
    public final TaskCompletionSource b;

    public a(int i9, TaskCompletionSource taskCompletionSource) {
        this.a = i9;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // o7.j
    public void E(int i9, boolean z10) {
        switch (this.a) {
            case 1:
                h5.a(new Status(i9, null, null, null), Boolean.valueOf(z10), this.b);
                break;
        }
    }

    @Override // o7.j
    public void g0(Status status, boolean z10) {
        switch (this.a) {
            case 1:
                h5.a(status, Boolean.valueOf(z10), this.b);
                break;
        }
    }

    @Override // o7.j
    public void o(Status status, f8.i iVar) {
        switch (this.a) {
            case 0:
                int i9 = f8.a.c;
                boolean b10 = status.b();
                TaskCompletionSource taskCompletionSource = this.b;
                if (!b10) {
                    taskCompletionSource.setException(l.m(status));
                    break;
                } else {
                    taskCompletionSource.setResult(iVar);
                    break;
                }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        if (i9 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i9, parcel, parcel2, i10)) {
            return true;
        }
        switch (i9) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i11 = c.a;
                z10 = parcel.readInt() != 0;
                E(readInt, z10);
                return true;
            case 4:
                parcel.readInt();
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i12 = c.a;
                parcel.readInt();
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                z10 = parcel.readInt() != 0;
                g0(status, z10);
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                f8.i iVar = (f8.i) c.a(parcel, f8.i.CREATOR);
                o(status2, iVar);
                return true;
            case 15:
                return true;
            case 16:
                return true;
            case 17:
                return true;
            case 18:
                parcel.readInt();
                return true;
            case 19:
                return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void E0(Status status, boolean z10) {
    }

    public final void F0(Status status, f8.i iVar) {
    }

    public final void G0(int i9, boolean z10) {
    }
}
