package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
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

    public g(h hVar, boolean z10) {
        this.a = hVar;
        this.b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p6.m.k(this.a, gVar.a) && this.c == gVar.c && this.b == gVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return f1.r("ApiMetadata(complianceOptions=", valueOf, ")", new StringBuilder(valueOf.length() + 31));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.a, i3);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
