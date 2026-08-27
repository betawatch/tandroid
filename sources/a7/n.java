package a7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new w.a(9);
    public final g a;
    public final long b;
    public final int c;
    public final String d;
    public final f e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public n(g gVar, long j10, int i10, String str, f fVar, boolean z10, int i11, int i12, String str2) {
        this.a = gVar;
        this.b = j10;
        this.c = i10;
        this.d = str;
        this.e = fVar;
        this.f = z10;
        this.h = i11;
        this.n = i12;
        this.r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.a + ", timestamp=" + this.b + ", usageType=" + this.c + ", status=" + this.n + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.a, i10);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.e, i10);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        r8.l(parcel, 9, this.r);
        r8.r(parcel, q6);
    }
}
