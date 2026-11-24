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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class e1d extends Binder implements IInterface {
    public final /* synthetic */ byte a;

    public e1d(String str, byte b) {
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
        int i = rid.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract void P(Status status, np5 np5Var);

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

    public abstract void f(Status status, c64 c64Var);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        hp createFromParcel;
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
                z2d z2dVar = (z2d) this;
                if (i == 3) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = t1d.a;
                    Status createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    g2d createFromParcel3 = parcel.readInt() == 0 ? null : g2d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? hp.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(hg9.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel2.getClass();
                    if (!createFromParcel2.b() || createFromParcel3 == null) {
                        li0 li0Var = d1d.l;
                        Log.w(li0Var.b, li0Var.b("Failed to get verification support info. Status: " + createFromParcel2, new Object[0]));
                    } else {
                        li0 li0Var2 = d1d.l;
                        Log.i(li0Var2.b, li0Var2.b("Verification support info received.", new Object[0]));
                        li0Var2.a("result: " + createFromParcel3, new Object[0]);
                    }
                    fxe.a(createFromParcel2, createFromParcel3, z2dVar.b);
                    return true;
                }
                if (i == 4) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = t1d.a;
                    Status createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    y1d createFromParcel5 = parcel.readInt() == 0 ? null : y1d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? hp.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 > 0) {
                        throw new BadParcelableException(hg9.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel4.getClass();
                    gxc.b();
                } else if (i == 5) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i5 = t1d.a;
                    Status createFromParcel6 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    l2d createFromParcel7 = parcel.readInt() == 0 ? null : l2d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? hp.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 > 0) {
                        throw new BadParcelableException(hg9.j(dataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel6.getClass();
                    gxc.b();
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
                wjd wjdVar = (wjd) this;
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i6 = dbd.a;
                int dataAvail4 = parcel.dataAvail();
                if (dataAvail4 > 0) {
                    throw new BadParcelableException(hg9.j(dataAvail4, "Parcel data not fully consumed, unread size: "));
                }
                wjdVar.b.a(Integer.valueOf(readInt));
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
                vje vjeVar = (vje) this;
                switch (i) {
                    case 1:
                        vjeVar.b.a((Status) lid.a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        gxc.b();
                        break;
                    case 3:
                        parcel.readLong();
                        gxc.b();
                        break;
                    case 4:
                        gxc.b();
                        break;
                    case 5:
                        parcel.readLong();
                        gxc.b();
                        break;
                    case 6:
                        gxc.b();
                        break;
                    case 7:
                        gxc.b();
                        break;
                    case 8:
                        gxc.b();
                        break;
                    case 9:
                        gxc.b();
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
                pr5 pr5Var = (pr5) this;
                TaskCompletionSource taskCompletionSource = pr5Var.c;
                byte b = pr5Var.b;
                switch (i) {
                    case 1:
                        Status status = (Status) rid.a(parcel, Status.CREATOR);
                        b58 b58Var = (b58) rid.a(parcel, b58.CREATOR);
                        a(parcel);
                        status.getClass();
                        switch (b) {
                            case 1:
                                fxe.a(status, b58Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status2.getClass();
                        gxc.b();
                        break;
                    case 3:
                        Status status3 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status3.getClass();
                        gxc.b();
                        break;
                    case 4:
                        Status status4 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status4.getClass();
                        gxc.b();
                        break;
                    case 5:
                        Status status5 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status5.getClass();
                        gxc.b();
                        break;
                    case 6:
                        Status status6 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status6.getClass();
                        gxc.b();
                        break;
                    case 7:
                        Status status7 = (Status) rid.a(parcel, Status.CREATOR);
                        p13 p13Var = (p13) rid.a(parcel, p13.CREATOR);
                        a(parcel);
                        status7.getClass();
                        switch (b) {
                            case 0:
                                fxe.a(status7, p13Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        Status status8 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status8.getClass();
                        gxc.b();
                        break;
                    case 9:
                        Status status9 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status status10 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status11.getClass();
                        gxc.b();
                        break;
                    case 12:
                        Status status12 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status12.getClass();
                        gxc.b();
                        break;
                    case 13:
                        Status status13 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status13.getClass();
                        gxc.b();
                        break;
                    case 14:
                        Status status14 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status14.getClass();
                        gxc.b();
                        break;
                    case 15:
                        Status status15 = (Status) rid.a(parcel, Status.CREATOR);
                        a(parcel);
                        status15.getClass();
                        gxc.b();
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
                gbf gbfVar = (gbf) this;
                if (i == 1) {
                    gbfVar.b.a(new k9f((Status) ajd.a(parcel, Status.CREATOR), (u6d) ajd.a(parcel, u6d.CREATOR)));
                    return true;
                }
                if (i == 2) {
                    parcel.readString();
                    gxc.b();
                } else if (i == 3) {
                    gxc.b();
                } else if (i == 4) {
                    parcel.readInt();
                    gxc.b();
                } else if (i == 6) {
                    gxc.b();
                } else if (i == 8) {
                    gxc.b();
                } else if (i == 10) {
                    parcel.readInt();
                    gxc.b();
                } else if (i == 11) {
                    gxc.b();
                } else if (i == 15) {
                    gxc.b();
                } else if (i == 16) {
                    parcel.readString();
                    parcel.readInt();
                    gxc.b();
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
                    Status status16 = (Status) zid.a(parcel, Status.CREATOR);
                    np5 np5Var = (np5) zid.a(parcel, np5.CREATOR);
                    int dataAvail5 = parcel.dataAvail();
                    if (dataAvail5 > 0) {
                        throw new BadParcelableException(hg9.j(dataAvail5, "Parcel data not fully consumed, unread size: "));
                    }
                    P(status16, np5Var);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                Status status17 = (Status) zid.a(parcel, Status.CREATOR);
                c64 c64Var = (c64) zid.a(parcel, c64.CREATOR);
                int dataAvail6 = parcel.dataAvail();
                if (dataAvail6 > 0) {
                    throw new BadParcelableException(hg9.j(dataAvail6, "Parcel data not fully consumed, unread size: "));
                }
                f(status17, c64Var);
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
                        int i7 = bjd.a;
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
                        int i8 = bjd.a;
                        parcel.readInt();
                        return true;
                    case 7:
                        return true;
                    case 8:
                        return true;
                    case 9:
                        Status status18 = (Status) bjd.a(parcel, Status.CREATOR);
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
                        Status status19 = (Status) bjd.a(parcel, Status.CREATOR);
                        q08 q08Var = (q08) bjd.a(parcel, q08.CREATOR);
                        R(status19, q08Var);
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

    public void R(Status status, q08 q08Var) {
    }

    public void S(int i, boolean z) {
    }

    public e1d(byte b) {
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

    public /* synthetic */ e1d(byte b, boolean z) {
        this.a = b;
    }
}
