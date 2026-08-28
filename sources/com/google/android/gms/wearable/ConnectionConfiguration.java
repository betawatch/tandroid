package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import h5.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x5.l;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ConnectionConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new h(7);
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

    public ConnectionConfiguration(String str, String str2, int i9, int i10, boolean z10, boolean z11, String str3, boolean z12, String str4, String str5, int i11, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i9;
        this.d = i10;
        this.e = z10;
        this.f = z11;
        this.h = str3;
        this.n = z12;
        this.r = str4;
        this.s = str5;
        this.v = i11;
        this.w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return l.l(this.a, connectionConfiguration.a) && l.l(this.b, connectionConfiguration.b) && l.l(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && l.l(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && l.l(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && l.l(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.n + ", NodeId=" + this.r + ", PackageName=" + this.s + ", ConnectionRetryStrategy=" + this.v + ", allowedConfigPackages=" + this.w + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        int i10 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        int i11 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i11);
        boolean z10 = this.e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.l(parcel, 8, this.h);
        boolean z12 = this.n;
        p8.s(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        p8.l(parcel, 10, this.r);
        p8.l(parcel, 11, this.s);
        int i12 = this.v;
        p8.s(parcel, 12, 4);
        parcel.writeInt(i12);
        p8.n(parcel, 13, this.w);
        p8.r(parcel, q10);
    }
}
