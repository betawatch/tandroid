package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new t(1);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public h(int i9, int i10, int i11, boolean z10) {
        this.a = i9;
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
        return "ComplianceOptions{callerProductId=" + this.a + ", dataOwnerProductId=" + this.b + ", processingReason=" + this.c + ", isUserData=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
