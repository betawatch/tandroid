package f7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("discouraged");

    public static final Parcelable.Creator<j0> CREATOR = new db.k(26);
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
        throw new s0(a8.p0.p("User verification requirement ", str, " not supported"));
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
