package k7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ig extends z5.a {
    public static final Parcelable.Creator<ig> CREATOR = new cg(2);
    public final List a;
    public final float[] b;
    public final Bitmap c;
    public final List d;

    public ig(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = fArr;
        this.c = bitmap;
        this.d = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.p(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int q9 = h7.r8.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            h7.r8.r(parcel, q9);
        }
        h7.r8.k(parcel, 3, this.c, i10);
        List list = this.d;
        if (list != null) {
            int q10 = h7.r8.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            h7.r8.r(parcel, q10);
        }
        h7.r8.r(parcel, q6);
    }
}
