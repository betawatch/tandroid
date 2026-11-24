package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ConnectionConfiguration extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new igd(23);
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
    public final ArrayList x;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.h = str3;
        this.n = z3;
        this.r = str4;
        this.s = str5;
        this.w = i3;
        this.x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return cqe.a(this.a, connectionConfiguration.a) && cqe.a(this.b, connectionConfiguration.b) && cqe.a(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && cqe.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && cqe.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && cqe.a(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.n + ", NodeId=" + this.r + ", PackageName=" + this.s + ", ConnectionRetryStrategy=" + this.w + ", allowedConfigPackages=" + this.x + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        jte.q(parcel, 5, 4);
        parcel.writeInt(i3);
        boolean z = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.l(parcel, 8, this.h);
        boolean z3 = this.n;
        jte.q(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        jte.l(parcel, 10, this.r);
        jte.l(parcel, 11, this.s);
        int i4 = this.w;
        jte.q(parcel, 12, 4);
        parcel.writeInt(i4);
        jte.n(parcel, 13, this.x);
        jte.s(parcel, r);
    }
}
