package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import j$.util.Objects;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new w.a(5);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            m.h(bArr);
            m.h(str);
        }
        this.a = z10;
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
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bc.c(parcel, 2, this.b);
        bc.l(parcel, 3, this.c);
        bc.s(parcel, r10);
    }
}
