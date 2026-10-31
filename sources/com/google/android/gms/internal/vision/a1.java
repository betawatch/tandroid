package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = w7.g0.z(parcel);
                int i10 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i10 = w7.g0.u(parcel, readInt);
                    } else if (c10 != 3) {
                        w7.g0.y(parcel, readInt);
                    } else {
                        z11 = w7.g0.n(parcel, readInt);
                    }
                }
                w7.g0.m(parcel, z10);
                x1 x1Var = new x1();
                x1Var.a = i10;
                x1Var.b = z11;
                return x1Var;
            default:
                int z12 = w7.g0.z(parcel);
                int i11 = 0;
                int i12 = 0;
                long j10 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i11 = w7.g0.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i13 = w7.g0.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i14 = w7.g0.u(parcel, readInt2);
                    } else if (c11 == 5) {
                        j10 = w7.g0.w(parcel, readInt2);
                    } else if (c11 != 6) {
                        w7.g0.y(parcel, readInt2);
                    } else {
                        i12 = w7.g0.u(parcel, readInt2);
                    }
                }
                w7.g0.m(parcel, z12);
                f3 f3Var = new f3();
                f3Var.a = i11;
                f3Var.b = i13;
                f3Var.c = i14;
                f3Var.d = j10;
                f3Var.e = i12;
                return f3Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new x1[i10];
            default:
                return new f3[i10];
        }
    }
}
