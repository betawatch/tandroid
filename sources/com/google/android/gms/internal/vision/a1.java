package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = j7.l0.z(parcel);
                int i10 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        i10 = j7.l0.u(parcel, readInt);
                    } else if (c3 != 3) {
                        j7.l0.y(parcel, readInt);
                    } else {
                        z10 = j7.l0.n(parcel, readInt);
                    }
                }
                j7.l0.m(parcel, z4);
                x1 x1Var = new x1();
                x1Var.a = i10;
                x1Var.b = z10;
                return x1Var;
            default:
                int z11 = j7.l0.z(parcel);
                int i11 = 0;
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i11 = j7.l0.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i12 = j7.l0.u(parcel, readInt2);
                    } else if (c10 == 4) {
                        i13 = j7.l0.u(parcel, readInt2);
                    } else if (c10 == 5) {
                        j10 = j7.l0.w(parcel, readInt2);
                    } else if (c10 != 6) {
                        j7.l0.y(parcel, readInt2);
                    } else {
                        i14 = j7.l0.u(parcel, readInt2);
                    }
                }
                j7.l0.m(parcel, z11);
                f3 f3Var = new f3();
                f3Var.a = i11;
                f3Var.b = i12;
                f3Var.c = i13;
                f3Var.d = j10;
                f3Var.e = i14;
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
