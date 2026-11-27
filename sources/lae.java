// default package

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lae extends c4 {
    public static final Parcelable.Creator<lae> CREATOR = new g3e(19);
    public final wwe[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public lae(wwe[] wweVarArr, String str, boolean z, Account account) {
        this.a = wweVarArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lae) {
            lae laeVar = (lae) obj;
            if (vue.a(this.b, laeVar.b) && vue.a(Boolean.valueOf(this.c), Boolean.valueOf(laeVar.c)) && vue.a(this.d, laeVar.d) && Arrays.equals(this.a, laeVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.o(parcel, 1, this.a, i);
        bye.l(parcel, 2, this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.k(parcel, 4, this.d, i);
        bye.s(parcel, r);
    }
}
