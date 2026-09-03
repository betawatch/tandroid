package f7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new n(2);
    public final int a;
    public final o b;
    public final u7.p c;
    public final u7.m d;
    public final PendingIntent e;
    public final z f;
    public final String h;

    public p(int i10, o oVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        u7.p pVar;
        u7.m mVar;
        this.a = i10;
        this.b = oVar;
        z zVar = null;
        if (iBinder != null) {
            int i11 = u7.o.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            pVar = queryLocalInterface instanceof u7.p ? (u7.p) queryLocalInterface : new u7.n(iBinder, "com.google.android.gms.location.ILocationListener", 4);
        } else {
            pVar = null;
        }
        this.c = pVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = j.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            mVar = queryLocalInterface2 instanceof u7.m ? (u7.m) queryLocalInterface2 : new u7.l(iBinder2, "com.google.android.gms.location.ILocationCallback", 4);
        } else {
            mVar = null;
        }
        this.d = mVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zVar = queryLocalInterface3 instanceof z ? (z) queryLocalInterface3 : new x(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);
        }
        this.f = zVar;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.k(parcel, 2, this.b, i10);
        u7.p pVar = this.c;
        g5.f(parcel, 3, pVar == null ? null : pVar.asBinder());
        g5.k(parcel, 4, this.e, i10);
        u7.m mVar = this.d;
        g5.f(parcel, 5, mVar == null ? null : mVar.asBinder());
        z zVar = this.f;
        g5.f(parcel, 6, zVar != null ? zVar.asBinder() : null);
        g5.l(parcel, 8, this.h);
        g5.r(parcel, q10);
    }
}
