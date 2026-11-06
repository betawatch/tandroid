package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int a;
    public final String b;
    public final int c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.a = i7;
        this.b = carrierId;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && kotlin.jvm.internal.j.a(this.b, cVar.b) && this.c == cVar.c;
    }

    public final int hashCode() {
        return com.google.android.recaptcha.internal.a.h(this.a * 31, 31, this.b) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.q(dest, 1, 4);
        dest.writeInt(this.a);
        wb.l(dest, 2, this.b);
        wb.q(dest, 3, 4);
        dest.writeInt(this.c);
        wb.s(dest, r10);
    }
}
