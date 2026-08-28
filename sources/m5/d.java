package m5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
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
        return q5.a.d(this.a, dVar.a) && q5.a.d(this.b, dVar.b) && q5.a.d(this.c, dVar.c) && q5.a.d(this.d, dVar.d) && q5.a.d(this.e, dVar.e) && q5.a.d(this.f, dVar.f) && q5.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder q10 = r0.q("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        q10.append(size);
        q10.append(", senderAppIdentifier: ");
        q10.append(this.d);
        q10.append(", senderAppLaunchUrl: ");
        r0.A(q10, valueOf, ", iconUrl: ", this.f, ", type: ");
        q10.append(this.h);
        return q10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        p8.l(parcel, 6, this.d);
        p8.k(parcel, 7, this.e, i9);
        p8.l(parcel, 8, this.f);
        p8.l(parcel, 9, this.h);
        p8.a(parcel, 10, this.n);
        p8.a(parcel, 11, this.r);
        p8.r(parcel, q10);
    }
}
