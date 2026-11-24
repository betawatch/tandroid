package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new hx6((byte) 5);
    public final bcc a;

    public ParcelImpl(Parcel parcel) {
        this.a = new acc(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new acc(parcel).l(this.a);
    }

    public ParcelImpl(bcc bccVar) {
        this.a = bccVar;
    }
}
