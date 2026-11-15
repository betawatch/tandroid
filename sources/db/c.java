package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        return e2.h(this.a * 31, 31, this.b) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.q(dest, 1, 4);
        dest.writeInt(this.a);
        yb.l(dest, 2, this.b);
        yb.q(dest, 3, 4);
        dest.writeInt(this.c);
        yb.s(dest, r10);
    }
}
