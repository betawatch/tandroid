package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new c.c(27);
    public String a;
    public b b;
    public UserAddress c;
    public k d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.k(parcel, 2, this.b, i9);
        p8.k(parcel, 3, this.c, i9);
        p8.k(parcel, 4, this.d, i9);
        p8.l(parcel, 5, this.e);
        p8.b(parcel, 6, this.f);
        p8.l(parcel, 7, this.h);
        p8.b(parcel, 8, this.n);
        p8.r(parcel, q10);
    }
}
