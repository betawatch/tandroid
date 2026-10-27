package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class y extends p6.a {
    public static final Parcelable.Creator<y> CREATOR = new w.a(29);
    public final String a;
    public final String b;
    public final String c;

    public y(String str, String str2, String str3) {
        o6.l.h(str);
        this.a = str;
        o6.l.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return o6.l.l(this.a, yVar.a) && o6.l.l(this.b, yVar.b) && o6.l.l(this.c, yVar.c);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.r(parcel, q5);
    }
}
