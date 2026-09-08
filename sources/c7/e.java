package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public enum e implements Parcelable {
    b("none"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("direct");

    public static final Parcelable.Creator<e> CREATOR = new r0(5);
    public final String a;

    e(String str) {
        this.a = str;
    }

    public static e a(String str) {
        for (e eVar : values()) {
            if (str.equals(eVar.a)) {
                return eVar;
            }
        }
        throw new d(a4.a.p("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
    }
}
