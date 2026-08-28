package c6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = o8.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = o8.l(parcel, readInt, u5.c.CREATOR);
            } else if (c10 == 2) {
                z11 = o8.n(parcel, readInt);
            } else if (c10 == 3) {
                str = o8.h(parcel, readInt);
            } else if (c10 != 4) {
                o8.y(parcel, readInt);
            } else {
                str2 = o8.h(parcel, readInt);
            }
        }
        o8.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new a[i9];
    }
}
