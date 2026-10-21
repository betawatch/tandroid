package g2;

import android.content.Context;
import android.net.Uri;
import b2.r0;
import v7.w6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z a;
    public final qf.b b;
    public final int c;
    public final boolean d;

    public i(c5.f fVar) {
        this.b = new qf.b((Context) fVar.c, 18);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = fVar.a;
        this.d = fVar.b;
    }

    @Override // e2.d
    public final j9.y g(r0 r0Var) {
        byte[] bArr = r0Var.k;
        if (bArr != null) {
            return u(bArr);
        }
        Uri uri = r0Var.n;
        if (uri == null) {
            return null;
        }
        return ((j9.a0) this.a).a(new com.google.firebase.messaging.h(2, this, uri));
    }

    @Override // e2.d
    public final j9.y u(byte[] bArr) {
        return ((j9.a0) this.a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
