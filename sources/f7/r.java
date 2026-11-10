package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public static final Parcelable.Creator<r> CREATOR = new t0(12);
    public final int a;

    r(int i7) {
        this.a = i7;
    }

    public static r a(int i7) {
        for (r rVar : values()) {
            if (i7 == rVar.a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new q(jg.g.k(i7, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.a);
    }
}
