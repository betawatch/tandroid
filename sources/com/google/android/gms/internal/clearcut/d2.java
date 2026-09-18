package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d2 extends o6.a {
    public static final Parcelable.Creator<d2> CREATOR = new e2();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String h;
    public final boolean n;
    public final int r;

    public d2(String str, int i10, int i11, String str2, q1 q1Var) {
        n6.l.h(str);
        this.a = str;
        this.b = i10;
        this.c = i11;
        this.h = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.n = false;
        this.r = q1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            if (n6.l.l(this.a, d2Var.a) && this.b == d2Var.b && this.c == d2Var.c && n6.l.l(this.h, d2Var.h) && n6.l.l(this.d, d2Var.d) && n6.l.l(this.e, d2Var.e) && this.f == d2Var.f && this.n == d2Var.n && this.r == d2Var.r) {
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
        return a4.a.n(this.r, "]", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.e);
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        w7.e0.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        w7.e0.r(parcel, q6);
    }

    public d2(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
        this.a = str;
        this.b = i10;
        this.c = i11;
        this.d = str2;
        this.e = str3;
        this.f = z10;
        this.h = str4;
        this.n = z11;
        this.r = i12;
    }
}
