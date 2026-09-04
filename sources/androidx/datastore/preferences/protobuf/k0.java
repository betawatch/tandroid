package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k0 {
    public static final t b = new t(1);
    public final Object a;

    public k0(j jVar) {
        z.a(jVar, "output");
        this.a = jVar;
        jVar.c = this;
    }

    public void a(int i10, g gVar) {
        ((j) this.a).G(i10, gVar);
    }

    public void b(int i10, Object obj, b1 b1Var) {
        j jVar = (j) this.a;
        jVar.R(i10, 3);
        b1Var.b((a) obj, jVar.c);
        jVar.R(i10, 4);
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
