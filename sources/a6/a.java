package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import q6.m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(3);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean h;

    public a(boolean z9, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        m.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.a = z9;
        if (z9) {
            m.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.b = str;
        this.c = str2;
        this.d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.e = str3;
        this.h = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.k(this.b, aVar.b) && m.k(this.c, aVar.c) && this.d == aVar.d && m.k(this.e, aVar.e) && m.k(this.f, aVar.f) && this.h == aVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        xb.l(parcel, 2, this.b);
        xb.l(parcel, 3, this.c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.l(parcel, 5, this.e);
        xb.n(parcel, 6, this.f);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        xb.s(parcel, r10);
    }
}
