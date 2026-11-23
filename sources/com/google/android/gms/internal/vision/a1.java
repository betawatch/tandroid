package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = bc.z(parcel);
                int i7 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i7 = bc.u(parcel, readInt);
                    } else if (c10 != 3) {
                        bc.y(parcel, readInt);
                    } else {
                        z11 = bc.n(parcel, readInt);
                    }
                }
                bc.m(parcel, z10);
                x1 x1Var = new x1();
                x1Var.a = i7;
                x1Var.b = z11;
                return x1Var;
            default:
                int z12 = bc.z(parcel);
                int i10 = 0;
                int i11 = 0;
                long j3 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i10 = bc.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i12 = bc.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i13 = bc.u(parcel, readInt2);
                    } else if (c11 == 5) {
                        j3 = bc.w(parcel, readInt2);
                    } else if (c11 != 6) {
                        bc.y(parcel, readInt2);
                    } else {
                        i11 = bc.u(parcel, readInt2);
                    }
                }
                bc.m(parcel, z12);
                g3 g3Var = new g3();
                g3Var.a = i10;
                g3Var.b = i12;
                g3Var.c = i13;
                g3Var.d = j3;
                g3Var.e = i11;
                return g3Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new x1[i7];
            default:
                return new g3[i7];
        }
    }
}
