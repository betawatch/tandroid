package h8;

import a8.k8;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends Binder implements j, IInterface {
    public final /* synthetic */ int a;
    public final TaskCompletionSource b;

    public a(int i7, TaskCompletionSource taskCompletionSource) {
        this.a = i7;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // h8.j
    public void P(int i7, boolean z9) {
        switch (this.a) {
            case 1:
                k8.a(new Status(i7, null, null, null), Boolean.valueOf(z9), this.b);
                break;
        }
    }

    @Override // h8.j
    public void d0(Status status, y8.i iVar) {
        switch (this.a) {
            case 0:
                int i7 = y8.a.c;
                boolean b10 = status.b();
                TaskCompletionSource taskCompletionSource = this.b;
                if (!b10) {
                    taskCompletionSource.setException(m.l(status));
                    break;
                } else {
                    taskCompletionSource.setResult(iVar);
                    break;
                }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        boolean z9;
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i10)) {
            return true;
        }
        switch (i7) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i11 = c.a;
                z9 = parcel.readInt() != 0;
                P(readInt, z9);
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
                z9 = parcel.readInt() != 0;
                x0(status, z9);
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
                y8.i iVar = (y8.i) c.a(parcel, y8.i.CREATOR);
                d0(status2, iVar);
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

    @Override // h8.j
    public void x0(Status status, boolean z9) {
        switch (this.a) {
            case 1:
                k8.a(status, Boolean.valueOf(z9), this.b);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void h1(Status status, boolean z9) {
    }

    public final void i1(Status status, y8.i iVar) {
    }

    public final void j1(int i7, boolean z9) {
    }
}
