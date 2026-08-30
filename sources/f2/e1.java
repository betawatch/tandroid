package f2;

import android.os.Parcel;
import android.os.Parcelable;
import m.m3;
import m.z2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ e1(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new f1(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, classLoader);
            case 3:
                return new m3(parcel, classLoader);
            default:
                return new m2.g(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new f1[i10];
            case 1:
                return new i1.b[i10];
            case 2:
                return new z2[i10];
            case 3:
                return new m3[i10];
            default:
                return new m2.g[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new f1(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, null);
            case 3:
                return new m3(parcel, null);
            default:
                return new m2.g(parcel, null);
        }
    }
}
