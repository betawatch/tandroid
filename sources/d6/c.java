package d6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.q8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = q8.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = q8.l(parcel, readInt, v5.c.CREATOR);
            } else if (c10 == 2) {
                z11 = q8.n(parcel, readInt);
            } else if (c10 == 3) {
                str = q8.h(parcel, readInt);
            } else if (c10 != 4) {
                q8.y(parcel, readInt);
            } else {
                str2 = q8.h(parcel, readInt);
            }
        }
        q8.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
