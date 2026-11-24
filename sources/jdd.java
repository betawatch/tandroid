// default package

import android.content.Context;

/* loaded from: classes.dex */
public final class jdd implements pcd, bs3, aq2, zef {
    @Override // aq2
    public final Object L(gl2 gl2Var) {
        return new k69(gl2Var.d(c6e.class));
    }

    @Override // bs3
    public final int a(Context context, String str, boolean z) {
        return ds3.d(context, str, z);
    }

    @Override // bs3
    public final int b(Context context, String str) {
        return ds3.a(context, str);
    }

    @Override // pcd
    public final byte[] c(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
