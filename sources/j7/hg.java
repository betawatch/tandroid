package j7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class hg extends y5.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i9, int i10, int i11, int i12, int i13) {
        this.a = fArr;
        this.b = bitmap;
        this.c = i9;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int q11 = g7.p8.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            g7.p8.r(parcel, q11);
        }
        g7.p8.k(parcel, 2, this.b, i9);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g7.p8.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        g7.p8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g7.p8.r(parcel, q10);
    }
}
