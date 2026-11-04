package l6;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(15);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.a);
        j8.a.m(parcel, 2, this.b);
        j8.a.m(parcel, 3, this.c);
        j8.a.m(parcel, 4, this.d);
        j8.a.m(parcel, 5, this.e);
        int i10 = this.f;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 7, this.h);
        j8.a.t(parcel, s6);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i3, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i3;
        this.h = str6;
    }
}
