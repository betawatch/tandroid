package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import x5.h;
import y4.c;
import y4.d;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new h(3);
    public final d a;

    public ParcelImpl(d dVar) {
        this.a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new c(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new c(parcel).h();
    }
}
