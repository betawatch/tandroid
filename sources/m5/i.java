package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.a = z10;
        this.b = str;
        this.c = z11;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && q5.a.d(this.b, iVar.b) && this.c == iVar.c && q5.a.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        p8.l(parcel, 3, this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.k(parcel, 5, this.d, i9);
        p8.r(parcel, q10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = q5.a.a;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb2.append('-');
            sb2.append(variant);
        }
    }
}
