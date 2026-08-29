package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = ce.b.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = true;
        boolean z11 = false;
        int i12 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = ce.b.i(parcel, readInt);
                    break;
                case 3:
                    i10 = ce.b.v(parcel, readInt);
                    break;
                case 4:
                    i11 = ce.b.v(parcel, readInt);
                    break;
                case 5:
                    str2 = ce.b.i(parcel, readInt);
                    break;
                case 6:
                    str3 = ce.b.i(parcel, readInt);
                    break;
                case 7:
                    z10 = ce.b.o(parcel, readInt);
                    break;
                case '\b':
                    str4 = ce.b.i(parcel, readInt);
                    break;
                case '\t':
                    z11 = ce.b.o(parcel, readInt);
                    break;
                case '\n':
                    i12 = ce.b.v(parcel, readInt);
                    break;
                default:
                    ce.b.z(parcel, readInt);
                    break;
            }
        }
        ce.b.n(parcel, A);
        return new e2(str, i10, i11, str2, str3, z10, str4, z11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e2[i10];
    }
}
