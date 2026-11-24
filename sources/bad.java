// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bad extends b4 {
    public static final Parcelable.Creator<bad> CREATOR = new j9d(6);
    public final m9d a;
    public final m9d b;

    public bad(m9d m9dVar, m9d m9dVar2) {
        this.a = m9dVar;
        this.b = m9dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bad)) {
            return false;
        }
        bad badVar = (bad) obj;
        return id1.d(this.a, badVar.a) && id1.d(this.b, badVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.k(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
