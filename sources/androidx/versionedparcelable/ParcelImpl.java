package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import x5.h;
import y4.c;
import y4.d;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
