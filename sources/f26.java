// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f26 extends c4 {
    public static final Parcelable.Creator<f26> CREATOR = new ced((byte) 26);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final f33 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f26() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = qd1.a;
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
        if (!(obj instanceof f26)) {
            return false;
        }
        f26 f26Var = (f26) obj;
        return this.a == f26Var.a && qd1.d(this.b, f26Var.b) && this.c == f26Var.c && qd1.d(this.d, f26Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.k(parcel, 5, this.d, i);
        bye.s(parcel, r);
    }

    public f26(boolean z, String str, boolean z2, f33 f33Var) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = f33Var;
    }
}
