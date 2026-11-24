// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum ay implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("cross-platform");

    public static final Parcelable.Creator<ay> CREATOR = new b1d((byte) 26);
    public final String a;

    ay(String str) {
        this.a = str;
    }

    public static ay a(String str) {
        for (ay ayVar : values()) {
            if (str.equals(ayVar.a)) {
                return ayVar;
            }
        }
        throw new zx(tb4.y("Attachment ", str, " not supported"));
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
