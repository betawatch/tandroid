package d7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends a6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int a;
    public final n b;
    public final s7.p c;
    public final s7.m d;
    public final PendingIntent e;
    public final y f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        s7.p pVar;
        s7.m mVar;
        this.a = i10;
        this.b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = s7.o.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            pVar = queryLocalInterface instanceof s7.p ? (s7.p) queryLocalInterface : new s7.n(iBinder, "com.google.android.gms.location.ILocationListener", 3);
        } else {
            pVar = null;
        }
        this.c = pVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            mVar = queryLocalInterface2 instanceof s7.m ? (s7.m) queryLocalInterface2 : new s7.l(iBinder2, "com.google.android.gms.location.ILocationCallback", 3);
        } else {
            mVar = null;
        }
        this.d = mVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            yVar = queryLocalInterface3 instanceof y ? (y) queryLocalInterface3 : new w(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 3);
        }
        this.f = yVar;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.b, i10);
        s7.p pVar = this.c;
        com.google.android.gms.internal.cast.o.f(parcel, 3, pVar == null ? null : pVar.asBinder());
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.e, i10);
        s7.m mVar = this.d;
        com.google.android.gms.internal.cast.o.f(parcel, 5, mVar == null ? null : mVar.asBinder());
        y yVar = this.f;
        com.google.android.gms.internal.cast.o.f(parcel, 6, yVar != null ? yVar.asBinder() : null);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
