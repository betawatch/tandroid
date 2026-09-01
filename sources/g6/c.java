package g6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
