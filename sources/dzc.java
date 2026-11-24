// default package

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class dzc extends Binder implements IInterface {
    public final /* synthetic */ byte a;

    public dzc(String str, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
            case 5:
            case 7:
            case 10:
            case 11:
            default:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 8:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 12:
                attachInterface(this, str);
                break;
        }
    }

    public static void a(Parcel parcel) {
        int i = qgd.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract void P(Status status, nn5 nn5Var);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    public abstract boolean b(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean c(int i, Parcel parcel, Parcel parcel2);

    public boolean d(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean e(Parcel parcel, int i);

    public abstract void f(Status status, r44 r44Var);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        ho createFromParcel;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.a) {
            case 0:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                x0d x0dVar = (x0d) this;
                if (i == 3) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = szc.a;
                    Status createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    f0d createFromParcel3 = parcel.readInt() == 0 ? null : f0d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? ho.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(de9.k(dataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel2.getClass();
                    if (!createFromParcel2.b() || createFromParcel3 == null) {
                        lh0 lh0Var = czc.l;
                        Log.w(lh0Var.b, lh0Var.b("Failed to get verification support info. Status: " + createFromParcel2, new Object[0]));
                    } else {
                        lh0 lh0Var2 = czc.l;
                        Log.i(lh0Var2.b, lh0Var2.b("Verification support info received.", new Object[0]));
                        lh0Var2.a("result: " + createFromParcel3, new Object[0]);
                    }
                    dve.a(createFromParcel2, createFromParcel3, x0dVar.b);
                    return true;
                }
                if (i == 4) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = szc.a;
                    Status createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    xzc createFromParcel5 = parcel.readInt() == 0 ? null : xzc.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? ho.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 > 0) {
                        throw new BadParcelableException(de9.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel4.getClass();
                    fvc.b();
                } else if (i == 5) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i5 = szc.a;
                    Status createFromParcel6 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    j0d createFromParcel7 = parcel.readInt() == 0 ? null : j0d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? ho.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 > 0) {
                        throw new BadParcelableException(de9.k(dataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel6.getClass();
                    fvc.b();
                }
                return false;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return b(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return c(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                vhd vhdVar = (vhd) this;
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i6 = b9d.a;
                int dataAvail4 = parcel.dataAvail();
                if (dataAvail4 > 0) {
                    throw new BadParcelableException(de9.k(dataAvail4, "Parcel data not fully consumed, unread size: "));
                }
                vhdVar.b.a(Integer.valueOf(readInt));
                return true;
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 5:
                if (i > 16777215) {
                    z2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
                uhe uheVar = (uhe) this;
                switch (i) {
                    case 1:
                        uheVar.b.a((Status) kgd.a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        fvc.b();
                        break;
                    case 3:
                        parcel.readLong();
                        fvc.b();
                        break;
                    case 4:
                        fvc.b();
                        break;
                    case 5:
                        parcel.readLong();
                        fvc.b();
                        break;
                    case 6:
                        fvc.b();
                        break;
                    case 7:
                        fvc.b();
                        break;
                    case 8:
                        fvc.b();
                        break;
                    case 9:
                        fvc.b();
                        break;
                }
                return false;
            case 6:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 7:
                if (i > 16777215) {
                    z3 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
                pp5 pp5Var = (pp5) this;
                TaskCompletionSource taskCompletionSource = pp5Var.c;
                byte b = pp5Var.b;
                switch (i) {
                    case 1:
                        Status status = (Status) qgd.a(parcel, Status.CREATOR);
                        z28 z28Var = (z28) qgd.a(parcel, z28.CREATOR);
                        a(parcel);
                        status.getClass();
                        switch (b) {
                            case 1:
                                dve.a(status, z28Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status2.getClass();
                        fvc.b();
                        break;
                    case 3:
                        Status status3 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status3.getClass();
                        fvc.b();
                        break;
                    case 4:
                        Status status4 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status4.getClass();
                        fvc.b();
                        break;
                    case 5:
                        Status status5 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status5.getClass();
                        fvc.b();
                        break;
                    case 6:
                        Status status6 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status6.getClass();
                        fvc.b();
                        break;
                    case 7:
                        Status status7 = (Status) qgd.a(parcel, Status.CREATOR);
                        e03 e03Var = (e03) qgd.a(parcel, e03.CREATOR);
                        a(parcel);
                        status7.getClass();
                        switch (b) {
                            case 0:
                                dve.a(status7, e03Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        Status status8 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status8.getClass();
                        fvc.b();
                        break;
                    case 9:
                        Status status9 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status status10 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status11.getClass();
                        fvc.b();
                        break;
                    case 12:
                        Status status12 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status12.getClass();
                        fvc.b();
                        break;
                    case 13:
                        Status status13 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status13.getClass();
                        fvc.b();
                        break;
                    case 14:
                        Status status14 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status14.getClass();
                        fvc.b();
                        break;
                    case 15:
                        Status status15 = (Status) qgd.a(parcel, Status.CREATOR);
                        a(parcel);
                        status15.getClass();
                        fvc.b();
                        break;
                }
                return false;
            case 8:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return e(parcel, i);
            case 9:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 10:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 11:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                e9f e9fVar = (e9f) this;
                if (i == 1) {
                    e9fVar.b.a(new i7f((Status) zgd.a(parcel, Status.CREATOR), (s4d) zgd.a(parcel, s4d.CREATOR)));
                    return true;
                }
                if (i == 2) {
                    parcel.readString();
                    fvc.b();
                } else if (i == 3) {
                    fvc.b();
                } else if (i == 4) {
                    parcel.readInt();
                    fvc.b();
                } else if (i == 6) {
                    fvc.b();
                } else if (i == 8) {
                    fvc.b();
                } else if (i == 10) {
                    parcel.readInt();
                    fvc.b();
                } else if (i == 11) {
                    fvc.b();
                } else if (i == 15) {
                    fvc.b();
                } else if (i == 16) {
                    parcel.readString();
                    parcel.readInt();
                    fvc.b();
                }
                return false;
            case 12:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 13:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i == 1) {
                    Status status16 = (Status) ygd.a(parcel, Status.CREATOR);
                    nn5 nn5Var = (nn5) ygd.a(parcel, nn5.CREATOR);
                    int dataAvail5 = parcel.dataAvail();
                    if (dataAvail5 > 0) {
                        throw new BadParcelableException(de9.k(dataAvail5, "Parcel data not fully consumed, unread size: "));
                    }
                    P(status16, nn5Var);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                Status status17 = (Status) ygd.a(parcel, Status.CREATOR);
                r44 r44Var = (r44) ygd.a(parcel, r44.CREATOR);
                int dataAvail6 = parcel.dataAvail();
                if (dataAvail6 > 0) {
                    throw new BadParcelableException(de9.k(dataAvail6, "Parcel data not fully consumed, unread size: "));
                }
                f(status17, r44Var);
                return true;
            case 14:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.readInt();
                        return true;
                    case 2:
                        parcel.readInt();
                        return true;
                    case 3:
                        int readInt2 = parcel.readInt();
                        int i7 = ahd.a;
                        z4 = parcel.readInt() != 0;
                        S(readInt2, z4);
                        return true;
                    case 4:
                        parcel.readInt();
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i8 = ahd.a;
                        parcel.readInt();
                        return true;
                    case 7:
                        return true;
                    case 8:
                        return true;
                    case 9:
                        Status status18 = (Status) ahd.a(parcel, Status.CREATOR);
                        z4 = parcel.readInt() != 0;
                        Q(status18, z4);
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
                        Status status19 = (Status) ahd.a(parcel, Status.CREATOR);
                        oy7 oy7Var = (oy7) ahd.a(parcel, oy7.CREATOR);
                        R(status19, oy7Var);
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
    }

    public void Q(Status status, boolean z) {
    }

    public void R(Status status, oy7 oy7Var) {
    }

    public void S(int i, boolean z) {
    }

    public dzc(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                break;
            default:
                attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
                break;
        }
    }

    public /* synthetic */ dzc(byte b, boolean z) {
        this.a = b;
    }
}
