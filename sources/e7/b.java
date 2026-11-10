package e7;

import a8.k8;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import jg.g;
import m7.c;
import o7.d;
import q7.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b extends Binder implements IInterface {
    public final /* synthetic */ int a;
    public final Object b;

    public b(int i7, TaskCompletionSource taskCompletionSource) {
        this.a = i7;
        switch (i7) {
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
        int i7 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.a) {
            case 0:
                if (i7 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i11 = j.a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(g.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                k8.a(createFromParcel, pendingIntent, (TaskCompletionSource) this.b);
                return true;
            case 1:
                if (i7 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i12 = c.a;
                Status createFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(g.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                k8.a(createFromParcel2, null, (TaskCompletionSource) this.b);
                return true;
            case 2:
                if (i7 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator3 = Status.CREATOR;
                int i13 = o7.a.a;
                Status createFromParcel3 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                String readString = parcel.readString();
                int dataAvail3 = parcel.dataAvail();
                if (dataAvail3 <= 0) {
                    k8.a(createFromParcel3, readString, (TaskCompletionSource) this.b);
                    return true;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail3).length() + 45);
                sb2.append("Parcel data not fully consumed, unread size: ");
                sb2.append(dataAvail3);
                throw new BadParcelableException(sb2.toString());
            default:
                if (i7 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i7 == 1) {
                    ((t9.c) this.b).a((Status) s7.c.a(parcel, Status.CREATOR));
                } else if (i7 == 2) {
                } else {
                    if (i7 != 4) {
                        return false;
                    }
                }
                return true;
        }
    }

    public b(d dVar, TaskCompletionSource taskCompletionSource) {
        this.a = 2;
        this.b = taskCompletionSource;
        Objects.requireNonNull(dVar);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    public b(t9.c cVar) {
        this.a = 3;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.b = cVar;
    }
}
