package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import x8.o;
import y4.c;
import y4.d;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new o(1);
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
