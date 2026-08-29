package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ta extends a6.a {
    public static final Parcelable.Creator<ta> CREATOR = new t5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public ta(float f9, int i10, String str, String str2) {
        this.a = str;
        this.b = f9;
        this.c = str2;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
