package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class z5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = bc.z(parcel);
                String str = null;
                int i7 = 0;
                float f10 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str2 = bc.h(parcel, readInt);
                    } else if (c10 == 3) {
                        f10 = bc.r(parcel, readInt);
                    } else if (c10 == 4) {
                        str = bc.h(parcel, readInt);
                    } else if (c10 != 5) {
                        bc.y(parcel, readInt);
                    } else {
                        i7 = bc.u(parcel, readInt);
                    }
                }
                bc.m(parcel, z10);
                return new y4(f10, i7, str, str2);
            case 1:
                int z11 = bc.z(parcel);
                int i10 = 0;
                int i11 = 0;
                float f11 = 0.0f;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i10 = bc.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i12 = bc.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        f11 = bc.r(parcel, readInt2);
                    } else if (c11 != 5) {
                        bc.y(parcel, readInt2);
                    } else {
                        i11 = bc.u(parcel, readInt2);
                    }
                }
                bc.m(parcel, z11);
                return new y6(i10, i12, f11, i11);
            case 2:
                int z12 = bc.z(parcel);
                String str3 = null;
                int i13 = 0;
                float f12 = 0.0f;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        str3 = bc.h(parcel, readInt3);
                    } else if (c12 == 2) {
                        f12 = bc.r(parcel, readInt3);
                    } else if (c12 == 3) {
                        str4 = bc.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        bc.y(parcel, readInt3);
                    } else {
                        i13 = bc.u(parcel, readInt3);
                    }
                }
                bc.m(parcel, z12);
                return new hb(f12, i13, str3, str4);
            default:
                int z13 = bc.z(parcel);
                float f13 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        f13 = bc.r(parcel, readInt4);
                    } else if (c13 != 2) {
                        bc.y(parcel, readInt4);
                    } else {
                        i14 = bc.u(parcel, readInt4);
                    }
                }
                bc.m(parcel, z13);
                return new ib(f13, i14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new y4[i7];
            case 1:
                return new y6[i7];
            case 2:
                return new hb[i7];
            default:
                return new ib[i7];
        }
    }
}
