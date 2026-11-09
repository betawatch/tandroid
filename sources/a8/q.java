package a8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class q extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public static void h1(Parcel parcel) {
        int i7 = t7.a.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(dataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i7 = this.a;
        return this;
    }

    public abstract boolean i1(int i7, Parcel parcel, Parcel parcel2);

    public abstract boolean j1(int i7, Parcel parcel, Parcel parcel2);

    public boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean l1(Parcel parcel, int i7);

    /* JADX WARN: Code restructure failed: missing block: B:196:0x049e, code lost:
    
        if (super.onTransact(r9, r10, r11, r12) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024a, code lost:
    
        if (super.onTransact(r9, r10, r11, r12) != false) goto L86;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        boolean z9;
        boolean z10;
        com.google.android.gms.common.api.g createFromParcel;
        boolean z11;
        switch (this.a) {
            case 1:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return k1(i7, parcel, parcel2);
            case 2:
                if (i7 > 16777215) {
                    z9 = super.onTransact(i7, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z9 = false;
                }
                if (!z9) {
                    com.google.android.gms.internal.clearcut.y1 y1Var = (com.google.android.gms.internal.clearcut.y1) this;
                    switch (i7) {
                        case 1:
                            y1Var.b.a((Status) com.google.android.gms.internal.clearcut.t.a(parcel, Status.CREATOR));
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
                if (i7 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                f5.v vVar = (f5.v) this;
                if (i7 != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i11 = com.google.android.gms.internal.play_billing.d.a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(jg.g.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                vVar.b.a(Integer.valueOf(readInt));
                return true;
            case 4:
                if (i7 > 16777215) {
                    z10 = super.onTransact(i7, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z10 = false;
                }
                if (!z10) {
                    db.u uVar = (db.u) this;
                    if (i7 != 3) {
                        if (i7 == 4) {
                            Parcelable.Creator<Status> creator = Status.CREATOR;
                            int i12 = db.e.a;
                            Status status = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                            db.g createFromParcel2 = parcel.readInt() == 0 ? null : db.g.CREATOR.createFromParcel(parcel);
                            createFromParcel = parcel.readInt() != 0 ? com.google.android.gms.common.api.g.CREATOR.createFromParcel(parcel) : null;
                            int dataAvail2 = parcel.dataAvail();
                            if (dataAvail2 > 0) {
                                throw new BadParcelableException(jg.g.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
                            }
                            kotlin.jvm.internal.j.e(status, "status");
                            throw new UnsupportedOperationException();
                        }
                        if (i7 != 5) {
                            return false;
                        }
                        Parcelable.Creator<Status> creator2 = Status.CREATOR;
                        int i13 = db.e.a;
                        Status status2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                        db.o createFromParcel3 = parcel.readInt() == 0 ? null : db.o.CREATOR.createFromParcel(parcel);
                        createFromParcel = parcel.readInt() != 0 ? com.google.android.gms.common.api.g.CREATOR.createFromParcel(parcel) : null;
                        int dataAvail3 = parcel.dataAvail();
                        if (dataAvail3 > 0) {
                            throw new BadParcelableException(jg.g.j(dataAvail3, "Parcel data not fully consumed, unread size: "));
                        }
                        kotlin.jvm.internal.j.e(status2, "status");
                        throw new UnsupportedOperationException();
                    }
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i14 = db.e.a;
                    Status status3 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    db.l createFromParcel4 = parcel.readInt() == 0 ? null : db.l.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? com.google.android.gms.common.api.g.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail4 = parcel.dataAvail();
                    if (dataAvail4 > 0) {
                        throw new BadParcelableException(jg.g.j(dataAvail4, "Parcel data not fully consumed, unread size: "));
                    }
                    kotlin.jvm.internal.j.e(status3, "status");
                    if (!status3.b() || createFromParcel4 == null) {
                        org.telegram.messenger.d1 d1Var = db.d.l;
                        Log.w(d1Var.b, d1Var.b("Failed to get verification support info. Status: " + status3, new Object[0]));
                    } else {
                        org.telegram.messenger.d1 d1Var2 = db.d.l;
                        Log.i(d1Var2.b, d1Var2.b("Verification support info received.", new Object[0]));
                        d1Var2.a("result: " + createFromParcel4, new Object[0]);
                    }
                    k8.a(status3, createFromParcel4, uVar.b);
                }
                return true;
            case 5:
                if (i7 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                e8.e eVar = (e8.e) this;
                if (i7 == 1) {
                    eVar.b.a(new e8.d((Status) e8.b.a(parcel, Status.CREATOR), (p8.e) e8.b.a(parcel, p8.e.CREATOR)));
                    return true;
                }
                if (i7 == 2) {
                    parcel.readString();
                    throw new UnsupportedOperationException();
                }
                if (i7 == 3) {
                    throw new UnsupportedOperationException();
                }
                if (i7 == 4) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i7 == 6) {
                    throw new UnsupportedOperationException();
                }
                if (i7 == 8) {
                    throw new UnsupportedOperationException();
                }
                if (i7 == 10) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i7 == 11) {
                    throw new UnsupportedOperationException();
                }
                if (i7 == 15) {
                    throw new UnsupportedOperationException();
                }
                if (i7 != 16) {
                    return false;
                }
                parcel.readString();
                parcel.readInt();
                throw new UnsupportedOperationException();
            case 6:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return k1(i7, parcel, parcel2);
            case 7:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return j1(i7, parcel, parcel2);
            case 8:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return i1(i7, parcel, parcel2);
            case 9:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return k1(i7, parcel, parcel2);
            case 10:
                if (i7 > 16777215) {
                    z11 = super.onTransact(i7, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z11 = false;
                }
                if (!z11) {
                    k7.f fVar = (k7.f) this;
                    switch (i7) {
                        case 1:
                            Status status4 = (Status) t7.a.a(parcel, Status.CREATOR);
                            j7.m mVar = (j7.m) t7.a.a(parcel, j7.m.CREATOR);
                            h1(parcel);
                            fVar.H0(status4, mVar);
                            break;
                        case 2:
                            Status status5 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status6 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status7 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status7, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status8 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status9 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status9, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status10 = (Status) t7.a.a(parcel, Status.CREATOR);
                            j7.f fVar2 = (j7.f) t7.a.a(parcel, j7.f.CREATOR);
                            h1(parcel);
                            fVar.w0(status10, fVar2);
                            break;
                        case 8:
                            Status status11 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status12 = (Status) t7.a.a(parcel, Status.CREATOR);
                            j7.c cVar = (j7.c) t7.a.a(parcel, j7.c.CREATOR);
                            h1(parcel);
                            fVar.a1(status12, cVar);
                            break;
                        case 10:
                            Status status13 = (Status) t7.a.a(parcel, Status.CREATOR);
                            j7.r rVar = (j7.r) t7.a.a(parcel, j7.r.CREATOR);
                            h1(parcel);
                            fVar.I0(status13, rVar);
                            break;
                        case 11:
                            Status status14 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status15 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status15, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status16 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status16, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status17 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status17, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status18 = (Status) t7.a.a(parcel, Status.CREATOR);
                            h1(parcel);
                            kotlin.jvm.internal.j.e(status18, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 11:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return l1(parcel, i7);
            case 12:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return k1(i7, parcel, parcel2);
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    public q(String str, int i7) {
        this.a = i7;
        switch (i7) {
            case 6:
                attachInterface(this, str);
                break;
            case 7:
                attachInterface(this, str);
                break;
            case 8:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 10:
            default:
                attachInterface(this, str);
                break;
            case 11:
                attachInterface(this, str);
                break;
            case 12:
                attachInterface(this, str);
                break;
        }
    }
}
