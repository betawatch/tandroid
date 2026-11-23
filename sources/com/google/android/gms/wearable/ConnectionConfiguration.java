package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class ConnectionConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new w.a(8);
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

    public ConnectionConfiguration(String str, String str2, int i7, int i10, boolean z10, boolean z11, String str3, boolean z12, String str4, String str5, int i11, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i7;
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
        return m.l(this.a, connectionConfiguration.a) && m.l(this.b, connectionConfiguration.b) && m.l(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && m.l(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && m.l(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && m.l(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.n + ", NodeId=" + this.r + ", PackageName=" + this.s + ", ConnectionRetryStrategy=" + this.w + ", allowedConfigPackages=" + this.x + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        int i10 = this.c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        int i11 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i11);
        boolean z10 = this.e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.l(parcel, 8, this.h);
        boolean z12 = this.n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        bc.l(parcel, 10, this.r);
        bc.l(parcel, 11, this.s);
        int i12 = this.w;
        bc.q(parcel, 12, 4);
        parcel.writeInt(i12);
        bc.n(parcel, 13, this.x);
        bc.s(parcel, r10);
    }
}
