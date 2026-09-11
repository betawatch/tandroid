package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("discouraged");

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
        throw new t0(a4.a.p("User verification requirement ", str, " not supported"));
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
