package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public enum f0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("present"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("not-supported");

    public static final Parcelable.Creator<f0> CREATOR = new r0(3);
    public final String a;

    f0(String str) {
        this.a = str;
    }

    public static f0 a(String str) {
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.a)) {
                return f0Var;
            }
        }
        throw new g0(a4.a.p("TokenBindingStatus ", str, " not supported"));
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
