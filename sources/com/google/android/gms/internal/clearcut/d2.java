package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* loaded from: classes.dex */
public final class d2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z9 = wb.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i7 = 0;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = true;
        while (parcel.dataPosition() < z9) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = wb.h(parcel, readInt);
                    break;
                case 3:
                    i7 = wb.u(parcel, readInt);
                    break;
                case 4:
                    i10 = wb.u(parcel, readInt);
                    break;
                case 5:
                    str2 = wb.h(parcel, readInt);
                    break;
                case 6:
                    str3 = wb.h(parcel, readInt);
                    break;
                case 7:
                    z11 = wb.n(parcel, readInt);
                    break;
                case '\b':
                    str4 = wb.h(parcel, readInt);
                    break;
                case '\t':
                    z10 = wb.n(parcel, readInt);
                    break;
                case '\n':
                    i11 = wb.u(parcel, readInt);
                    break;
                default:
                    wb.y(parcel, readInt);
                    break;
            }
        }
        wb.m(parcel, z9);
        return new c2(str, i7, i10, str2, str3, z11, str4, z10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new c2[i7];
    }
}
