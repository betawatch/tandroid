package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends q6.a {
    public static final Parcelable.Creator<y> CREATOR = new r0(2);
    public final String a;
    public final String b;
    public final String c;

    public y(String str, String str2, String str3) {
        p6.m.g(str);
        this.a = str;
        p6.m.g(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p6.m.k(this.a, yVar.a) && p6.m.k(this.b, yVar.b) && p6.m.k(this.c, yVar.c);
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
        return a1.g.s(sb2, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.t(parcel, s6);
    }
}
