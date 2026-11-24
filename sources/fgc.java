// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fgc extends w1 {
    public static final Parcelable.Creator<fgc> CREATOR = new v1((byte) 4);
    public int c;
    public Parcelable d;
    public final ClassLoader e;

    public fgc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? fgc.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return hg9.k(sb, this.c, "}");
    }

    @Override // w1, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
