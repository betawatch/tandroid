package b5;

import android.os.Parcel;
import android.os.Parcelable;
import m.i3;
import m.v2;
import u4.x0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new k(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, classLoader);
            case 3:
                return new i3(parcel, classLoader);
            default:
                return new x0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new k[i3];
            case 1:
                return new i1.b[i3];
            case 2:
                return new v2[i3];
            case 3:
                return new i3[i3];
            default:
                return new x0[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new k(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, null);
            case 3:
                return new i3(parcel, null);
            default:
                return new x0(parcel, null);
        }
    }
}
