package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.g0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i10, int i11, Intent intent) {
        this.a = i10;
        this.b = i11;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g0.k(parcel, 3, this.c, i10);
        g0.r(parcel, q6);
    }
}
