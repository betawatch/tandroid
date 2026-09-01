package n7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class ig extends c6.a {
    public static final Parcelable.Creator<ig> CREATOR = new dg(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public ig(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
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
        int q10 = j7.g5.q(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int q11 = j7.g5.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            j7.g5.r(parcel, q11);
        }
        j7.g5.k(parcel, 2, this.b, i10);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        j7.g5.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        j7.g5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        j7.g5.r(parcel, q10);
    }
}
