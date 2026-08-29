package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s4 extends a6.a {
    public static final Parcelable.Creator<s4> CREATOR = new t5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public s4(float f9, int i10, String str, String str2) {
        this.b = str2;
        this.c = f9;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
