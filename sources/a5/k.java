package a5;

import android.os.Parcel;
import android.os.Parcelable;
import m.l3;
import m.x2;
import s4.y0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new l(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new x2(parcel, classLoader);
            case 3:
                return new l3(parcel, classLoader);
            default:
                return new y0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new l[i10];
            case 1:
                return new i1.b[i10];
            case 2:
                return new x2[i10];
            case 3:
                return new l3[i10];
            default:
                return new y0[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new l(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new x2(parcel, null);
            case 3:
                return new l3(parcel, null);
            default:
                return new y0(parcel, null);
        }
    }
}
