package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(15);
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
        return p6.m.k(this.a, fVar.a) && p6.m.k(this.b, fVar.b) && p6.m.k(this.c, fVar.c) && p6.m.k(this.d, fVar.d) && p6.m.k(this.e, fVar.e) && p6.m.k(this.f, fVar.f) && p6.m.k(this.h, fVar.h) && p6.m.k(this.n, fVar.n) && p6.m.k(this.r, fVar.r) && p6.m.k(this.s, fVar.s) && p6.m.k(this.w, fVar.w) && p6.m.k(this.x, fVar.x);
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
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.s(n4, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.a, i3);
        j8.a.l(parcel, 3, this.b, i3);
        j8.a.l(parcel, 4, this.c, i3);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.l(parcel, 6, this.e, i3);
        j8.a.l(parcel, 7, this.f, i3);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.l(parcel, 9, this.n, i3);
        j8.a.l(parcel, 10, this.r, i3);
        j8.a.l(parcel, 11, this.s, i3);
        j8.a.l(parcel, 12, this.w, i3);
        j8.a.l(parcel, 13, this.x, i3);
        j8.a.t(parcel, s6);
    }
}
