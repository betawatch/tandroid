package f2;

import android.os.Parcel;
import android.os.Parcelable;
import m.l3;
import m.y2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ f1(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new g1(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new y2(parcel, classLoader);
            case 3:
                return new l3(parcel, classLoader);
            default:
                return new m2.g(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new g1[i10];
            case 1:
                return new i1.b[i10];
            case 2:
                return new y2[i10];
            case 3:
                return new l3[i10];
            default:
                return new m2.g[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new g1(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new y2(parcel, null);
            case 3:
                return new l3(parcel, null);
            default:
                return new m2.g(parcel, null);
        }
    }
}
