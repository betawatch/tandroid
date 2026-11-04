package com.google.android.gms.internal.cast;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class o extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public static void H0(Parcel parcel) {
        int i3 = s7.a.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean I0(int i3, Parcel parcel, Parcel parcel2);

    public abstract boolean J0(int i3, Parcel parcel, Parcel parcel2);

    public boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean L0(Parcel parcel, int i3);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i3 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0341, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0246, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L86;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return K0(i3, parcel, parcel2);
            case 1:
                if (i3 > 16777215) {
                    z10 = super.onTransact(i3, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z10 = false;
                }
                if (!z10) {
                    com.google.android.gms.internal.clearcut.x1 x1Var = (com.google.android.gms.internal.clearcut.x1) this;
                    switch (i3) {
                        case 1:
                            x1Var.b.a((Status) com.google.android.gms.internal.clearcut.t.a(parcel, Status.CREATOR));
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
            case 2:
                if (i3 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                e5.v vVar = (e5.v) this;
                if (i3 != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i11 = com.google.android.gms.internal.play_billing.d.a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(k2.p1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                vVar.b.a(Integer.valueOf(readInt));
                return true;
            case 3:
                if (i3 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                d8.e eVar = (d8.e) this;
                if (i3 == 1) {
                    eVar.b.a(new d8.d((Status) d8.b.a(parcel, Status.CREATOR), (o8.e) d8.b.a(parcel, o8.e.CREATOR)));
                    return true;
                }
                if (i3 == 2) {
                    parcel.readString();
                    throw new UnsupportedOperationException();
                }
                if (i3 == 3) {
                    throw new UnsupportedOperationException();
                }
                if (i3 == 4) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i3 == 6) {
                    throw new UnsupportedOperationException();
                }
                if (i3 == 8) {
                    throw new UnsupportedOperationException();
                }
                if (i3 == 10) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i3 == 11) {
                    throw new UnsupportedOperationException();
                }
                if (i3 == 15) {
                    throw new UnsupportedOperationException();
                }
                if (i3 != 16) {
                    return false;
                }
                parcel.readString();
                parcel.readInt();
                throw new UnsupportedOperationException();
            case 4:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return K0(i3, parcel, parcel2);
            case 5:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return J0(i3, parcel, parcel2);
            case 6:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return I0(i3, parcel, parcel2);
            case 7:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return K0(i3, parcel, parcel2);
            case 8:
                if (i3 > 16777215) {
                    z11 = super.onTransact(i3, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z11 = false;
                }
                if (!z11) {
                    j7.f fVar = (j7.f) this;
                    switch (i3) {
                        case 1:
                            Status status = (Status) s7.a.a(parcel, Status.CREATOR);
                            i7.l lVar = (i7.l) s7.a.a(parcel, i7.l.CREATOR);
                            H0(parcel);
                            fVar.t(status, lVar);
                            break;
                        case 2:
                            Status status2 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) s7.a.a(parcel, Status.CREATOR);
                            i7.e eVar2 = (i7.e) s7.a.a(parcel, i7.e.CREATOR);
                            H0(parcel);
                            fVar.y(status7, eVar2);
                            break;
                        case 8:
                            Status status8 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) s7.a.a(parcel, Status.CREATOR);
                            i7.b bVar = (i7.b) s7.a.a(parcel, i7.b.CREATOR);
                            H0(parcel);
                            fVar.t0(status9, bVar);
                            break;
                        case 10:
                            Status status10 = (Status) s7.a.a(parcel, Status.CREATOR);
                            i7.r rVar = (i7.r) s7.a.a(parcel, i7.r.CREATOR);
                            H0(parcel);
                            fVar.c0(status10, rVar);
                            break;
                        case 11:
                            Status status11 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) s7.a.a(parcel, Status.CREATOR);
                            H0(parcel);
                            kotlin.jvm.internal.j.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 9:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return L0(parcel, i3);
            case 10:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return K0(i3, parcel, parcel2);
            default:
                return super.onTransact(i3, parcel, parcel2, i10);
        }
    }

    public o(String str, int i3) {
        this.a = i3;
        switch (i3) {
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
