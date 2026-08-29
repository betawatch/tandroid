package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ua extends a6.a {
    public static final Parcelable.Creator<ua> CREATOR = new t5(3);
    public final float a;
    public final int b;

    public ua(float f9, int i10) {
        this.a = f9;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
