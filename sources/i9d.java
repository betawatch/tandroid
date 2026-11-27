// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
