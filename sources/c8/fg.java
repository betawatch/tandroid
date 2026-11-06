package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int r11 = wb.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            wb.s(parcel, r11);
        }
        wb.k(parcel, 2, this.b, i7);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        wb.s(parcel, r10);
    }
}
