// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum ey implements Parcelable {
    b("none"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("direct");

    public static final Parcelable.Creator<ey> CREATOR = new ced((byte) 10);
    public final String a;

    ey(String str) {
        this.a = str;
    }

    public static ey a(String str) {
        for (ey eyVar : values()) {
            if (str.equals(eyVar.a)) {
                return eyVar;
            }
        }
        throw new dy(qd4.y("Attestation conveyance preference ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
