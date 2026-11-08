package f7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public enum e0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("preferred"),
    b("required");

    public static final Parcelable.Creator<e0> CREATOR = new db.k(20);
    public final String a;

    e0(String str) {
        this.a = str;
    }

    public static e0 a(String str) {
        for (e0 e0Var : values()) {
            if (str.equals(e0Var.a)) {
                return e0Var;
            }
        }
        throw new d0(a8.p0.p("Resident key requirement ", str, " not supported"));
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
