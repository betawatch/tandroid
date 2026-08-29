package l7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class hg extends a6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.a = fArr;
        this.b = bitmap;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.h = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int q9 = com.google.android.gms.internal.cast.o.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            com.google.android.gms.internal.cast.o.r(parcel, q9);
        }
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.b, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
