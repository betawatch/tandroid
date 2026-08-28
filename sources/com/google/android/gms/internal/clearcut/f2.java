package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;

/* loaded from: classes.dex */
public final class f2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = o8.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i9 = 0;
        int i10 = 0;
        boolean z11 = true;
        boolean z12 = false;
        int i11 = 0;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = o8.h(parcel, readInt);
                    break;
                case 3:
                    i9 = o8.u(parcel, readInt);
                    break;
                case 4:
                    i10 = o8.u(parcel, readInt);
                    break;
                case 5:
                    str2 = o8.h(parcel, readInt);
                    break;
                case 6:
                    str3 = o8.h(parcel, readInt);
                    break;
                case 7:
                    z11 = o8.n(parcel, readInt);
                    break;
                case '\b':
                    str4 = o8.h(parcel, readInt);
                    break;
                case '\t':
                    z12 = o8.n(parcel, readInt);
                    break;
                case '\n':
                    i11 = o8.u(parcel, readInt);
                    break;
                default:
                    o8.y(parcel, readInt);
                    break;
            }
        }
        o8.m(parcel, z10);
        return new e2(str, i9, i10, str2, str3, z11, str4, z12, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new e2[i9];
    }
}
