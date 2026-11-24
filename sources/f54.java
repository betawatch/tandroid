// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum f54 implements Parcelable {
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

    public static final Parcelable.Creator<f54> CREATOR = new yhf(7);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    f54(int i) {
        this.a = i;
    }

    public static f54 a(int i) {
        for (f54 f54Var : values()) {
            if (i == f54Var.a) {
                return f54Var;
            }
        }
        Locale locale = Locale.US;
        throw new e54(td4.o(i, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
