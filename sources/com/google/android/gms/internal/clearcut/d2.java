package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d2 extends c6.a {
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
        b6.m.h(str);
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
            if (b6.m.l(this.a, d2Var.a) && this.b == d2Var.b && this.c == d2Var.c && b6.m.l(this.h, d2Var.h) && b6.m.l(this.d, d2Var.d) && b6.m.l(this.e, d2Var.e) && this.f == d2Var.f && this.n == d2Var.n && this.r == d2Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.h, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.n), Integer.valueOf(this.r)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayLoggerContext[package=");
        sb.append(this.a);
        sb.append(",packageVersionCode=");
        sb.append(this.b);
        sb.append(",logSource=");
        sb.append(this.c);
        sb.append(",logSourceName=");
        sb.append(this.h);
        sb.append(",uploadAccount=");
        sb.append(this.d);
        sb.append(",loggingId=");
        sb.append(this.e);
        sb.append(",logAndroidId=");
        sb.append(this.f);
        sb.append(",isAnonymous=");
        sb.append(this.n);
        sb.append(",qosTier=");
        return android.support.v4.media.a.m(this.r, "]", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        f5.l(parcel, 8, this.h);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        f5.r(parcel, q10);
    }

    public d2(String str, int i10, int i11, String str2, String str3, boolean z4, String str4, boolean z10, int i12) {
        this.a = str;
        this.b = i10;
        this.c = i11;
        this.d = str2;
        this.e = str3;
        this.f = z4;
        this.h = str4;
        this.n = z10;
        this.r = i12;
    }
}
