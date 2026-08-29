package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t6 extends a6.a {
    public static final Parcelable.Creator<t6> CREATOR = new t5(1);
    public final int a;
    public final float b;
    public final int c;

    public t6(int i10, int i11, float f9, int i12) {
        if (i10 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i11;
        this.b = f9;
        this.c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(1);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeFloat(this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
