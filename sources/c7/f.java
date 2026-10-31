package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s a;
    public final x0 b;
    public final i0 c;
    public final z0 d;
    public final m0 e;
    public final n0 f;
    public final y0 h;
    public final o0 n;
    public final t r;
    public final q0 s;
    public final s0 w;
    public final p0 x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.a = sVar;
        this.c = i0Var;
        this.b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f = n0Var;
        this.h = y0Var;
        this.n = o0Var;
        this.r = tVar;
        this.s = q0Var;
        this.w = s0Var;
        this.x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n6.l.k(this.a, fVar.a) && n6.l.k(this.b, fVar.b) && n6.l.k(this.c, fVar.c) && n6.l.k(this.d, fVar.d) && n6.l.k(this.e, fVar.e) && n6.l.k(this.f, fVar.f) && n6.l.k(this.h, fVar.h) && n6.l.k(this.n, fVar.n) && n6.l.k(this.r, fVar.r) && n6.l.k(this.s, fVar.s) && n6.l.k(this.w, fVar.w) && n6.l.k(this.x, fVar.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
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
        String valueOf11 = String.valueOf(this.w);
        StringBuilder v = a1.g.v("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        c3.i0.r(v, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        c3.i0.r(v, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        c3.i0.r(v, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        c3.i0.r(v, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.r(v, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 2, this.a, i10);
        w7.h0.k(parcel, 3, this.b, i10);
        w7.h0.k(parcel, 4, this.c, i10);
        w7.h0.k(parcel, 5, this.d, i10);
        w7.h0.k(parcel, 6, this.e, i10);
        w7.h0.k(parcel, 7, this.f, i10);
        w7.h0.k(parcel, 8, this.h, i10);
        w7.h0.k(parcel, 9, this.n, i10);
        w7.h0.k(parcel, 10, this.r, i10);
        w7.h0.k(parcel, 11, this.s, i10);
        w7.h0.k(parcel, 12, this.w, i10);
        w7.h0.k(parcel, 13, this.x, i10);
        w7.h0.r(parcel, q6);
    }
}
