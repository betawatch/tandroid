package f2;

import android.os.Parcel;
import android.os.Parcelable;
import m.n3;
import m.z2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ j1(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new k1(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, classLoader);
            case 3:
                return new n3(parcel, classLoader);
            default:
                return new m2.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new k1[i9];
            case 1:
                return new i1.b[i9];
            case 2:
                return new z2[i9];
            case 3:
                return new n3[i9];
            default:
                return new m2.f[i9];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new k1(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, null);
            case 3:
                return new n3(parcel, null);
            default:
                return new m2.f(parcel, null);
        }
    }
}
