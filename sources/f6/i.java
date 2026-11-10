package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final h d;

    public i(boolean z9, String str, boolean z10, h hVar) {
        this.a = z9;
        this.b = str;
        this.c = z10;
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
        return this.a == iVar.a && j6.a.d(this.b, iVar.b) && this.c == iVar.c && j6.a.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        xb.l(parcel, 3, this.b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.k(parcel, 5, this.d, i7);
        xb.s(parcel, r10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = j6.a.a;
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
