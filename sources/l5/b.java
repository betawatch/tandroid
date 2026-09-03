package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import l4.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(4);
    public final boolean a;
    public final String b;

    public b(String str, boolean z4) {
        if (z4) {
            m.h(str);
        }
        this.a = z4;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        g5.l(parcel, 2, this.b);
        g5.r(parcel, q10);
    }
}
