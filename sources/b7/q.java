package b7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends y5.a {
    public static final Parcelable.Creator<q> CREATOR = new o(2);
    public final int a;
    public final p b;
    public final q7.q c;
    public final q7.n d;
    public final PendingIntent e;
    public final b0 f;
    public final String h;

    public q(int i9, p pVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        q7.q qVar;
        q7.n nVar;
        this.a = i9;
        this.b = pVar;
        b0 b0Var = null;
        if (iBinder != null) {
            int i10 = q7.p.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            qVar = queryLocalInterface instanceof q7.q ? (q7.q) queryLocalInterface : new q7.o(iBinder, "com.google.android.gms.location.ILocationListener", 0);
        } else {
            qVar = null;
        }
        this.c = qVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i11 = k.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            nVar = queryLocalInterface2 instanceof q7.n ? (q7.n) queryLocalInterface2 : new q7.m(iBinder2, "com.google.android.gms.location.ILocationCallback", 0);
        } else {
            nVar = null;
        }
        this.d = nVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            b0Var = queryLocalInterface3 instanceof b0 ? (b0) queryLocalInterface3 : new z(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 0);
        }
        this.f = b0Var;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.k(parcel, 2, this.b, i9);
        q7.q qVar = this.c;
        p8.f(parcel, 3, qVar == null ? null : qVar.asBinder());
        p8.k(parcel, 4, this.e, i9);
        q7.n nVar = this.d;
        p8.f(parcel, 5, nVar == null ? null : nVar.asBinder());
        b0 b0Var = this.f;
        p8.f(parcel, 6, b0Var != null ? b0Var.asBinder() : null);
        p8.l(parcel, 8, this.h);
        p8.r(parcel, q10);
    }
}
