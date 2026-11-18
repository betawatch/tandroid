package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.ac;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class z5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = ac.z(parcel);
                String str = null;
                int i7 = 0;
                float f10 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str2 = ac.h(parcel, readInt);
                    } else if (c10 == 3) {
                        f10 = ac.r(parcel, readInt);
                    } else if (c10 == 4) {
                        str = ac.h(parcel, readInt);
                    } else if (c10 != 5) {
                        ac.y(parcel, readInt);
                    } else {
                        i7 = ac.u(parcel, readInt);
                    }
                }
                ac.m(parcel, z10);
                return new y4(f10, i7, str, str2);
            case 1:
                int z11 = ac.z(parcel);
                int i10 = 0;
                int i11 = 0;
                float f11 = 0.0f;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i10 = ac.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i12 = ac.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        f11 = ac.r(parcel, readInt2);
                    } else if (c11 != 5) {
                        ac.y(parcel, readInt2);
                    } else {
                        i11 = ac.u(parcel, readInt2);
                    }
                }
                ac.m(parcel, z11);
                return new y6(i10, i12, f11, i11);
            case 2:
                int z12 = ac.z(parcel);
                String str3 = null;
                int i13 = 0;
                float f12 = 0.0f;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        str3 = ac.h(parcel, readInt3);
                    } else if (c12 == 2) {
                        f12 = ac.r(parcel, readInt3);
                    } else if (c12 == 3) {
                        str4 = ac.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        ac.y(parcel, readInt3);
                    } else {
                        i13 = ac.u(parcel, readInt3);
                    }
                }
                ac.m(parcel, z12);
                return new hb(f12, i13, str3, str4);
            default:
                int z13 = ac.z(parcel);
                float f13 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        f13 = ac.r(parcel, readInt4);
                    } else if (c13 != 2) {
                        ac.y(parcel, readInt4);
                    } else {
                        i14 = ac.u(parcel, readInt4);
                    }
                }
                ac.m(parcel, z13);
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
