package m2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.f1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends i1.b {
    public static final Parcelable.Creator<g> CREATOR = new f1(4);
    public int c;
    public Parcelable d;
    public final ClassLoader e;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return android.support.v4.media.a.m(this.c, "}", sb);
    }

    @Override // i1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i10);
    }
}
