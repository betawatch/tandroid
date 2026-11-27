package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(sg7.class);
        b.a(qe3.b(kg7.class));
        b.f = new s9d((byte) 0);
        fq2 b2 = b.b();
        eq2 b3 = fq2.b(mg7.class);
        b3.f = new egd((byte) 0);
        fq2 b4 = b3.b();
        eq2 b5 = fq2.b(y99.class);
        b5.a(new qe3(2, 0, x99.class));
        b5.f = new s9d((byte) 1);
        fq2 b6 = b5.b();
        eq2 b7 = fq2.b(q54.class);
        b7.a(new qe3(1, 1, mg7.class));
        b7.f = new kdd();
        fq2 b8 = b7.b();
        eq2 b9 = fq2.b(pi2.class);
        b9.f = new egd((byte) 1);
        fq2 b10 = b9.b();
        eq2 b11 = fq2.b(rj2.class);
        b11.a(qe3.b(pi2.class));
        b11.f = new ahd();
        fq2 b12 = b11.b();
        eq2 b13 = fq2.b(sae.class);
        b13.a(qe3.b(kg7.class));
        b13.f = new yad((byte) 2);
        fq2 b14 = b13.b();
        eq2 b15 = fq2.b(x99.class);
        b15.e = true;
        b15.a(new qe3(1, 1, sae.class));
        b15.f = new i9d();
        fq2 b16 = b15.b();
        uad uadVar = kbd.n;
        Object[] objArr = {lja.b, b2, b4, b6, b8, b10, b12, b14, b16};
        x3f.a(9, objArr);
        return new ucd(9, objArr);
    }
}
