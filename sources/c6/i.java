package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends o6.a {
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
        return this.a == iVar.a && g6.a.d(this.b, iVar.b) && this.c == iVar.c && g6.a.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        w7.e0.l(parcel, 3, this.b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.r(parcel, q6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = g6.a.a;
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
