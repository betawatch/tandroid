package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import j$.util.Objects;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new w.a(5);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public c(boolean z9, byte[] bArr, String str) {
        if (z9) {
            m.g(bArr);
            m.g(str);
        }
        this.a = z9;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Arrays.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        wb.c(parcel, 2, this.b);
        wb.l(parcel, 3, this.c);
        wb.s(parcel, r10);
    }
}
