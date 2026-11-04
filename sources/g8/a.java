package g8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends Binder implements j, IInterface {
    public final /* synthetic */ int a;
    public final TaskCompletionSource b;

    public a(int i3, TaskCompletionSource taskCompletionSource) {
        this.a = i3;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // g8.j
    public void H(int i3, boolean z10) {
        switch (this.a) {
            case 1:
                y9.a(new Status(i3, null, null, null), Boolean.valueOf(z10), this.b);
                break;
        }
    }

    @Override // g8.j
    public void m0(Status status, boolean z10) {
        switch (this.a) {
            case 1:
                y9.a(status, Boolean.valueOf(z10), this.b);
                break;
        }
    }

    @Override // g8.j
    public void o(Status status, x8.i iVar) {
        switch (this.a) {
            case 0:
                int i3 = x8.a.c;
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
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i10)) {
            return true;
        }
        switch (i3) {
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
                H(readInt, z10);
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
                m0(status, z10);
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
                x8.i iVar = (x8.i) c.a(parcel, x8.i.CREATOR);
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

    public final void H0(Status status, boolean z10) {
    }

    public final void I0(Status status, x8.i iVar) {
    }

    public final void J0(int i3, boolean z10) {
    }
}
