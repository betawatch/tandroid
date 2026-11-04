package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b1 extends q6.a {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
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
    public final byte w;
    public final String x;

    public b1(int i3, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.a = i3;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = b10;
        this.r = b11;
        this.s = b12;
        this.w = b13;
        this.x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.x;
        String str2 = b1Var.h;
        String str3 = b1Var.c;
        if (this.a != b1Var.a || this.n != b1Var.n || this.r != b1Var.r || this.s != b1Var.s || this.w != b1Var.w || !this.b.equals(b1Var.b)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.e.equals(b1Var.e) || !this.f.equals(b1Var.f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.x;
        return str6 != null ? str6.equals(str) : str == null;
    }

    public final int hashCode() {
        int g7 = com.google.android.recaptcha.internal.a.g((this.a + 31) * 31, 31, this.b);
        String str = this.c;
        int g10 = com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g((g7 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        int hashCode = (((((((((g10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.w) * 31;
        String str3 = this.x;
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
        com.google.android.recaptcha.internal.a.r(sb2, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb2.append((int) this.w);
        sb2.append(", packageName='");
        sb2.append(this.x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        j8.a.m(parcel, 3, str);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.e);
        j8.a.m(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        j8.a.m(parcel, 8, str);
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.n);
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(this.r);
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(this.s);
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(this.w);
        j8.a.m(parcel, 13, this.x);
        j8.a.t(parcel, s6);
    }
}
