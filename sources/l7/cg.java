package l7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class cg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                long j10 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i10 = ce.b.v(parcel, readInt);
                    } else if (c3 == 2) {
                        i11 = ce.b.v(parcel, readInt);
                    } else if (c3 == 3) {
                        i12 = ce.b.v(parcel, readInt);
                    } else if (c3 == 4) {
                        i13 = ce.b.v(parcel, readInt);
                    } else if (c3 != 5) {
                        ce.b.z(parcel, readInt);
                    } else {
                        j10 = ce.b.x(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new ag(i10, i11, i12, j10, i13);
            case 1:
                int A2 = ce.b.A(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int y8 = ce.b.y(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (y8 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + y8);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) ce.b.h(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i14 = ce.b.v(parcel, readInt2);
                            break;
                        case 4:
                            i15 = ce.b.v(parcel, readInt2);
                            break;
                        case 5:
                            i16 = ce.b.v(parcel, readInt2);
                            break;
                        case 6:
                            i17 = ce.b.v(parcel, readInt2);
                            break;
                        case 7:
                            i18 = ce.b.v(parcel, readInt2);
                            break;
                        default:
                            ce.b.z(parcel, readInt2);
                            break;
                    }
                }
                ce.b.n(parcel, A2);
                return new hg(fArr, bitmap, i14, i15, i16, i17, i18);
            case 2:
                int A3 = ce.b.A(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        arrayList = ce.b.m(parcel, readInt3, hg.CREATOR);
                    } else if (c6 == 2) {
                        int y10 = ce.b.y(parcel, readInt3);
                        int dataPosition2 = parcel.dataPosition();
                        if (y10 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + y10);
                            fArr2 = createFloatArray;
                        }
                    } else if (c6 == 3) {
                        bitmap2 = (Bitmap) ce.b.h(parcel, readInt3, Bitmap.CREATOR);
                    } else if (c6 != 4) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        int y11 = ce.b.y(parcel, readInt3);
                        int dataPosition3 = parcel.dataPosition();
                        if (y11 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int readInt4 = parcel.readInt();
                            for (int i19 = 0; i19 < readInt4; i19++) {
                                arrayList3.add(Float.valueOf(parcel.readFloat()));
                            }
                            parcel.setDataPosition(dataPosition3 + y11);
                            arrayList2 = arrayList3;
                        }
                    }
                }
                ce.b.n(parcel, A3);
                return new ig(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int A4 = ce.b.A(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < A4) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 1) {
                        z10 = ce.b.o(parcel, readInt5);
                    } else if (c10 == 2) {
                        z11 = ce.b.o(parcel, readInt5);
                    } else if (c10 == 3) {
                        z12 = ce.b.o(parcel, readInt5);
                    } else if (c10 == 4) {
                        z13 = ce.b.o(parcel, readInt5);
                    } else if (c10 != 5) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        z14 = ce.b.o(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A4);
                return new jg(z10, z11, z12, z13, z14);
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
