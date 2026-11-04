package e6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends q6.a {
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
        return i6.a.d(this.a, dVar.a) && i6.a.d(this.b, dVar.b) && i6.a.d(this.c, dVar.c) && i6.a.d(this.d, dVar.d) && i6.a.d(this.e, dVar.e) && i6.a.d(this.f, dVar.f) && i6.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        n4.append(size);
        n4.append(", senderAppIdentifier: ");
        n4.append(this.d);
        n4.append(", senderAppLaunchUrl: ");
        com.google.android.recaptcha.internal.a.s(n4, valueOf, ", iconUrl: ", this.f, ", type: ");
        n4.append(this.h);
        return n4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.o(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        j8.a.m(parcel, 6, this.d);
        j8.a.l(parcel, 7, this.e, i3);
        j8.a.m(parcel, 8, this.f);
        j8.a.m(parcel, 9, this.h);
        j8.a.b(parcel, 10, this.n);
        j8.a.b(parcel, 11, this.r);
        j8.a.t(parcel, s6);
    }
}
