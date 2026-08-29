package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                int i10 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        i10 = ce.b.v(parcel, readInt);
                    } else if (c3 != 3) {
                        ce.b.z(parcel, readInt);
                    } else {
                        z10 = ce.b.o(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                x1 x1Var = new x1();
                x1Var.a = i10;
                x1Var.b = z10;
                return x1Var;
            default:
                int A2 = ce.b.A(parcel);
                int i11 = 0;
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 == 2) {
                        i11 = ce.b.v(parcel, readInt2);
                    } else if (c6 == 3) {
                        i12 = ce.b.v(parcel, readInt2);
                    } else if (c6 == 4) {
                        i13 = ce.b.v(parcel, readInt2);
                    } else if (c6 == 5) {
                        j10 = ce.b.x(parcel, readInt2);
                    } else if (c6 != 6) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        i14 = ce.b.v(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
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
