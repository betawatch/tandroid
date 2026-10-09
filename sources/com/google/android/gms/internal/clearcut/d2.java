package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = w7.c0.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = true;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = w7.c0.h(parcel, readInt);
                    break;
                case 3:
                    i10 = w7.c0.u(parcel, readInt);
                    break;
                case 4:
                    i11 = w7.c0.u(parcel, readInt);
                    break;
                case 5:
                    str2 = w7.c0.h(parcel, readInt);
                    break;
                case 6:
                    str3 = w7.c0.h(parcel, readInt);
                    break;
                case 7:
                    z12 = w7.c0.n(parcel, readInt);
                    break;
                case '\b':
                    str4 = w7.c0.h(parcel, readInt);
                    break;
                case '\t':
                    z11 = w7.c0.n(parcel, readInt);
                    break;
                case '\n':
                    i12 = w7.c0.u(parcel, readInt);
                    break;
                default:
                    w7.c0.y(parcel, readInt);
                    break;
            }
        }
        w7.c0.m(parcel, z10);
        return new c2(str, i10, i11, str2, str3, z12, str4, z11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c2[i10];
    }
}
