package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k0 {
    public static final t b = new t(1);
    public final Object a;

    public k0(k kVar) {
        z.a(kVar, "output");
        this.a = kVar;
        kVar.c = this;
    }

    public void a(int i10, g gVar) {
        ((k) this.a).G(i10, gVar);
    }

    public void b(int i10, Object obj, b1 b1Var) {
        k kVar = (k) this.a;
        kVar.R(i10, 3);
        b1Var.b((a) obj, kVar.c);
        kVar.R(i10, 4);
    }

    public k0() {
        q0 q0Var;
        try {
            q0Var = (q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            q0Var = b;
        }
        q0[] q0VarArr = {t.b, q0Var};
        j0 j0Var = new j0();
        j0Var.a = q0VarArr;
        Charset charset = z.a;
        this.a = j0Var;
    }
}
