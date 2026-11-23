package f6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d extends r6.a {
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
        return j6.a.d(this.a, dVar.a) && j6.a.d(this.b, dVar.b) && j6.a.d(this.c, dVar.c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.e, dVar.e) && j6.a.d(this.f, dVar.f) && j6.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder n10 = e2.n("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        e2.r(n10, valueOf, ", iconUrl: ", this.f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.l(parcel, 3, this.b);
        cc.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        cc.l(parcel, 6, this.d);
        cc.k(parcel, 7, this.e, i7);
        cc.l(parcel, 8, this.f);
        cc.l(parcel, 9, this.h);
        cc.a(parcel, 10, this.n);
        cc.a(parcel, 11, this.r);
        cc.s(parcel, r10);
    }
}
