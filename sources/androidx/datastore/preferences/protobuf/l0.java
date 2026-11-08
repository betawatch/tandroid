package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l0 {
    public static final w b = new w(1);
    public final Object a;

    public l0(m mVar) {
        c0.a(mVar, "output");
        this.a = mVar;
        mVar.a = this;
    }

    public void a(int i7, Object obj, b1 b1Var) {
        m mVar = (m) this.a;
        mVar.B(i7, 3);
        b1Var.c((a) obj, mVar.a);
        mVar.B(i7, 4);
    }

    public l0() {
        r0 r0Var;
        y0 y0Var = y0.c;
        try {
            r0Var = (r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r0Var = b;
        }
        r0[] r0VarArr = {w.b, r0Var};
        k0 k0Var = new k0();
        k0Var.a = r0VarArr;
        Charset charset = c0.a;
        this.a = k0Var;
    }
}
