package c6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c3.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends o6.a {
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
        return g6.a.d(this.a, dVar.a) && g6.a.d(this.b, dVar.b) && g6.a.d(this.c, dVar.c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f, dVar.f) && g6.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder v = a1.g.v("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        v.append(size);
        v.append(", senderAppIdentifier: ");
        v.append(this.d);
        v.append(", senderAppLaunchUrl: ");
        i0.r(v, valueOf, ", iconUrl: ", this.f, ", type: ");
        v.append(this.h);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        h0.l(parcel, 6, this.d);
        h0.k(parcel, 7, this.e, i10);
        h0.l(parcel, 8, this.f);
        h0.l(parcel, 9, this.h);
        h0.a(parcel, 10, this.n);
        h0.a(parcel, 11, this.r);
        h0.r(parcel, q6);
    }
}
