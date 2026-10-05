package c6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        StringBuilder x10 = a4.a.x("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        x10.append(size);
        x10.append(", senderAppIdentifier: ");
        x10.append(this.d);
        x10.append(", senderAppLaunchUrl: ");
        a4.a.A(x10, valueOf, ", iconUrl: ", this.f, ", type: ");
        x10.append(this.h);
        return x10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.l(parcel, 3, this.b);
        g0.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        g0.l(parcel, 6, this.d);
        g0.k(parcel, 7, this.e, i10);
        g0.l(parcel, 8, this.f);
        g0.l(parcel, 9, this.h);
        g0.a(parcel, 10, this.n);
        g0.a(parcel, 11, this.r);
        g0.r(parcel, q6);
    }
}
