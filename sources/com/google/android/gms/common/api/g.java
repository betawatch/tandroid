package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = t.b;
    public static final g d;
    public final h a;
    public final boolean b;
    public boolean c;

    static {
        g gVar = new g(null, false);
        gVar.c = false;
        d = gVar;
    }

    public g(h hVar, boolean z9) {
        this.a = hVar;
        this.b = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return q6.m.k(this.a, gVar.a) && this.c == gVar.c && this.b == gVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return f1.n("ApiMetadata(complianceOptions=", valueOf, ")", new StringBuilder(valueOf.length() + 31));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.a, i7);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        wb.s(parcel, r10);
    }
}
