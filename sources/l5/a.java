package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import l4.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(3);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean h;

    public a(boolean z4, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        m.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.a = z4;
        if (z4) {
            m.i(str, "serverClientId must be provided if Google ID tokens are requested");
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
        return this.a == aVar.a && m.l(this.b, aVar.b) && m.l(this.c, aVar.c) && this.d == aVar.d && m.l(this.e, aVar.e) && m.l(this.f, aVar.f) && this.h == aVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f5.l(parcel, 2, this.b);
        f5.l(parcel, 3, this.c);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.l(parcel, 5, this.e);
        f5.n(parcel, 6, this.f);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f5.r(parcel, q10);
    }
}
