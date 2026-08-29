package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = ce.b.A(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                arrayList = ce.b.m(parcel, readInt, w5.c.CREATOR);
            } else if (c3 == 2) {
                z10 = ce.b.o(parcel, readInt);
            } else if (c3 == 3) {
                str = ce.b.i(parcel, readInt);
            } else if (c3 != 4) {
                ce.b.z(parcel, readInt);
            } else {
                str2 = ce.b.i(parcel, readInt);
            }
        }
        ce.b.n(parcel, A);
        return new a(arrayList, z10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
