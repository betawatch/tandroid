package i1;

import android.os.Parcel;
import android.os.Parcelable;
import m.j3;
import m.w2;
import s4.w0;
import z4.f;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                return new w2(parcel, classLoader);
            case 2:
                return new j3(parcel, classLoader);
            case 3:
                return new w0(parcel, classLoader);
            default:
                return new f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new c[i10];
            case 1:
                return new w2[i10];
            case 2:
                return new j3[i10];
            case 3:
                return new w0[i10];
            default:
                return new f[i10];
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
                return new w2(parcel, null);
            case 2:
                return new j3(parcel, null);
            case 3:
                return new w0(parcel, null);
            default:
                return new f(parcel, null);
        }
    }
}
