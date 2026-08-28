package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d1 extends y5.a implements h8.n {
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

    public d1(int i9, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.a = i9;
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
        int f10 = j3.r0.f((this.a + 31) * 31, 31, this.b);
        String str = this.c;
        int f11 = j3.r0.f(j3.r0.f(j3.r0.f((f10 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        int hashCode = (((((((((f11 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.v) * 31;
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
        j3.r0.y(sb2, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        p8.l(parcel, 3, str);
        p8.l(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.e);
        p8.l(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        p8.l(parcel, 8, str);
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        p8.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        p8.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        p8.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        p8.l(parcel, 13, this.w);
        p8.r(parcel, q10);
    }
}
