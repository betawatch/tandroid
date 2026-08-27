package m5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w(17);
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
        return r5.a.d(this.a, dVar.a) && r5.a.d(this.b, dVar.b) && r5.a.d(this.c, dVar.c) && r5.a.d(this.d, dVar.d) && r5.a.d(this.e, dVar.e) && r5.a.d(this.f, dVar.f) && r5.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder p6 = i0.a.p("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        p6.append(size);
        p6.append(", senderAppIdentifier: ");
        p6.append(this.d);
        p6.append(", senderAppLaunchUrl: ");
        i0.a.z(p6, valueOf, ", iconUrl: ", this.f, ", type: ");
        p6.append(this.h);
        return p6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        r8.l(parcel, 6, this.d);
        r8.k(parcel, 7, this.e, i10);
        r8.l(parcel, 8, this.f);
        r8.l(parcel, 9, this.h);
        r8.a(parcel, 10, this.n);
        r8.a(parcel, 11, this.r);
        r8.r(parcel, q6);
    }
}
