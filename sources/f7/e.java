package f7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public enum e implements Parcelable {
    b("none"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("direct");

    public static final Parcelable.Creator<e> CREATOR = new db.k(24);
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
        throw new d(a8.p0.p("Attestation conveyance preference ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.a);
    }
}
