package f2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k1 extends i1.b {
    public static final Parcelable.Creator<k1> CREATOR = new j1(0);
    public Parcelable c;

    public k1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? z0.class.getClassLoader() : classLoader);
    }

    @Override // i1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeParcelable(this.c, 0);
    }
}
