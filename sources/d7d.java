// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d7d extends b4 {
    public static final Parcelable.Creator<d7d> CREATOR = new t4d((byte) 19);
    public final qae a;
    public final qae b;
    public final qae c;
    public final int d;

    public d7d(qae qaeVar, qae qaeVar2, qae qaeVar3, int i) {
        this.a = qaeVar;
        this.b = qaeVar2;
        this.c = qaeVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d7d)) {
            return false;
        }
        d7d d7dVar = (d7d) obj;
        return cqe.a(this.a, d7dVar.a) && cqe.a(this.b, d7dVar.b) && cqe.a(this.c, d7dVar.c) && this.d == d7dVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        qae qaeVar = this.a;
        String b = und.b(qaeVar == null ? null : qaeVar.p());
        qae qaeVar2 = this.b;
        String b2 = und.b(qaeVar2 == null ? null : qaeVar2.p());
        qae qaeVar3 = this.c;
        String b3 = und.b(qaeVar3 != null ? qaeVar3.p() : null);
        StringBuilder l = yjb.l("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        l.append(b3);
        l.append(", getPinUvAuthProtocol=");
        return de9.l(l, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        qae qaeVar = this.a;
        jte.c(parcel, 1, qaeVar == null ? null : qaeVar.p());
        qae qaeVar2 = this.b;
        jte.c(parcel, 2, qaeVar2 == null ? null : qaeVar2.p());
        qae qaeVar3 = this.c;
        jte.c(parcel, 3, qaeVar3 != null ? qaeVar3.p() : null);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
