// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum ba9 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("preferred"),
    b("required");

    public static final Parcelable.Creator<ba9> CREATOR = new j9d((byte) 5);
    public final String a;

    ba9(String str) {
        this.a = str;
    }

    public static ba9 a(String str) {
        for (ba9 ba9Var : values()) {
            if (str.equals(ba9Var.a)) {
                return ba9Var;
            }
        }
        throw new aa9(tb4.y("Resident key requirement ", str, " not supported"));
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
