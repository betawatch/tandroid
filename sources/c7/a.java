package c7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.t;
import com.google.android.gms.internal.play_billing.d;
import j7.l1;
import kotlin.jvm.internal.j;
import p2.v;
import s6.e;
import s6.m;
import s6.r;
import t6.f;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static void E0(Parcel parcel) {
        int i10 = b.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean F0(int i10, Parcel parcel, Parcel parcel2);

    public abstract boolean G0(int i10, Parcel parcel, Parcel parcel2);

    public boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean I0(Parcel parcel, int i10);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i10 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018e, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L97;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (i10 > 16777215) {
                    z10 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z10 = false;
                }
                if (!z10) {
                    f fVar = (f) this;
                    switch (i10) {
                        case 1:
                            Status status = (Status) b.a(parcel, Status.CREATOR);
                            m mVar = (m) b.a(parcel, m.CREATOR);
                            E0(parcel);
                            fVar.Q(status, mVar);
                            break;
                        case 2:
                            Status status2 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) b.a(parcel, Status.CREATOR);
                            e eVar = (e) b.a(parcel, e.CREATOR);
                            E0(parcel);
                            fVar.u0(status7, eVar);
                            break;
                        case 8:
                            Status status8 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) b.a(parcel, Status.CREATOR);
                            s6.b bVar = (s6.b) b.a(parcel, s6.b.CREATOR);
                            E0(parcel);
                            fVar.A0(status9, bVar);
                            break;
                        case 10:
                            Status status10 = (Status) b.a(parcel, Status.CREATOR);
                            r rVar = (r) b.a(parcel, r.CREATOR);
                            E0(parcel);
                            fVar.E(status10, rVar);
                            break;
                        case 11:
                            Status status11 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 2:
                if (i10 > 16777215) {
                    z11 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z11 = false;
                }
                if (!z11) {
                    a2 a2Var = (a2) this;
                    switch (i10) {
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
            case 3:
                if (i10 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                v vVar = (v) this;
                if (i10 != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i12 = d.a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(l1.k(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                vVar.b.a(Integer.valueOf(readInt));
                return true;
            case 4:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return I0(parcel, i10);
            case 5:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 6:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 7:
                if (i10 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                n7.e eVar2 = (n7.e) this;
                if (i10 == 1) {
                    eVar2.b.a(new n7.d((Status) n7.b.a(parcel, Status.CREATOR), (y7.e) n7.b.a(parcel, y7.e.CREATOR)));
                    return true;
                }
                if (i10 == 2) {
                    parcel.readString();
                    throw new UnsupportedOperationException();
                }
                if (i10 == 3) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 4) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i10 == 6) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 8) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 10) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i10 == 11) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 15) {
                    throw new UnsupportedOperationException();
                }
                if (i10 != 16) {
                    return false;
                }
                parcel.readString();
                parcel.readInt();
                throw new UnsupportedOperationException();
            case 8:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 9:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return G0(i10, parcel, parcel2);
            case 10:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return F0(i10, parcel, parcel2);
            case 11:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
        }
    }

    public a(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
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
