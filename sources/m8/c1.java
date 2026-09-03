package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c1 extends c6.a implements l8.n {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
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

    public c1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
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
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.w;
        String str2 = c1Var.h;
        String str3 = c1Var.c;
        if (this.a != c1Var.a || this.n != c1Var.n || this.r != c1Var.r || this.s != c1Var.s || this.v != c1Var.v || !this.b.equals(c1Var.b)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.e.equals(c1Var.e) || !this.f.equals(c1Var.f)) {
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
        int e = kf.k0.e((this.a + 31) * 31, 31, this.b);
        String str = this.c;
        int e6 = kf.k0.e(kf.k0.e(kf.k0.e((e + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        int hashCode = (((((((((e6 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.v) * 31;
        String str3 = this.w;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AncsNotificationParcelable{, id=");
        sb.append(this.a);
        sb.append(", appId='");
        sb.append(this.b);
        sb.append("', dateTime='");
        sb.append(this.c);
        sb.append("', eventId=");
        sb.append((int) this.n);
        sb.append(", eventFlags=");
        kf.k0.w(sb, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb.append((int) this.v);
        sb.append(", packageName='");
        sb.append(this.w);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        f5.l(parcel, 3, str);
        f5.l(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        f5.l(parcel, 8, str);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        f5.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        f5.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        f5.l(parcel, 13, this.w);
        f5.r(parcel, q10);
    }
}
