package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new n0(23);
    public final s a;
    public final y0 b;
    public final i0 c;
    public final a1 d;
    public final m0 e;
    public final o0 f;
    public final z0 h;
    public final p0 n;
    public final t r;
    public final r0 s;
    public final s0 v;
    public final q0 w;

    public f(s sVar, y0 y0Var, i0 i0Var, a1 a1Var, m0 m0Var, o0 o0Var, z0 z0Var, p0 p0Var, t tVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        this.a = sVar;
        this.c = i0Var;
        this.b = y0Var;
        this.d = a1Var;
        this.e = m0Var;
        this.f = o0Var;
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
        return z5.l.l(this.a, fVar.a) && z5.l.l(this.b, fVar.b) && z5.l.l(this.c, fVar.c) && z5.l.l(this.d, fVar.d) && z5.l.l(this.e, fVar.e) && z5.l.l(this.f, fVar.f) && z5.l.l(this.h, fVar.h) && z5.l.l(this.n, fVar.n) && z5.l.l(this.r, fVar.r) && z5.l.l(this.s, fVar.s) && z5.l.l(this.v, fVar.v) && z5.l.l(this.w, fVar.w);
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
        StringBuilder k9 = th.k("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        th.w(k9, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        th.w(k9, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        th.w(k9, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        th.w(k9, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a4.w.q(k9, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.b, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.c, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 6, this.e, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 8, this.h, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 9, this.n, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 10, this.r, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 11, this.s, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 12, this.v, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 13, this.w, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
