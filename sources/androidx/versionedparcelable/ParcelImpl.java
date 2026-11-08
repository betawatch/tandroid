package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import b5.c;
import b5.d;
import w.a;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(21);
    public final d a;

    public ParcelImpl(d dVar) {
        this.a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new c(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new c(parcel).h();
    }
}
