package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z9 = wb.z(parcel);
                int i7 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i7 = wb.u(parcel, readInt);
                    } else if (c10 != 3) {
                        wb.y(parcel, readInt);
                    } else {
                        z10 = wb.n(parcel, readInt);
                    }
                }
                wb.m(parcel, z9);
                x1 x1Var = new x1();
                x1Var.a = i7;
                x1Var.b = z10;
                return x1Var;
            default:
                int z11 = wb.z(parcel);
                int i10 = 0;
                int i11 = 0;
                long j3 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i10 = wb.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i12 = wb.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i13 = wb.u(parcel, readInt2);
                    } else if (c11 == 5) {
                        j3 = wb.w(parcel, readInt2);
                    } else if (c11 != 6) {
                        wb.y(parcel, readInt2);
                    } else {
                        i11 = wb.u(parcel, readInt2);
                    }
                }
                wb.m(parcel, z11);
                f3 f3Var = new f3();
                f3Var.a = i10;
                f3Var.b = i12;
                f3Var.c = i13;
                f3Var.d = j3;
                f3Var.e = i11;
                return f3Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new x1[i7];
            default:
                return new f3[i7];
        }
    }
}
