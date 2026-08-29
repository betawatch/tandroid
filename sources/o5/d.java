package o5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a6.a {
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
        return s5.a.d(this.a, dVar.a) && s5.a.d(this.b, dVar.b) && s5.a.d(this.c, dVar.c) && s5.a.d(this.d, dVar.d) && s5.a.d(this.e, dVar.e) && s5.a.d(this.f, dVar.f) && s5.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder k9 = th.k("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        k9.append(size);
        k9.append(", senderAppIdentifier: ");
        k9.append(this.d);
        k9.append(", senderAppLaunchUrl: ");
        th.w(k9, valueOf, ", iconUrl: ", this.f, ", type: ");
        k9.append(this.h);
        return k9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.d);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.e, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.f);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.h);
        com.google.android.gms.internal.cast.o.a(parcel, 10, this.n);
        com.google.android.gms.internal.cast.o.a(parcel, 11, this.r);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
