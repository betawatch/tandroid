// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum bc9 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("preferred"),
    b("required");

    public static final Parcelable.Creator<bc9> CREATOR = new lbd((byte) 5);
    public final String a;

    bc9(String str) {
        this.a = str;
    }

    public static bc9 a(String str) {
        for (bc9 bc9Var : values()) {
            if (str.equals(bc9Var.a)) {
                return bc9Var;
            }
        }
        throw new ac9(kt6.o("Resident key requirement ", str, " not supported"));
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
