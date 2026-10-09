package n6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(16);
    public final int a;
    public final IBinder b;
    public final k6.a c;
    public final boolean d;
    public final boolean e;

    public w(int i10, IBinder iBinder, k6.a aVar, boolean z10, boolean z11) {
        this.a = i10;
        this.b = iBinder;
        this.c = aVar;
        this.d = z10;
        this.e = z11;
    }

    public final boolean equals(Object obj) {
        Object m0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.c.equals(wVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            m0Var = null;
        } else {
            int i10 = a.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            m0Var = queryLocalInterface instanceof h ? (h) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
        }
        IBinder iBinder2 = wVar.b;
        if (iBinder2 != null) {
            int i11 = a.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof h ? (h) queryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 7);
        }
        return l.l(m0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.d0.f(parcel, 2, this.b);
        w7.d0.k(parcel, 3, this.c, i10);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
