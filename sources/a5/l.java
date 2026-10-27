package a5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends i1.b {
    public static final Parcelable.Creator<l> CREATOR = new k(0);
    public int c;
    public Parcelable d;
    public final ClassLoader e;

    public l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return a1.g.n(this.c, "}", sb2);
    }

    @Override // i1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i10);
    }
}
