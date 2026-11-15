package c5;

import android.os.Parcel;
import android.os.Parcelable;
import m.i3;
import m.v2;
import v4.y0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new k(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return j1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, classLoader);
            case 3:
                return new i3(parcel, classLoader);
            default:
                return new y0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new k[i7];
            case 1:
                return new j1.b[i7];
            case 2:
                return new v2[i7];
            case 3:
                return new i3[i7];
            default:
                return new y0[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new k(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return j1.b.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, null);
            case 3:
                return new i3(parcel, null);
            default:
                return new y0(parcel, null);
        }
    }
}
