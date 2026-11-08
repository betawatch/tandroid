package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new w.a(18);
    public String a;
    public int b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
