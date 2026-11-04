package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class xg extends q6.a {
    public static final Parcelable.Creator<xg> CREATOR = new sg(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public xg(float[] fArr, Bitmap bitmap, int i3, int i10, int i11, int i12, int i13) {
        this.a = fArr;
        this.b = bitmap;
        this.c = i3;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int s10 = j8.a.s(parcel, 1);
            parcel.writeFloatArray(fArr);
            j8.a.t(parcel, s10);
        }
        j8.a.l(parcel, 2, this.b, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.h);
        j8.a.t(parcel, s6);
    }
}
