package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class yg extends q6.a {
    public static final Parcelable.Creator<yg> CREATOR = new sg(2);
    public final List a;
    public final float[] b;
    public final Bitmap c;
    public final List d;

    public yg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = fArr;
        this.c = bitmap;
        this.d = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.q(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int s10 = j8.a.s(parcel, 2);
            parcel.writeFloatArray(fArr);
            j8.a.t(parcel, s10);
        }
        j8.a.l(parcel, 3, this.c, i3);
        List list = this.d;
        if (list != null) {
            int s11 = j8.a.s(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            j8.a.t(parcel, s11);
        }
        j8.a.t(parcel, s6);
    }
}
