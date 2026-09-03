package m;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y2 extends i1.b {
    public static final Parcelable.Creator<y2> CREATOR = new f2.f1(2);
    public boolean c;

    public y2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
    }

    @Override // i1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
