package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import m8.i;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new i(19);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i10, int i11, Intent intent) {
        this.a = i10;
        this.b = i11;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h0.k(parcel, 3, this.c, i10);
        h0.r(parcel, q6);
    }
}
