package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = g6.e.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = true;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = g6.e.h(parcel, readInt);
                    break;
                case 3:
                    i3 = g6.e.u(parcel, readInt);
                    break;
                case 4:
                    i10 = g6.e.u(parcel, readInt);
                    break;
                case 5:
                    str2 = g6.e.h(parcel, readInt);
                    break;
                case 6:
                    str3 = g6.e.h(parcel, readInt);
                    break;
                case 7:
                    z12 = g6.e.n(parcel, readInt);
                    break;
                case '\b':
                    str4 = g6.e.h(parcel, readInt);
                    break;
                case '\t':
                    z11 = g6.e.n(parcel, readInt);
                    break;
                case '\n':
                    i11 = g6.e.u(parcel, readInt);
                    break;
                default:
                    g6.e.y(parcel, readInt);
                    break;
            }
        }
        g6.e.m(parcel, z10);
        return new b2(str, i3, i10, str2, str3, z12, str4, z11, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new b2[i3];
    }
}
