package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t(1);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public h(int i7, int i10, int i11, boolean z9) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        int i7 = this.a;
        int length = String.valueOf(i7).length();
        int i10 = this.b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.c;
        int length3 = String.valueOf(i11).length();
        boolean z9 = this.d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z9).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i7);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i10);
        sb2.append(", processingReason=");
        sb2.append(i11);
        sb2.append(", isUserData=");
        sb2.append(z9);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.s(parcel, r10);
    }
}
