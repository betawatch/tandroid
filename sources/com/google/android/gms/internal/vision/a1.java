package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                int i3 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 2) {
                        i3 = g6.e.u(parcel, readInt);
                    } else if (c2 != 3) {
                        g6.e.y(parcel, readInt);
                    } else {
                        z11 = g6.e.n(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                x1 x1Var = new x1();
                x1Var.a = i3;
                x1Var.b = z11;
                return x1Var;
            default:
                int z12 = g6.e.z(parcel);
                int i10 = 0;
                int i11 = 0;
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i10 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i12 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 4) {
                        i13 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 5) {
                        j10 = g6.e.w(parcel, readInt2);
                    } else if (c10 != 6) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        i11 = g6.e.u(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z12);
                f3 f3Var = new f3();
                f3Var.a = i10;
                f3Var.b = i12;
                f3Var.c = i13;
                f3Var.d = j10;
                f3Var.e = i11;
                return f3Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new x1[i3];
            default:
                return new f3[i3];
        }
    }
}
