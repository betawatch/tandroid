package a7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.t;
import com.google.android.gms.internal.clearcut.z1;
import kotlin.jvm.internal.j;
import p2.w;
import u6.l;
import u6.r;
import v6.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static void E0(Parcel parcel) {
        int i10 = e7.a.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
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

    /* JADX WARN: Code restructure failed: missing block: B:122:0x032d, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L30;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 2:
                if (i10 > 16777215) {
                    z4 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z4 = false;
                }
                if (!z4) {
                    z1 z1Var = (z1) this;
                    switch (i10) {
                        case 1:
                            z1Var.b.a((Status) t.a(parcel, Status.CREATOR));
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
                w wVar = (w) this;
                if (i10 != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i12 = com.google.android.gms.internal.play_billing.d.a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(l.d.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                wVar.b.a(Integer.valueOf(readInt));
                return true;
            case 4:
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
                            Status status = (Status) e7.a.a(parcel, Status.CREATOR);
                            l lVar = (l) e7.a.a(parcel, l.CREATOR);
                            E0(parcel);
                            fVar.H(status, lVar);
                            break;
                        case 2:
                            Status status2 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) e7.a.a(parcel, Status.CREATOR);
                            u6.e eVar = (u6.e) e7.a.a(parcel, u6.e.CREATOR);
                            E0(parcel);
                            fVar.R(status7, eVar);
                            break;
                        case 8:
                            Status status8 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) e7.a.a(parcel, Status.CREATOR);
                            u6.b bVar = (u6.b) e7.a.a(parcel, u6.b.CREATOR);
                            E0(parcel);
                            fVar.l(status9, bVar);
                            break;
                        case 10:
                            Status status10 = (Status) e7.a.a(parcel, Status.CREATOR);
                            r rVar = (r) e7.a.a(parcel, r.CREATOR);
                            E0(parcel);
                            fVar.N(status10, rVar);
                            break;
                        case 11:
                            Status status11 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) e7.a.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 5:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return I0(parcel, i10);
            case 6:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 7:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 8:
                if (i10 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                p7.e eVar2 = (p7.e) this;
                if (i10 == 1) {
                    eVar2.b.a(new p7.d((Status) p7.b.a(parcel, Status.CREATOR), (a8.f) p7.b.a(parcel, a8.f.CREATOR)));
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
            case 9:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 10:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return G0(i10, parcel, parcel2);
            case 11:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return F0(i10, parcel, parcel2);
        }
    }

    public c(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            default:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
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
