package b7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new o(0);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;
    public final String f;

    public n(int i9, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.a = i9;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.f(parcel, 2, this.b);
        p8.f(parcel, 3, this.c);
        p8.k(parcel, 4, this.d, i9);
        p8.l(parcel, 5, this.e);
        p8.l(parcel, 6, this.f);
        p8.r(parcel, q10);
    }
}
