package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(23);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public m(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.a = fVar;
        this.b = j10;
        this.c = i10;
        this.d = str;
        this.e = eVar;
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
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.a, i10);
        o.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        o.l(parcel, 4, this.d);
        o.k(parcel, 5, this.e, i10);
        o.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        o.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        o.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        o.l(parcel, 9, this.r);
        o.r(parcel, q6);
    }
}
