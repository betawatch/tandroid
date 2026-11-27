// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i9d implements ihd, ts3, tq2, pjf {
    @Override // ts3
    public final int a(Context context, String str, boolean z) {
        return vs3.d(context, str, z);
    }

    @Override // ts3
    public final int b(Context context, String str) {
        return vs3.a(context, str);
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        return new x99(am2Var.d(sae.class));
    }

    @Override // ihd
    public final byte[] c(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
