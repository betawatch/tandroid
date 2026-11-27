package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ConnectionConfiguration extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zkd(23);
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
        return vue.a(this.a, connectionConfiguration.a) && vue.a(this.b, connectionConfiguration.b) && vue.a(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && vue.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && vue.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && vue.a(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.h + ", BtlePriority=" + this.n + ", NodeId=" + this.r + ", PackageName=" + this.s + ", ConnectionRetryStrategy=" + this.w + ", allowedConfigPackages=" + this.x + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        bye.q(parcel, 5, 4);
        parcel.writeInt(i3);
        boolean z = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.l(parcel, 8, this.h);
        boolean z3 = this.n;
        bye.q(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        bye.l(parcel, 10, this.r);
        bye.l(parcel, 11, this.s);
        int i4 = this.w;
        bye.q(parcel, 12, 4);
        parcel.writeInt(i4);
        bye.n(parcel, 13, this.x);
        bye.s(parcel, r);
    }
}
