package g8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends z5.a {
    public static final Parcelable.Creator<i> CREATOR = new f4.e(10);
    public String a;
    public b b;
    public UserAddress c;
    public k d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.k(parcel, 2, this.b, i10);
        r8.k(parcel, 3, this.c, i10);
        r8.k(parcel, 4, this.d, i10);
        r8.l(parcel, 5, this.e);
        r8.b(parcel, 6, this.f);
        r8.l(parcel, 7, this.h);
        r8.b(parcel, 8, this.n);
        r8.r(parcel, q6);
    }
}
