package d7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new b9.e(7);
    public final g[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z4, Account account) {
        this.a = gVarArr;
        this.b = str;
        this.c = z4;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (b6.m.l(this.b, eVar.b) && b6.m.l(Boolean.valueOf(this.c), Boolean.valueOf(eVar.c)) && b6.m.l(this.d, eVar.d) && Arrays.equals(this.a, eVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.o(parcel, 1, this.a, i10);
        f5.l(parcel, 2, this.b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
