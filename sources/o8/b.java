package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.e0;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        e0.k(parcel, 3, this.c, i10);
        e0.r(parcel, q6);
    }
}
