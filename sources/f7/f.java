package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
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
    public final r0 w;
    public final p0 x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
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
        this.w = r0Var;
        this.x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return q6.m.k(this.a, fVar.a) && q6.m.k(this.b, fVar.b) && q6.m.k(this.c, fVar.c) && q6.m.k(this.d, fVar.d) && q6.m.k(this.e, fVar.e) && q6.m.k(this.f, fVar.f) && q6.m.k(this.h, fVar.h) && q6.m.k(this.n, fVar.n) && q6.m.k(this.r, fVar.r) && q6.m.k(this.s, fVar.s) && q6.m.k(this.w, fVar.w) && q6.m.k(this.x, fVar.x);
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
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a8.p0.s(n10, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.k(parcel, 3, this.b, i7);
        xb.k(parcel, 4, this.c, i7);
        xb.k(parcel, 5, this.d, i7);
        xb.k(parcel, 6, this.e, i7);
        xb.k(parcel, 7, this.f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.n, i7);
        xb.k(parcel, 10, this.r, i7);
        xb.k(parcel, 11, this.s, i7);
        xb.k(parcel, 12, this.w, i7);
        xb.k(parcel, 13, this.x, i7);
        xb.s(parcel, r10);
    }
}
