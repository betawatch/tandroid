package j7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class cg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g7.o8.z(parcel);
                long j10 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i9 = g7.o8.u(parcel, readInt);
                    } else if (c10 == 2) {
                        i10 = g7.o8.u(parcel, readInt);
                    } else if (c10 == 3) {
                        i11 = g7.o8.u(parcel, readInt);
                    } else if (c10 == 4) {
                        i12 = g7.o8.u(parcel, readInt);
                    } else if (c10 != 5) {
                        g7.o8.y(parcel, readInt);
                    } else {
                        j10 = g7.o8.w(parcel, readInt);
                    }
                }
                g7.o8.m(parcel, z10);
                return new ag(i9, i10, i11, j10, i12);
            case 1:
                int z11 = g7.o8.z(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x10 = g7.o8.x(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (x10 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x10);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) g7.o8.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i13 = g7.o8.u(parcel, readInt2);
                            break;
                        case 4:
                            i14 = g7.o8.u(parcel, readInt2);
                            break;
                        case 5:
                            i15 = g7.o8.u(parcel, readInt2);
                            break;
                        case 6:
                            i16 = g7.o8.u(parcel, readInt2);
                            break;
                        case 7:
                            i17 = g7.o8.u(parcel, readInt2);
                            break;
                        default:
                            g7.o8.y(parcel, readInt2);
                            break;
                    }
                }
                g7.o8.m(parcel, z11);
                return new hg(fArr, bitmap, i13, i14, i15, i16, i17);
            case 2:
                int z12 = g7.o8.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        arrayList = g7.o8.l(parcel, readInt3, hg.CREATOR);
                    } else if (c11 == 2) {
                        int x11 = g7.o8.x(parcel, readInt3);
                        int dataPosition2 = parcel.dataPosition();
                        if (x11 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + x11);
                            fArr2 = createFloatArray;
                        }
                    } else if (c11 == 3) {
                        bitmap2 = (Bitmap) g7.o8.g(parcel, readInt3, Bitmap.CREATOR);
                    } else if (c11 != 4) {
                        g7.o8.y(parcel, readInt3);
                    } else {
                        int x12 = g7.o8.x(parcel, readInt3);
                        int dataPosition3 = parcel.dataPosition();
                        if (x12 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int readInt4 = parcel.readInt();
                            for (int i18 = 0; i18 < readInt4; i18++) {
                                arrayList3.add(Float.valueOf(parcel.readFloat()));
                            }
                            parcel.setDataPosition(dataPosition3 + x12);
                            arrayList2 = arrayList3;
                        }
                    }
                }
                g7.o8.m(parcel, z12);
                return new ig(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z13 = g7.o8.z(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        z14 = g7.o8.n(parcel, readInt5);
                    } else if (c12 == 2) {
                        z15 = g7.o8.n(parcel, readInt5);
                    } else if (c12 == 3) {
                        z16 = g7.o8.n(parcel, readInt5);
                    } else if (c12 == 4) {
                        z17 = g7.o8.n(parcel, readInt5);
                    } else if (c12 != 5) {
                        g7.o8.y(parcel, readInt5);
                    } else {
                        z18 = g7.o8.n(parcel, readInt5);
                    }
                }
                g7.o8.m(parcel, z13);
                return new jg(z14, z15, z16, z17, z18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new ag[i9];
            case 1:
                return new hg[i9];
            case 2:
                return new ig[i9];
            default:
                return new jg[i9];
        }
    }
}
