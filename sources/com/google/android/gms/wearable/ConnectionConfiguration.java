package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l4.j;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class ConnectionConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new j(8);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean f;
    public volatile String h;
    public final boolean n;
    public final String r;
    public final String s;
    public final int v;
    public final List w;

    public ConnectionConfiguration(String str, String str2, int i10, int i11, boolean z4, boolean z10, String str3, boolean z11, String str4, String str5, int i12, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = i11;
        this.e = z4;
        this.f = z10;
        this.h = str3;
        this.n = z11;
        this.r = str4;
        this.s = str5;
        this.v = i12;
        this.w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return m.l(this.a, connectionConfiguration.a) && m.l(this.b, connectionConfiguration.b) && m.l(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && m.l(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && m.l(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && m.l(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.n + ", NodeId=" + this.r + ", PackageName=" + this.s + ", ConnectionRetryStrategy=" + this.v + ", allowedConfigPackages=" + this.w + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        int i11 = this.c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i12);
        boolean z4 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f5.l(parcel, 8, this.h);
        boolean z11 = this.n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f5.l(parcel, 10, this.r);
        f5.l(parcel, 11, this.s);
        int i13 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeInt(i13);
        f5.n(parcel, 13, this.w);
        f5.r(parcel, q10);
    }
}
