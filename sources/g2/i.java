package g2;

import android.content.Context;
import android.net.Uri;
import b2.r0;
import v7.w6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
            return v(bArr);
        }
        Uri uri = r0Var.n;
        if (uri == null) {
            return null;
        }
        return ((j9.a0) this.a).a(new com.google.firebase.messaging.h(2, this, uri));
    }

    @Override // e2.d
    public final j9.y v(byte[] bArr) {
        return ((j9.a0) this.a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
