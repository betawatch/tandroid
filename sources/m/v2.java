package m;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class v2 extends j1.b {
    public static final Parcelable.Creator<v2> CREATOR = new c5.j(2);
    public boolean c;

    public v2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
    }

    @Override // j1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
