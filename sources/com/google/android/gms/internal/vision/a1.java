package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                int i9 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i9 = o8.u(parcel, readInt);
                    } else if (c10 != 3) {
                        o8.y(parcel, readInt);
                    } else {
                        z11 = o8.n(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                x1 x1Var = new x1();
                x1Var.a = i9;
                x1Var.b = z11;
                return x1Var;
            default:
                int z12 = o8.z(parcel);
                int i10 = 0;
                long j10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i10 = o8.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i11 = o8.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i12 = o8.u(parcel, readInt2);
                    } else if (c11 == 5) {
                        j10 = o8.w(parcel, readInt2);
                    } else if (c11 != 6) {
                        o8.y(parcel, readInt2);
                    } else {
                        i13 = o8.u(parcel, readInt2);
                    }
                }
                o8.m(parcel, z12);
                f3 f3Var = new f3();
                f3Var.a = i10;
                f3Var.b = i11;
                f3Var.c = i12;
                f3Var.d = j10;
                f3Var.e = i13;
                return f3Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new x1[i9];
            default:
                return new f3[i9];
        }
    }
}
