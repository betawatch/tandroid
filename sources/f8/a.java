package f8;

import a8.aa;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import o6.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a extends Binder implements j, IInterface {
    public final /* synthetic */ int a;
    public final TaskCompletionSource b;

    public a(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // f8.j
    public void G(int i10, boolean z10) {
        switch (this.a) {
            case 1:
                aa.a(new Status(i10, null, null, null), Boolean.valueOf(z10), this.b);
                break;
        }
    }

    @Override // f8.j
    public void V(Status status, w8.i iVar) {
        switch (this.a) {
            case 0:
                int i10 = w8.a.c;
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

    @Override // f8.j
    public void i0(Status status, boolean z10) {
        switch (this.a) {
            case 1:
                aa.a(status, Boolean.valueOf(z10), this.b);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        switch (i10) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i12 = c.a;
                z10 = parcel.readInt() != 0;
                G(readInt, z10);
                return true;
            case 4:
                parcel.readInt();
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i13 = c.a;
                parcel.readInt();
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                z10 = parcel.readInt() != 0;
                i0(status, z10);
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
                w8.i iVar = (w8.i) c.a(parcel, w8.i.CREATOR);
                V(status2, iVar);
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

    public final void F0(Status status, boolean z10) {
    }

    public final void G0(Status status, w8.i iVar) {
    }

    public final void H0(int i10, boolean z10) {
    }
}
