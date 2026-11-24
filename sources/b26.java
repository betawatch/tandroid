// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b26 extends b4 {
    public static final Parcelable.Creator<b26> CREATOR = new lbd((byte) 26);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final y33 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b26() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = qe1.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b26)) {
            return false;
        }
        b26 b26Var = (b26) obj;
        return this.a == b26Var.a && qe1.d(this.b, b26Var.b) && this.c == b26Var.c && qe1.d(this.d, b26Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.k(parcel, 5, this.d, i);
        mve.s(parcel, r);
    }

    public b26(boolean z, String str, boolean z2, y33 y33Var) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = y33Var;
    }
}
