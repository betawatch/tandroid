package b7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(16);
    public final g[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.a = gVarArr;
        this.b = str;
        this.c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (z5.l.l(this.b, eVar.b) && z5.l.l(Boolean.valueOf(this.c), Boolean.valueOf(eVar.c)) && z5.l.l(this.d, eVar.d) && Arrays.equals(this.a, eVar.a)) {
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
        int q6 = o.q(parcel, 20293);
        o.o(parcel, 1, this.a, i10);
        o.l(parcel, 2, this.b);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        o.k(parcel, 4, this.d, i10);
        o.r(parcel, q6);
    }
}
