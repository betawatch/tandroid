package com.google.mlkit.vision.label.defaults.thin;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(ayd.class);
        b.a(qe3.b(kg7.class));
        b.f = z3f.r;
        fq2 b2 = b.b();
        eq2 b3 = fq2.b(asd.class);
        b3.a(qe3.b(ayd.class));
        b3.a(qe3.b(q54.class));
        b3.f = faf.s;
        fq2 b4 = b3.b();
        eq2 b5 = fq2.b(ri7.class);
        b5.e = true;
        b5.a(new qe3(1, 1, asd.class));
        b5.f = uif.s;
        fq2 b6 = b5.b();
        vgd vgdVar = ghd.f;
        Object[] objArr = {b2, b4, b6};
        i5f.a(3, objArr);
        return new yjd(3, objArr);
    }
}
