package a7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.t;
import com.google.android.gms.internal.play_billing.d;
import j3.r0;
import kotlin.jvm.internal.i;
import n2.x;
import q6.e;
import q6.l;
import q6.q;
import r6.f;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    public static void E0(Parcel parcel) {
        int i9 = b.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean F0(int i9, Parcel parcel, Parcel parcel2);

    public abstract boolean G0(int i9, Parcel parcel, Parcel parcel2);

    public boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean I0(Parcel parcel, int i9);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i9 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L83;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (i9 > 16777215) {
                    z10 = super.onTransact(i9, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z10 = false;
                }
                if (!z10) {
                    f fVar = (f) this;
                    switch (i9) {
                        case 1:
                            Status status = (Status) b.a(parcel, Status.CREATOR);
                            l lVar = (l) b.a(parcel, l.CREATOR);
                            E0(parcel);
                            fVar.p0(status, lVar);
                            break;
                        case 2:
                            Status status2 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) b.a(parcel, Status.CREATOR);
                            e eVar = (e) b.a(parcel, e.CREATOR);
                            E0(parcel);
                            fVar.t0(status7, eVar);
                            break;
                        case 8:
                            Status status8 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) b.a(parcel, Status.CREATOR);
                            q6.b bVar = (q6.b) b.a(parcel, q6.b.CREATOR);
                            E0(parcel);
                            fVar.U(status9, bVar);
                            break;
                        case 10:
                            Status status10 = (Status) b.a(parcel, Status.CREATOR);
                            q qVar = (q) b.a(parcel, q.CREATOR);
                            E0(parcel);
                            fVar.r0(status10, qVar);
                            break;
                        case 11:
                            Status status11 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            i.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 1:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return I0(parcel, i9);
            case 2:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return H0(i9, parcel, parcel2);
            case 3:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return H0(i9, parcel, parcel2);
            case 4:
                if (i9 > 16777215) {
                    z11 = super.onTransact(i9, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z11 = false;
                }
                if (!z11) {
                    a2 a2Var = (a2) this;
                    switch (i9) {
                        case 1:
                            a2Var.b.a((Status) t.a(parcel, Status.CREATOR));
                            break;
                        case 2:
                            throw new UnsupportedOperationException();
                        case 3:
                            parcel.readLong();
                            throw new UnsupportedOperationException();
                        case 4:
                            throw new UnsupportedOperationException();
                        case 5:
                            parcel.readLong();
                            throw new UnsupportedOperationException();
                        case 6:
                            throw new UnsupportedOperationException();
                        case 7:
                            throw new UnsupportedOperationException();
                        case 8:
                            throw new UnsupportedOperationException();
                        case 9:
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 5:
                if (i9 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                x xVar = (x) this;
                if (i9 != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i11 = d.a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(r0.l(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                xVar.b.a(Integer.valueOf(readInt));
                return true;
            case 6:
            default:
                return super.onTransact(i9, parcel, parcel2, i10);
            case 7:
                if (i9 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                l7.e eVar2 = (l7.e) this;
                if (i9 == 1) {
                    eVar2.b.a(new l7.d((Status) l7.b.a(parcel, Status.CREATOR), (w7.e) l7.b.a(parcel, w7.e.CREATOR)));
                    return true;
                }
                if (i9 == 2) {
                    parcel.readString();
                    throw new UnsupportedOperationException();
                }
                if (i9 == 3) {
                    throw new UnsupportedOperationException();
                }
                if (i9 == 4) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i9 == 6) {
                    throw new UnsupportedOperationException();
                }
                if (i9 == 8) {
                    throw new UnsupportedOperationException();
                }
                if (i9 == 10) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i9 == 11) {
                    throw new UnsupportedOperationException();
                }
                if (i9 == 15) {
                    throw new UnsupportedOperationException();
                }
                if (i9 != 16) {
                    return false;
                }
                parcel.readString();
                parcel.readInt();
                throw new UnsupportedOperationException();
            case 8:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return H0(i9, parcel, parcel2);
            case 9:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return G0(i9, parcel, parcel2);
            case 10:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return F0(i9, parcel, parcel2);
            case 11:
                if (i9 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i9, parcel, parcel2, i10)) {
                    return true;
                }
                return H0(i9, parcel, parcel2);
        }
    }

    public a(String str, int i9) {
        this.a = i9;
        switch (i9) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                attachInterface(this, str);
                break;
            case 8:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
            case 11:
                attachInterface(this, str);
                break;
        }
    }
}
