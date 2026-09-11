package b8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c5.c0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.s;
import com.google.android.gms.internal.clearcut.y1;
import g7.l;
import g7.q;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static void G0(Parcel parcel) {
        int i10 = q7.a.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean H0(int i10, Parcel parcel, Parcel parcel2);

    public abstract boolean I0(int i10, Parcel parcel, Parcel parcel2);

    public boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean K0(Parcel parcel, int i10);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i10 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x034f, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0247, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L86;
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
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                g gVar = (g) this;
                if (i10 == 1) {
                    gVar.b.a(new f((Status) c.a(parcel, Status.CREATOR), (m8.e) c.a(parcel, m8.e.CREATOR)));
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
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return J0(i10, parcel, parcel2);
            case 2:
                if (i10 > 16777215) {
                    z10 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z10 = false;
                }
                if (!z10) {
                    y1 y1Var = (y1) this;
                    switch (i10) {
                        case 1:
                            y1Var.b.a((Status) s.a(parcel, Status.CREATOR));
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
                c0 c0Var = (c0) this;
                if (i10 != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i12 = com.google.android.gms.internal.play_billing.d.a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(i2.g.i(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                c0Var.b.a(Integer.valueOf(readInt));
                return true;
            case 4:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return J0(i10, parcel, parcel2);
            case 5:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return I0(i10, parcel, parcel2);
            case 6:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 7:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return J0(i10, parcel, parcel2);
            case 8:
                if (i10 > 16777215) {
                    z11 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z11 = false;
                }
                if (!z11) {
                    h7.f fVar = (h7.f) this;
                    switch (i10) {
                        case 1:
                            Status status = (Status) q7.a.a(parcel, Status.CREATOR);
                            l lVar = (l) q7.a.a(parcel, l.CREATOR);
                            G0(parcel);
                            fVar.E0(status, lVar);
                            break;
                        case 2:
                            Status status2 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) q7.a.a(parcel, Status.CREATOR);
                            g7.e eVar = (g7.e) q7.a.a(parcel, g7.e.CREATOR);
                            G0(parcel);
                            fVar.o0(status7, eVar);
                            break;
                        case 8:
                            Status status8 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) q7.a.a(parcel, Status.CREATOR);
                            g7.b bVar = (g7.b) q7.a.a(parcel, g7.b.CREATOR);
                            G0(parcel);
                            fVar.b0(status9, bVar);
                            break;
                        case 10:
                            Status status10 = (Status) q7.a.a(parcel, Status.CREATOR);
                            q qVar = (q) q7.a.a(parcel, q.CREATOR);
                            G0(parcel);
                            fVar.r(status10, qVar);
                            break;
                        case 11:
                            Status status11 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) q7.a.a(parcel, Status.CREATOR);
                            G0(parcel);
                            i.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 9:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return K0(parcel, i10);
            case 10:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return J0(i10, parcel, parcel2);
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    public b(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 7:
                attachInterface(this, str);
                break;
            case 8:
            default:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
        }
    }
}
