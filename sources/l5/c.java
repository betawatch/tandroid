package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j$.util.Objects;
import j7.g5;
import java.util.Arrays;
import l4.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(5);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public c(boolean z4, byte[] bArr, String str) {
        if (z4) {
            m.h(bArr);
            m.h(str);
        }
        this.a = z4;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        g5.c(parcel, 2, this.b);
        g5.l(parcel, 3, this.c);
        g5.r(parcel, q10);
    }
}
