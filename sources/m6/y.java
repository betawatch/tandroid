package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends y5.a {
    public static final Parcelable.Creator<y> CREATOR = new h5.h(28);
    public final String a;
    public final String b;
    public final String c;

    public y(String str, String str2, String str3) {
        x5.l.h(str);
        this.a = str;
        x5.l.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return x5.l.l(this.a, yVar.a) && x5.l.l(this.b, yVar.b) && x5.l.l(this.c, yVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.a);
        sb2.append("', \n name='");
        sb2.append(this.b);
        sb2.append("', \n icon='");
        return aa.d.r(sb2, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        p8.r(parcel, q10);
    }
}
