package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c2 extends r6.a {
    public static final Parcelable.Creator<c2> CREATOR = new d2();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String h;
    public final boolean n;
    public final int r;

    public c2(String str, int i7, int i10, String str2, p1 p1Var) {
        q6.m.g(str);
        this.a = str;
        this.b = i7;
        this.c = i10;
        this.h = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.n = false;
        this.r = p1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (q6.m.k(this.a, c2Var.a) && this.b == c2Var.b && this.c == c2Var.c && q6.m.k(this.h, c2Var.h) && q6.m.k(this.d, c2Var.d) && q6.m.k(this.e, c2Var.e) && this.f == c2Var.f && this.n == c2Var.n && this.r == c2Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.h, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.n), Integer.valueOf(this.r)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayLoggerContext[package=");
        sb2.append(this.a);
        sb2.append(",packageVersionCode=");
        sb2.append(this.b);
        sb2.append(",logSource=");
        sb2.append(this.c);
        sb2.append(",logSourceName=");
        sb2.append(this.h);
        sb2.append(",uploadAccount=");
        sb2.append(this.d);
        sb2.append(",loggingId=");
        sb2.append(this.e);
        sb2.append(",logAndroidId=");
        sb2.append(this.f);
        sb2.append(",isAnonymous=");
        sb2.append(this.n);
        sb2.append(",qosTier=");
        return a8.p0.n(this.r, "]", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.e);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        xb.l(parcel, 8, this.h);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        xb.q(parcel, 10, 4);
        parcel.writeInt(this.r);
        xb.s(parcel, r10);
    }

    public c2(String str, int i7, int i10, String str2, String str3, boolean z9, String str4, boolean z10, int i11) {
        this.a = str;
        this.b = i7;
        this.c = i10;
        this.d = str2;
        this.e = str3;
        this.f = z9;
        this.h = str4;
        this.n = z10;
        this.r = i11;
    }
}
