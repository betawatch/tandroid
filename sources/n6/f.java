package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new o0(22);
    public final s a;
    public final y0 b;
    public final i0 c;
    public final a1 d;
    public final m0 e;
    public final n0 f;
    public final z0 h;
    public final p0 n;
    public final t r;
    public final r0 s;
    public final s0 v;
    public final q0 w;

    public f(s sVar, y0 y0Var, i0 i0Var, a1 a1Var, m0 m0Var, n0 n0Var, z0 z0Var, p0 p0Var, t tVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        this.a = sVar;
        this.c = i0Var;
        this.b = y0Var;
        this.d = a1Var;
        this.e = m0Var;
        this.f = n0Var;
        this.h = z0Var;
        this.n = p0Var;
        this.r = tVar;
        this.s = r0Var;
        this.v = s0Var;
        this.w = q0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return y5.l.l(this.a, fVar.a) && y5.l.l(this.b, fVar.b) && y5.l.l(this.c, fVar.c) && y5.l.l(this.d, fVar.d) && y5.l.l(this.e, fVar.e) && y5.l.l(this.f, fVar.f) && y5.l.l(this.h, fVar.h) && y5.l.l(this.n, fVar.n) && y5.l.l(this.r, fVar.r) && y5.l.l(this.s, fVar.s) && y5.l.l(this.v, fVar.v) && y5.l.l(this.w, fVar.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, this.w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.n);
        String valueOf9 = String.valueOf(this.r);
        String valueOf10 = String.valueOf(this.s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder p6 = i0.a.p("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        i0.a.z(p6, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        i0.a.z(p6, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        i0.a.z(p6, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        i0.a.z(p6, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a9.p.p(p6, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.k(parcel, 3, this.b, i10);
        r8.k(parcel, 4, this.c, i10);
        r8.k(parcel, 5, this.d, i10);
        r8.k(parcel, 6, this.e, i10);
        r8.k(parcel, 7, this.f, i10);
        r8.k(parcel, 8, this.h, i10);
        r8.k(parcel, 9, this.n, i10);
        r8.k(parcel, 10, this.r, i10);
        r8.k(parcel, 11, this.s, i10);
        r8.k(parcel, 12, this.v, i10);
        r8.k(parcel, 13, this.w, i10);
        r8.r(parcel, q6);
    }
}
