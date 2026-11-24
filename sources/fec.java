// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fec extends w1 {
    public static final Parcelable.Creator<fec> CREATOR = new v1((byte) 4);
    public int c;
    public Parcelable d;
    public final ClassLoader e;

    public fec(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? fec.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return de9.l(sb, this.c, "}");
    }

    @Override // w1, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
