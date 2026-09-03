package g6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.l0;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z4 = l0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < z4) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                arrayList = l0.l(parcel, readInt, y5.c.CREATOR);
            } else if (c3 == 2) {
                z10 = l0.n(parcel, readInt);
            } else if (c3 == 3) {
                str = l0.h(parcel, readInt);
            } else if (c3 != 4) {
                l0.y(parcel, readInt);
            } else {
                str2 = l0.h(parcel, readInt);
            }
        }
        l0.m(parcel, z4);
        return new a(arrayList, z10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
