package g2;

import a8.ac;
import android.content.Context;
import android.net.Uri;
import b2.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i implements e2.d {
    public static final e9.t e = ac.a(new a3.s(2));
    public final k9.z a;
    public final rf.b b;
    public final int c;
    public final boolean d;

    public i(d5.f fVar) {
        this.b = new rf.b((Context) fVar.c, 19);
        k9.z zVar = (k9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = fVar.a;
        this.d = fVar.b;
    }

    @Override // e2.d
    public final k9.y H(byte[] bArr) {
        return ((k9.a0) this.a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }

    @Override // e2.d
    public final k9.y t(s0 s0Var) {
        byte[] bArr = s0Var.k;
        if (bArr != null) {
            return H(bArr);
        }
        Uri uri = s0Var.n;
        if (uri == null) {
            return null;
        }
        return ((k9.a0) this.a).a(new com.google.firebase.messaging.h(2, this, uri));
    }
}
