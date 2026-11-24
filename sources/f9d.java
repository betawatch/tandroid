// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f9d extends b4 {
    public static final Parcelable.Creator<f9d> CREATOR = new v6d((byte) 19);
    public final rce a;
    public final rce b;
    public final rce c;
    public final int d;

    public f9d(rce rceVar, rce rceVar2, rce rceVar3, int i) {
        this.a = rceVar;
        this.b = rceVar2;
        this.c = rceVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f9d)) {
            return false;
        }
        f9d f9dVar = (f9d) obj;
        return fse.a(this.a, f9dVar.a) && fse.a(this.b, f9dVar.b) && fse.a(this.c, f9dVar.c) && this.d == f9dVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        rce rceVar = this.a;
        String b = xpd.b(rceVar == null ? null : rceVar.p());
        rce rceVar2 = this.b;
        String b2 = xpd.b(rceVar2 == null ? null : rceVar2.p());
        rce rceVar3 = this.c;
        String b3 = xpd.b(rceVar3 != null ? rceVar3.p() : null);
        StringBuilder m = mlb.m("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        m.append(b3);
        m.append(", getPinUvAuthProtocol=");
        return hg9.k(m, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        rce rceVar = this.a;
        mve.c(parcel, 1, rceVar == null ? null : rceVar.p());
        rce rceVar2 = this.b;
        mve.c(parcel, 2, rceVar2 == null ? null : rceVar2.p());
        rce rceVar3 = this.c;
        mve.c(parcel, 3, rceVar3 != null ? rceVar3.p() : null);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
