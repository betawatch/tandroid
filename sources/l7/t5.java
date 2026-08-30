package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = j7.l0.z(parcel);
                String str = null;
                String str2 = null;
                float f10 = 0.0f;
                int i10 = 0;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        str2 = j7.l0.h(parcel, readInt);
                    } else if (c3 == 3) {
                        f10 = j7.l0.r(parcel, readInt);
                    } else if (c3 == 4) {
                        str = j7.l0.h(parcel, readInt);
                    } else if (c3 != 5) {
                        j7.l0.y(parcel, readInt);
                    } else {
                        i10 = j7.l0.u(parcel, readInt);
                    }
                }
                j7.l0.m(parcel, z4);
                return new s4(f10, i10, str, str2);
            case 1:
                int z10 = j7.l0.z(parcel);
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i11 = j7.l0.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i12 = j7.l0.u(parcel, readInt2);
                    } else if (c10 == 4) {
                        f11 = j7.l0.r(parcel, readInt2);
                    } else if (c10 != 5) {
                        j7.l0.y(parcel, readInt2);
                    } else {
                        i13 = j7.l0.u(parcel, readInt2);
                    }
                }
                j7.l0.m(parcel, z10);
                return new t6(i11, i12, f11, i13);
            case 2:
                int z11 = j7.l0.z(parcel);
                String str3 = null;
                String str4 = null;
                float f12 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        str3 = j7.l0.h(parcel, readInt3);
                    } else if (c11 == 2) {
                        f12 = j7.l0.r(parcel, readInt3);
                    } else if (c11 == 3) {
                        str4 = j7.l0.h(parcel, readInt3);
                    } else if (c11 != 4) {
                        j7.l0.y(parcel, readInt3);
                    } else {
                        i14 = j7.l0.u(parcel, readInt3);
                    }
                }
                j7.l0.m(parcel, z11);
                return new ta(f12, i14, str3, str4);
            default:
                int z12 = j7.l0.z(parcel);
                float f13 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        f13 = j7.l0.r(parcel, readInt4);
                    } else if (c12 != 2) {
                        j7.l0.y(parcel, readInt4);
                    } else {
                        i15 = j7.l0.u(parcel, readInt4);
                    }
                }
                j7.l0.m(parcel, z12);
                return new ua(f13, i15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new s4[i10];
            case 1:
                return new t6[i10];
            case 2:
                return new ta[i10];
            default:
                return new ua[i10];
        }
    }
}
