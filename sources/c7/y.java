package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(28);
    public final String a;
    public final String b;
    public final String c;

    public y(String str, String str2, String str3) {
        n6.l.h(str);
        this.a = str;
        n6.l.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return n6.l.l(this.a, yVar.a) && n6.l.l(this.b, yVar.b) && n6.l.l(this.c, yVar.c);
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
        return a4.a.t(sb2, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.a);
        w7.f0.l(parcel, 3, this.b);
        w7.f0.l(parcel, 4, this.c);
        w7.f0.r(parcel, q6);
    }
}
