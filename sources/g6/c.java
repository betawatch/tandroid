package g6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z4 = f5.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < z4) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                arrayList = f5.l(parcel, readInt, y5.c.CREATOR);
            } else if (c3 == 2) {
                z10 = f5.n(parcel, readInt);
            } else if (c3 == 3) {
                str = f5.h(parcel, readInt);
            } else if (c3 != 4) {
                f5.y(parcel, readInt);
            } else {
                str2 = f5.h(parcel, readInt);
            }
        }
        f5.m(parcel, z4);
        return new a(arrayList, z10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
