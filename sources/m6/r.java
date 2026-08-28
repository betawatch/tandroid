package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum r implements Parcelable {
    b(9),
    c(11),
    d(18),
    e(19),
    f(20),
    h(23),
    n(27),
    r(28),
    s(29),
    v(30),
    w(35),
    x(36);

    public static final Parcelable.Creator<r> CREATOR = new r0(23);
    public final int a;

    r(int i9) {
        this.a = i9;
    }

    public static r a(int i9) {
        for (r rVar : values()) {
            if (i9 == rVar.a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new q(j3.r0.m(i9, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.a);
    }
}
