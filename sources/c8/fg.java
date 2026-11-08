package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.a = fArr;
        this.b = bitmap;
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int r11 = xb.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            xb.s(parcel, r11);
        }
        xb.k(parcel, 2, this.b, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        xb.s(parcel, r10);
    }
}
