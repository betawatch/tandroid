package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new h(1);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.b = str;
        this.c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && l.l(this.b, aVar.b) && l.l(this.c, aVar.c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f, aVar.f) && this.h == aVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        r8.l(parcel, 2, this.b);
        r8.l(parcel, 3, this.c);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.l(parcel, 5, this.e);
        r8.n(parcel, 6, this.f);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        r8.r(parcel, q6);
    }
}
