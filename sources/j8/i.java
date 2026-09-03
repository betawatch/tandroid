package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new f8.o(23);
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
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.a);
        f5.k(parcel, 2, this.b, i10);
        f5.k(parcel, 3, this.c, i10);
        f5.k(parcel, 4, this.d, i10);
        f5.l(parcel, 5, this.e);
        f5.b(parcel, 6, this.f);
        f5.l(parcel, 7, this.h);
        f5.b(parcel, 8, this.n);
        f5.r(parcel, q10);
    }
}
