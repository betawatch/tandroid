package l6;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import j3.r0;
import t6.c;
import x6.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends Binder implements IInterface {
    public final /* synthetic */ int a;
    public final Object b;

    public b(int i9, TaskCompletionSource taskCompletionSource) {
        this.a = i9;
        switch (i9) {
            case 1:
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
        int i9 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.a) {
            case 0:
                if (i9 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i9 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i11 = j.a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(r0.l(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                h5.a(createFromParcel, pendingIntent, (TaskCompletionSource) this.b);
                return true;
            case 1:
                if (i9 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i9 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i12 = c.a;
                Status createFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(r0.l(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                h5.a(createFromParcel2, null, (TaskCompletionSource) this.b);
                return true;
            default:
                if (i9 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i9 == 1) {
                    ((x8.c) this.b).a((Status) z6.c.a(parcel, Status.CREATOR));
                } else if (i9 == 2) {
                } else {
                    if (i9 != 4) {
                        return false;
                    }
                }
                return true;
        }
    }

    public b(x8.c cVar) {
        this.a = 2;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.b = cVar;
    }
}
