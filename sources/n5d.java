// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n5d extends b4 {
    public static final Parcelable.Creator<n5d> CREATOR = new d3d((byte) 15);
    public final int a;
    public final IBinder b;
    public final ot2 c;
    public final boolean d;
    public final boolean e;

    public n5d(int i, IBinder iBinder, ot2 ot2Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = ot2Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object lgfVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5d)) {
            return false;
        }
        n5d n5dVar = (n5d) obj;
        if (!this.c.equals(n5dVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            lgfVar = null;
        } else {
            int i = e5.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            lgfVar = queryLocalInterface instanceof ti5 ? (ti5) queryLocalInterface : new lgf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
        }
        IBinder iBinder2 = n5dVar.b;
        if (iBinder2 != null) {
            int i2 = e5.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof ti5 ? (ti5) queryLocalInterface2 : new lgf(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
        }
        return fse.a(lgfVar, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.f(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.s(parcel, r);
    }
}
