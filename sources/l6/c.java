package l6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import java.util.Arrays;
import q6.m;

/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(27);
    public final c2 a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final n8.a[] h;
    public final boolean n;
    public final w1 r;

    public c(c2 c2Var, w1 w1Var) {
        this.a = c2Var;
        this.r = w1Var;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.k(this.a, cVar.a) && Arrays.equals(this.b, cVar.b) && Arrays.equals(this.c, cVar.c) && Arrays.equals(this.d, cVar.d) && m.k(this.r, cVar.r) && m.k(null, null) && m.k(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f, cVar.f) && Arrays.equals(this.h, cVar.h) && this.n == cVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.r, null, null, this.e, this.f, this.h, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.a, i7);
        wb.c(parcel, 3, this.b);
        wb.g(parcel, 4, this.c);
        wb.m(parcel, 5, this.d);
        wb.g(parcel, 6, this.e);
        wb.d(parcel, 7, this.f);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        wb.o(parcel, 9, this.h, i7);
        wb.s(parcel, r10);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z9, n8.a[] aVarArr) {
        this.a = c2Var;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.r = null;
        this.e = iArr2;
        this.f = bArr2;
        this.h = aVarArr;
        this.n = z9;
    }
}
