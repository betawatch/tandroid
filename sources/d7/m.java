package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Locale;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(14);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public m(f fVar, long j10, int i10, String str, e eVar, boolean z4, int i11, int i12, String str2) {
        this.a = fVar;
        this.b = j10;
        this.c = i10;
        this.d = str;
        this.e = eVar;
        this.f = z4;
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
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.a, i10);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        f5.l(parcel, 4, this.d);
        f5.k(parcel, 5, this.e, i10);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        f5.l(parcel, 9, this.r);
        f5.r(parcel, q10);
    }
}
