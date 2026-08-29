package l7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ig extends a6.a {
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
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.p(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int q9 = com.google.android.gms.internal.cast.o.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            com.google.android.gms.internal.cast.o.r(parcel, q9);
        }
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        List list = this.d;
        if (list != null) {
            int q10 = com.google.android.gms.internal.cast.o.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            com.google.android.gms.internal.cast.o.r(parcel, q10);
        }
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
