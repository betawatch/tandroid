package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p6.m;
import q6.a;
import y8.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ConnectionConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new i(8);
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
    public final int w;
    public final List x;

    public ConnectionConfiguration(String str, String str2, int i3, int i10, boolean z10, boolean z11, String str3, boolean z12, String str4, String str5, int i11, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i3;
        this.d = i10;
        this.e = z10;
        this.f = z11;
        this.h = str3;
        this.n = z12;
        this.r = str4;
        this.s = str5;
        this.w = i11;
        this.x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return m.k(this.a, connectionConfiguration.a) && m.k(this.b, connectionConfiguration.b) && m.k(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && m.k(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && m.k(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && m.k(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.n + ", NodeId=" + this.r + ", PackageName=" + this.s + ", ConnectionRetryStrategy=" + this.w + ", allowedConfigPackages=" + this.x + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        int i10 = this.c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        int i11 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i11);
        boolean z10 = this.e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.m(parcel, 8, this.h);
        boolean z12 = this.n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        j8.a.m(parcel, 10, this.r);
        j8.a.m(parcel, 11, this.s);
        int i12 = this.w;
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(i12);
        j8.a.o(parcel, 13, this.x);
        j8.a.t(parcel, s6);
    }
}
