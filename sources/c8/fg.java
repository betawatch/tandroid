package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int r11 = yb.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            yb.s(parcel, r11);
        }
        yb.k(parcel, 2, this.b, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        yb.s(parcel, r10);
    }
}
