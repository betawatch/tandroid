package n6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(16);
    public final int a;
    public final IBinder b;
    public final k6.a c;
    public final boolean d;
    public final boolean e;

    public v(int i10, IBinder iBinder, k6.a aVar, boolean z10, boolean z11) {
        this.a = i10;
        this.b = iBinder;
        this.c = aVar;
        this.d = z10;
        this.e = z11;
    }

    public final boolean equals(Object obj) {
        Object l0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.c.equals(vVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            l0Var = null;
        } else {
            int i10 = a.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var = queryLocalInterface instanceof h ? (h) queryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
        }
        IBinder iBinder2 = vVar.b;
        if (iBinder2 != null) {
            int i11 = a.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof h ? (h) queryLocalInterface2 : new l0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 7);
        }
        return l.l(l0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.e0.f(parcel, 2, this.b);
        w7.e0.k(parcel, 3, this.c, i10);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
