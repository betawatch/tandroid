package n7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class jg extends c6.a {
    public static final Parcelable.Creator<jg> CREATOR = new dg(2);
    public final List a;
    public final float[] b;
    public final Bitmap c;
    public final List d;

    public jg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = fArr;
        this.c = bitmap;
        this.d = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.p(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int q11 = j7.f5.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            j7.f5.r(parcel, q11);
        }
        j7.f5.k(parcel, 3, this.c, i10);
        List list = this.d;
        if (list != null) {
            int q12 = j7.f5.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            j7.f5.r(parcel, q12);
        }
        j7.f5.r(parcel, q10);
    }
}
