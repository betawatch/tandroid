package i1;

import android.os.Parcel;
import android.os.Parcelable;
import m.m3;
import m.y2;
import s4.v0;
import z4.g;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new y2(parcel, classLoader);
            case 2:
                return new m3(parcel, classLoader);
            case 3:
                return new v0(parcel, classLoader);
            default:
                return new g(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new c[i10];
            case 1:
                return new y2[i10];
            case 2:
                return new m3[i10];
            case 3:
                return new v0[i10];
            default:
                return new g[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new y2(parcel, null);
            case 2:
                return new m3(parcel, null);
            case 3:
                return new v0(parcel, null);
            default:
                return new g(parcel, null);
        }
    }
}
