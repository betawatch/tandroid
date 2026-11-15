package j1;

import android.os.Parcel;
import android.os.Parcelable;
import c5.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {
    public final Parcelable a;
    public static final a b = new a();
    public static final Parcelable.Creator<b> CREATOR = new j(1);

    public b() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.a, i7);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
