package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.a);
        g5.k(parcel, 2, this.b, i10);
        g5.k(parcel, 3, this.c, i10);
        g5.k(parcel, 4, this.d, i10);
        g5.l(parcel, 5, this.e);
        g5.b(parcel, 6, this.f);
        g5.l(parcel, 7, this.h);
        g5.b(parcel, 8, this.n);
        g5.r(parcel, q10);
    }
}
