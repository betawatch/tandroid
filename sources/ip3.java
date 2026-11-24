// default package

import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ip3 implements yzb {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // yzb
    public final void b(yw7 yw7Var, int i, int i2) {
        yw7Var.O(i);
    }

    @Override // yzb
    public final int c(s73 s73Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = s73Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yzb
    public final /* synthetic */ void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override // yzb
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override // yzb
    public final void d(long j) {
    }

    @Override // yzb
    public final void g(go4 go4Var) {
    }

    @Override // yzb
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
    }
}
