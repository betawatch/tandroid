package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c1 extends z5.a implements i8.n {
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
        int g10 = i0.a.g((this.a + 31) * 31, 31, this.b);
        String str = this.c;
        int g11 = i0.a.g(i0.a.g(i0.a.g((g10 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        int hashCode = (((((((((g11 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.v) * 31;
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
        i0.a.x(sb2, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        r8.l(parcel, 3, str);
        r8.l(parcel, 4, this.c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.e);
        r8.l(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        r8.l(parcel, 8, str);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        r8.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        r8.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        r8.l(parcel, 13, this.w);
        r8.r(parcel, q6);
    }
}
