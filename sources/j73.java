// default package

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class j73 implements xj0 {
    public static final mfb d = nze.a(new m40((byte) 1));
    public final ah7 a;
    public final lh2 b;
    public final int c;

    public j73(ed edVar) {
        this.b = new lh2((Context) edVar.c);
        ah7 ah7Var = (ah7) d.get();
        ah7Var.getClass();
        this.a = ah7Var;
        this.c = edVar.b;
    }

    @Override // xj0
    public final x76 X(nt6 nt6Var) {
        byte[] bArr = nt6Var.k;
        if (bArr != null) {
            return b0(bArr);
        }
        Uri uri = nt6Var.n;
        if (uri == null) {
            return null;
        }
        return this.a.a(new i73(this, uri, (byte) 1));
    }

    @Override // xj0
    public final x76 b0(byte[] bArr) {
        return this.a.a(new i73(this, bArr, (byte) 0));
    }
}
