package a7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);
    public final h[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public f(h[] hVarArr, String str, boolean z10, Account account) {
        this.a = hVarArr;
        this.b = str;
        this.c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (y5.l.l(this.b, fVar.b) && y5.l.l(Boolean.valueOf(this.c), Boolean.valueOf(fVar.c)) && y5.l.l(this.d, fVar.d) && Arrays.equals(this.a, fVar.a)) {
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
        int q6 = r8.q(parcel, 20293);
        r8.o(parcel, 1, this.a, i10);
        r8.l(parcel, 2, this.b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.k(parcel, 4, this.d, i10);
        r8.r(parcel, q6);
    }
}
