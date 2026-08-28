package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new c.c(12);
    public final String b;
    public final String c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (f0.a(this.c, kVar.c) && f0.a(this.b, kVar.b) && f0.a(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // e4.j
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i9 = f0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
