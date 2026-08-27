package k7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class cg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = h7.q8.z(parcel);
                long j10 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i10 = h7.q8.u(parcel, readInt);
                    } else if (c10 == 2) {
                        i11 = h7.q8.u(parcel, readInt);
                    } else if (c10 == 3) {
                        i12 = h7.q8.u(parcel, readInt);
                    } else if (c10 == 4) {
                        i13 = h7.q8.u(parcel, readInt);
                    } else if (c10 != 5) {
                        h7.q8.y(parcel, readInt);
                    } else {
                        j10 = h7.q8.w(parcel, readInt);
                    }
                }
                h7.q8.m(parcel, z10);
                return new ag(i10, i11, i12, j10, i13);
            case 1:
                int z11 = h7.q8.z(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x8 = h7.q8.x(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (x8 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x8);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) h7.q8.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i14 = h7.q8.u(parcel, readInt2);
                            break;
                        case 4:
                            i15 = h7.q8.u(parcel, readInt2);
                            break;
                        case 5:
                            i16 = h7.q8.u(parcel, readInt2);
                            break;
                        case 6:
                            i17 = h7.q8.u(parcel, readInt2);
                            break;
                        case 7:
                            i18 = h7.q8.u(parcel, readInt2);
                            break;
                        default:
                            h7.q8.y(parcel, readInt2);
                            break;
                    }
                }
                h7.q8.m(parcel, z11);
                return new hg(fArr, bitmap, i14, i15, i16, i17, i18);
            case 2:
                int z12 = h7.q8.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        arrayList = h7.q8.l(parcel, readInt3, hg.CREATOR);
                    } else if (c11 == 2) {
                        int x10 = h7.q8.x(parcel, readInt3);
                        int dataPosition2 = parcel.dataPosition();
                        if (x10 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + x10);
                            fArr2 = createFloatArray;
                        }
                    } else if (c11 == 3) {
                        bitmap2 = (Bitmap) h7.q8.g(parcel, readInt3, Bitmap.CREATOR);
                    } else if (c11 != 4) {
                        h7.q8.y(parcel, readInt3);
                    } else {
                        int x11 = h7.q8.x(parcel, readInt3);
                        int dataPosition3 = parcel.dataPosition();
                        if (x11 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int readInt4 = parcel.readInt();
                            for (int i19 = 0; i19 < readInt4; i19++) {
                                arrayList3.add(Float.valueOf(parcel.readFloat()));
                            }
                            parcel.setDataPosition(dataPosition3 + x11);
                            arrayList2 = arrayList3;
                        }
                    }
                }
                h7.q8.m(parcel, z12);
                return new ig(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z13 = h7.q8.z(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        z14 = h7.q8.n(parcel, readInt5);
                    } else if (c12 == 2) {
                        z15 = h7.q8.n(parcel, readInt5);
                    } else if (c12 == 3) {
                        z16 = h7.q8.n(parcel, readInt5);
                    } else if (c12 == 4) {
                        z17 = h7.q8.n(parcel, readInt5);
                    } else if (c12 != 5) {
                        h7.q8.y(parcel, readInt5);
                    } else {
                        z18 = h7.q8.n(parcel, readInt5);
                    }
                }
                h7.q8.m(parcel, z13);
                return new jg(z14, z15, z16, z17, z18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new ag[i10];
            case 1:
                return new hg[i10];
            case 2:
                return new ig[i10];
            default:
                return new jg[i10];
        }
    }
}
