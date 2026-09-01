package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* loaded from: classes.dex */
public final class e2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z4 = f5.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = true;
        boolean z11 = false;
        int i12 = 0;
        while (parcel.dataPosition() < z4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = f5.h(parcel, readInt);
                    break;
                case 3:
                    i10 = f5.u(parcel, readInt);
                    break;
                case 4:
                    i11 = f5.u(parcel, readInt);
                    break;
                case 5:
                    str2 = f5.h(parcel, readInt);
                    break;
                case 6:
                    str3 = f5.h(parcel, readInt);
                    break;
                case 7:
                    z10 = f5.n(parcel, readInt);
                    break;
                case '\b':
                    str4 = f5.h(parcel, readInt);
                    break;
                case '\t':
                    z11 = f5.n(parcel, readInt);
                    break;
                case '\n':
                    i12 = f5.u(parcel, readInt);
                    break;
                default:
                    f5.y(parcel, readInt);
                    break;
            }
        }
        f5.m(parcel, z4);
        return new d2(str, i10, i11, str2, str3, z10, str4, z11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d2[i10];
    }
}
