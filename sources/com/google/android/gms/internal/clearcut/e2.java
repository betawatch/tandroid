package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e2 extends z5.a {
    public static final Parcelable.Creator<e2> CREATOR = new f2();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String h;
    public final boolean n;
    public final int r;

    public e2(String str, int i10, int i11, String str2, r1 r1Var) {
        y5.l.h(str);
        this.a = str;
        this.b = i10;
        this.c = i11;
        this.h = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.n = false;
        this.r = r1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            if (y5.l.l(this.a, e2Var.a) && this.b == e2Var.b && this.c == e2Var.c && y5.l.l(this.h, e2Var.h) && y5.l.l(this.d, e2Var.d) && y5.l.l(this.e, e2Var.e) && this.f == e2Var.f && this.n == e2Var.n && this.r == e2Var.r) {
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
        return a9.p.k(this.r, "]", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.e);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        r8.l(parcel, 8, this.h);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        r8.r(parcel, q6);
    }

    public e2(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
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
