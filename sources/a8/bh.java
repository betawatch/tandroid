package a8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class bh extends p6.a {
    public static final Parcelable.Creator<bh> CREATOR = new vg(2);
    public final List a;
    public final float[] b;
    public final Bitmap c;
    public final List d;

    public bh(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = fArr;
        this.c = bitmap;
        this.d = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.p(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int q9 = df.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            df.r(parcel, q9);
        }
        df.k(parcel, 3, this.c, i10);
        List list = this.d;
        if (list != null) {
            int q10 = df.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            df.r(parcel, q10);
        }
        df.r(parcel, q5);
    }
}
