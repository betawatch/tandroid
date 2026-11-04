package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    w(30),
    x(35),
    y(36);

    public static final Parcelable.Creator<r> CREATOR = new r0(27);
    public final int a;

    r(int i3) {
        this.a = i3;
    }

    public static r a(int i3) {
        for (r rVar : values()) {
            if (i3 == rVar.a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new q(p1.j(i3, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.a);
    }
}
