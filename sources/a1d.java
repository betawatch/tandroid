// default package

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a1d extends b4 implements ua9 {
    public static final Parcelable.Creator<a1d> CREATOR = new b1d((byte) 2);
    public final int a;
    public final int b;
    public final Intent c;

    public a1d(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // ua9
    public final Status a() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.k(parcel, 3, this.c, i);
        jte.s(parcel, r);
    }
}
