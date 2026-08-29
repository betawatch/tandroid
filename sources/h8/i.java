package h8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends a6.a {
    public static final Parcelable.Creator<i> CREATOR = new g8.b(9);
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
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.a);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.b, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.e);
        com.google.android.gms.internal.cast.o.b(parcel, 6, this.f);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.h);
        com.google.android.gms.internal.cast.o.b(parcel, 8, this.n);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
