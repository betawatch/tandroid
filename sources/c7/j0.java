package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("discouraged");

    public static final Parcelable.Creator<j0> CREATOR = new r0(7);
    public final String a;

    j0(String str) {
        this.a = str;
    }

    public static j0 a(String str) {
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.a)) {
                return j0Var;
            }
        }
        throw new t0(a1.g.n("User verification requirement ", str, " not supported"));
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
