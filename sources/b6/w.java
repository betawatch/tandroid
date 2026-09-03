package b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new w.a(23);
    public final int a;
    public final IBinder b;
    public final y5.a c;
    public final boolean d;
    public final boolean e;

    public w(int i10, IBinder iBinder, y5.a aVar, boolean z4, boolean z10) {
        this.a = i10;
        this.b = iBinder;
        this.c = aVar;
        this.d = z4;
        this.e = z10;
    }

    public final boolean equals(Object obj) {
        Object m0Var;
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.c.equals(wVar.c)) {
                    Object obj2 = null;
                    IBinder iBinder = this.b;
                    if (iBinder == null) {
                        m0Var = null;
                    } else {
                        int i10 = a.b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        m0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                    }
                    IBinder iBinder2 = wVar.b;
                    if (iBinder2 != null) {
                        int i11 = a.b;
                        IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        obj2 = queryLocalInterface2 instanceof i ? (i) queryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                    }
                    if (m.l(m0Var, obj2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.f(parcel, 2, this.b);
        f5.k(parcel, 3, this.c, i10);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.r(parcel, q10);
    }
}
