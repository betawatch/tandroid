package d6;

import a8.df;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c3.h0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final Boolean n;
    public final Boolean r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.h = str5;
        this.n = bool;
        this.r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h6.a.d(this.a, dVar.a) && h6.a.d(this.b, dVar.b) && h6.a.d(this.c, dVar.c) && h6.a.d(this.d, dVar.d) && h6.a.d(this.e, dVar.e) && h6.a.d(this.f, dVar.f) && h6.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder w10 = a1.g.w("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        h0.r(w10, valueOf, ", iconUrl: ", this.f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        df.l(parcel, 6, this.d);
        df.k(parcel, 7, this.e, i10);
        df.l(parcel, 8, this.f);
        df.l(parcel, 9, this.h);
        df.a(parcel, 10, this.n);
        df.a(parcel, 11, this.r);
        df.r(parcel, q5);
    }
}
