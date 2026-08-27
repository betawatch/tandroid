package a7;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(3);
    public final String a;
    public final String b;
    public final String c;

    public g(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return p.p(i0.a.p("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.l(parcel, 2, this.b);
        r8.l(parcel, 3, this.c);
        r8.r(parcel, q6);
    }
}
