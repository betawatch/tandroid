package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new u(1);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public h(int i7, int i10, int i11, boolean z10) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = z10;
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
        boolean z10 = this.d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i7);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i10);
        sb2.append(", processingReason=");
        sb2.append(i11);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.s(parcel, r10);
    }
}
