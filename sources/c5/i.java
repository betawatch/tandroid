package c5;

import android.os.Parcel;
import android.os.Parcelable;
import m.k3;
import m.w2;
import v4.x0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new j(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return j1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new w2(parcel, classLoader);
            case 3:
                return new k3(parcel, classLoader);
            default:
                return new x0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new j[i7];
            case 1:
                return new j1.b[i7];
            case 2:
                return new w2[i7];
            case 3:
                return new k3[i7];
            default:
                return new x0[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new j(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return j1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new w2(parcel, null);
            case 3:
                return new k3(parcel, null);
            default:
                return new x0(parcel, null);
        }
    }
}
