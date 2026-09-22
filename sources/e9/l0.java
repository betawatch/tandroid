package e9;

import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class l0 extends com.google.android.gms.common.api.internal.w {
    @Override // com.google.android.gms.common.api.internal.w
    public final com.google.android.gms.common.api.internal.w c(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public final m0 i() {
        int i10 = this.a;
        if (i10 == 0) {
            int i11 = m0.c;
            return g1.s;
        }
        if (i10 != 1) {
            m0 u10 = m0.u(i10, this.c);
            this.a = u10.size();
            this.b = true;
            return u10;
        }
        Object obj = this.c[0];
        Objects.requireNonNull(obj);
        int i12 = m0.c;
        return new m1(obj);
    }
}
