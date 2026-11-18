package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.a);
        bc.l(dest, 2, this.b);
        bc.q(dest, 3, 4);
        dest.writeInt(this.c);
        bc.s(dest, r10);
    }
}
