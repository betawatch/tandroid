package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* loaded from: classes.dex */
public final class c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = bc.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i7 = 0;
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = true;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = bc.h(parcel, readInt);
                    break;
                case 3:
                    i7 = bc.u(parcel, readInt);
                    break;
                case 4:
                    i10 = bc.u(parcel, readInt);
                    break;
                case 5:
                    str2 = bc.h(parcel, readInt);
                    break;
                case 6:
                    str3 = bc.h(parcel, readInt);
                    break;
                case 7:
                    z12 = bc.n(parcel, readInt);
                    break;
                case '\b':
                    str4 = bc.h(parcel, readInt);
                    break;
                case '\t':
                    z11 = bc.n(parcel, readInt);
                    break;
                case '\n':
                    i11 = bc.u(parcel, readInt);
                    break;
                default:
                    bc.y(parcel, readInt);
                    break;
            }
        }
        bc.m(parcel, z10);
        return new b2(str, i7, i10, str2, str3, z12, str4, z11, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new b2[i7];
    }
}
