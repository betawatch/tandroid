// default package

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l3e extends Binder implements IInterface {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TaskCompletionSource b;

    public l3e(TaskCompletionSource taskCompletionSource, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                break;
            default:
                this.b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 0:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i3 = eld.a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(uh9.k(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                vze.a(createFromParcel, pendingIntent, this.b);
                return true;
            case 1:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i4 = cld.a;
                Status createFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                String readString = parcel.readString();
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 <= 0) {
                    vze.a(createFromParcel2, readString, this.b);
                    return true;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(dataAvail2).length() + 45);
                sb.append("Parcel data not fully consumed, unread size: ");
                sb.append(dataAvail2);
                throw new BadParcelableException(sb.toString());
            default:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator3 = Status.CREATOR;
                int i5 = amd.a;
                Status createFromParcel3 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                int dataAvail3 = parcel.dataAvail();
                if (dataAvail3 > 0) {
                    throw new BadParcelableException(uh9.k(dataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                vze.a(createFromParcel3, null, this.b);
                return true;
        }
    }

    public l3e(qa4 qa4Var, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 1;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }
}
