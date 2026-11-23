package m6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(1);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.a);
        bc.l(parcel, 2, this.b);
        bc.l(parcel, 3, this.c);
        bc.l(parcel, 4, this.d);
        bc.l(parcel, 5, this.e);
        int i10 = this.f;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 7, this.h);
        bc.s(parcel, r10);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i7, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i7;
        this.h = str6;
    }
}
