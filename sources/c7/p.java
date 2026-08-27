package c7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p extends z5.a {
    public static final Parcelable.Creator<p> CREATOR = new n(2);
    public final int a;
    public final o b;
    public final r7.p c;
    public final r7.m d;
    public final PendingIntent e;
    public final a0 f;
    public final String h;

    public p(int i10, o oVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        r7.p pVar;
        r7.m mVar;
        this.a = i10;
        this.b = oVar;
        a0 a0Var = null;
        if (iBinder != null) {
            int i11 = r7.o.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            pVar = queryLocalInterface instanceof r7.p ? (r7.p) queryLocalInterface : new r7.n(iBinder, "com.google.android.gms.location.ILocationListener", 0);
        } else {
            pVar = null;
        }
        this.c = pVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = j.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            mVar = queryLocalInterface2 instanceof r7.m ? (r7.m) queryLocalInterface2 : new r7.l(iBinder2, "com.google.android.gms.location.ILocationCallback", 0);
        } else {
            mVar = null;
        }
        this.d = mVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            a0Var = queryLocalInterface3 instanceof a0 ? (a0) queryLocalInterface3 : new y(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 0);
        }
        this.f = a0Var;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.k(parcel, 2, this.b, i10);
        r7.p pVar = this.c;
        r8.f(parcel, 3, pVar == null ? null : pVar.asBinder());
        r8.k(parcel, 4, this.e, i10);
        r7.m mVar = this.d;
        r8.f(parcel, 5, mVar == null ? null : mVar.asBinder());
        a0 a0Var = this.f;
        r8.f(parcel, 6, a0Var != null ? a0Var.asBinder() : null);
        r8.l(parcel, 8, this.h);
        r8.r(parcel, q6);
    }
}
