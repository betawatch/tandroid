package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d1 extends a6.a implements j8.n {
    public static final Parcelable.Creator<d1> CREATOR = new p0(9);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final byte n;
    public final byte r;
    public final byte s;
    public final byte v;
    public final String w;

    public d1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = b10;
        this.r = b11;
        this.s = b12;
        this.v = b13;
        this.w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        String str = d1Var.w;
        String str2 = d1Var.h;
        String str3 = d1Var.c;
        if (this.a != d1Var.a || this.n != d1Var.n || this.r != d1Var.r || this.s != d1Var.s || this.v != d1Var.v || !this.b.equals(d1Var.b)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(d1Var.d) || !this.e.equals(d1Var.e) || !this.f.equals(d1Var.f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.w;
        return str6 != null ? str6.equals(str) : str == null;
    }

    public final int hashCode() {
        int f9 = l1.f((this.a + 31) * 31, 31, this.b);
        String str = this.c;
        int f10 = l1.f(l1.f(l1.f((f9 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        int hashCode = (((((((((f10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.v) * 31;
        String str3 = this.w;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.a);
        sb2.append(", appId='");
        sb2.append(this.b);
        sb2.append("', dateTime='");
        sb2.append(this.c);
        sb2.append("', eventId=");
        sb2.append((int) this.n);
        sb2.append(", eventFlags=");
        l1.w(sb2, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        com.google.android.gms.internal.cast.o.l(parcel, 3, str);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.e);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        com.google.android.gms.internal.cast.o.l(parcel, 8, str);
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        com.google.android.gms.internal.cast.o.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        com.google.android.gms.internal.cast.o.l(parcel, 13, this.w);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
