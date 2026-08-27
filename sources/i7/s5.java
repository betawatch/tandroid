package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = h7.q8.z(parcel);
                String str = null;
                String str2 = null;
                float f10 = 0.0f;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str2 = h7.q8.h(parcel, readInt);
                    } else if (c10 == 3) {
                        f10 = h7.q8.r(parcel, readInt);
                    } else if (c10 == 4) {
                        str = h7.q8.h(parcel, readInt);
                    } else if (c10 != 5) {
                        h7.q8.y(parcel, readInt);
                    } else {
                        i10 = h7.q8.u(parcel, readInt);
                    }
                }
                h7.q8.m(parcel, z10);
                return new r4(f10, i10, str, str2);
            case 1:
                int z11 = h7.q8.z(parcel);
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i11 = h7.q8.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i12 = h7.q8.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        f11 = h7.q8.r(parcel, readInt2);
                    } else if (c11 != 5) {
                        h7.q8.y(parcel, readInt2);
                    } else {
                        i13 = h7.q8.u(parcel, readInt2);
                    }
                }
                h7.q8.m(parcel, z11);
                return new s6(i11, i12, f11, i13);
            case 2:
                int z12 = h7.q8.z(parcel);
                String str3 = null;
                String str4 = null;
                float f12 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        str3 = h7.q8.h(parcel, readInt3);
                    } else if (c12 == 2) {
                        f12 = h7.q8.r(parcel, readInt3);
                    } else if (c12 == 3) {
                        str4 = h7.q8.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        h7.q8.y(parcel, readInt3);
                    } else {
                        i14 = h7.q8.u(parcel, readInt3);
                    }
                }
                h7.q8.m(parcel, z12);
                return new sa(f12, i14, str3, str4);
            default:
                int z13 = h7.q8.z(parcel);
                float f13 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        f13 = h7.q8.r(parcel, readInt4);
                    } else if (c13 != 2) {
                        h7.q8.y(parcel, readInt4);
                    } else {
                        i15 = h7.q8.u(parcel, readInt4);
                    }
                }
                h7.q8.m(parcel, z13);
                return new ta(f13, i15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new r4[i10];
            case 1:
                return new s6[i10];
            case 2:
                return new sa[i10];
            default:
                return new ta[i10];
        }
    }
}
