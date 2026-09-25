package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    r(int i10) {
        this.a = i10;
    }

    public static r a(int i10) {
        for (r rVar : values()) {
            if (i10 == rVar.a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new q(hg.c.i(i10, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
    }
}
