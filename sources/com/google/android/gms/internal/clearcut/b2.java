package com.google.android.gms.internal.clearcut;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b2 extends p6.a {
    public static final Parcelable.Creator<b2> CREATOR = new c2();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String h;
    public final boolean n;
    public final int r;

    public b2(String str, int i10, int i11, String str2, o1 o1Var) {
        o6.l.h(str);
        this.a = str;
        this.b = i10;
        this.c = i11;
        this.h = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.n = false;
        this.r = o1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            if (o6.l.l(this.a, b2Var.a) && this.b == b2Var.b && this.c == b2Var.c && o6.l.l(this.h, b2Var.h) && o6.l.l(this.d, b2Var.d) && o6.l.l(this.e, b2Var.e) && this.f == b2Var.f && this.n == b2Var.n && this.r == b2Var.r) {
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
        return a1.g.n(this.r, "]", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        df.l(parcel, 8, this.h);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        df.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        df.r(parcel, q5);
    }

    public b2(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
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
