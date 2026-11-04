package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class sg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                long j10 = 0;
                int i3 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i3 = g6.e.u(parcel, readInt);
                    } else if (c2 == 2) {
                        i10 = g6.e.u(parcel, readInt);
                    } else if (c2 == 3) {
                        i11 = g6.e.u(parcel, readInt);
                    } else if (c2 == 4) {
                        i12 = g6.e.u(parcel, readInt);
                    } else if (c2 != 5) {
                        g6.e.y(parcel, readInt);
                    } else {
                        j10 = g6.e.w(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                return new qg(i3, i10, i11, j10, i12);
            case 1:
                int z11 = g6.e.z(parcel);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                float[] fArr = null;
                Bitmap bitmap = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x10 = g6.e.x(parcel, readInt2);
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
                            bitmap = (Bitmap) g6.e.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i13 = g6.e.u(parcel, readInt2);
                            break;
                        case 4:
                            i14 = g6.e.u(parcel, readInt2);
                            break;
                        case 5:
                            i15 = g6.e.u(parcel, readInt2);
                            break;
                        case 6:
                            i16 = g6.e.u(parcel, readInt2);
                            break;
                        case 7:
                            i17 = g6.e.u(parcel, readInt2);
                            break;
                        default:
                            g6.e.y(parcel, readInt2);
                            break;
                    }
                }
                g6.e.m(parcel, z11);
                return new xg(fArr, bitmap, i13, i14, i15, i16, i17);
            case 2:
                int z12 = g6.e.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        arrayList = g6.e.l(parcel, readInt3, xg.CREATOR);
                    } else if (c10 == 2) {
                        int x11 = g6.e.x(parcel, readInt3);
                        int dataPosition2 = parcel.dataPosition();
                        if (x11 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + x11);
                            fArr2 = createFloatArray;
                        }
                    } else if (c10 == 3) {
                        bitmap2 = (Bitmap) g6.e.g(parcel, readInt3, Bitmap.CREATOR);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        int x12 = g6.e.x(parcel, readInt3);
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
                g6.e.m(parcel, z12);
                return new yg(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z13 = g6.e.z(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        z14 = g6.e.n(parcel, readInt5);
                    } else if (c11 == 2) {
                        z15 = g6.e.n(parcel, readInt5);
                    } else if (c11 == 3) {
                        z16 = g6.e.n(parcel, readInt5);
                    } else if (c11 == 4) {
                        z17 = g6.e.n(parcel, readInt5);
                    } else if (c11 != 5) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        z18 = g6.e.n(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z13);
                return new zg(z14, z15, z16, z17, z18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new qg[i3];
            case 1:
                return new xg[i3];
            case 2:
                return new yg[i3];
            default:
                return new zg[i3];
        }
    }
}
