// default package

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class j73 implements xj0 {
    public static final mfb d = nze.a(new m40((byte) 1));
    public final bh7 a;
    public final lh2 b;
    public final int c;

    public j73(ed edVar) {
        this.b = new lh2((Context) edVar.c);
        bh7 bh7Var = (bh7) d.get();
        bh7Var.getClass();
        this.a = bh7Var;
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
