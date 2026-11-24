package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new hv6((byte) 5);
    public final aac a;

    public ParcelImpl(Parcel parcel) {
        this.a = new z9c(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new z9c(parcel).l(this.a);
    }

    public ParcelImpl(aac aacVar) {
        this.a = aacVar;
    }
}
