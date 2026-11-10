package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import b5.c;
import b5.d;
import w.a;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
