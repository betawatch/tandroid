package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 {
    public static final u b = new u(1);
    public final Object a;

    public l0(k kVar) {
        a0.a(kVar, "output");
        this.a = kVar;
        kVar.c = this;
    }

    public void a(int i9, g gVar) {
        ((k) this.a).G(i9, gVar);
    }

    public void b(int i9, Object obj, c1 c1Var) {
        k kVar = (k) this.a;
        kVar.R(i9, 3);
        c1Var.b((a) obj, kVar.c);
        kVar.R(i9, 4);
    }

    public l0() {
        r0 r0Var;
        try {
            r0Var = (r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r0Var = b;
        }
        r0[] r0VarArr = {u.b, r0Var};
        k0 k0Var = new k0();
        k0Var.a = r0VarArr;
        Charset charset = a0.a;
        this.a = k0Var;
    }
}
