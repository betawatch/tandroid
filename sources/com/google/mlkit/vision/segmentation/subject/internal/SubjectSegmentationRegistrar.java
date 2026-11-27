package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(byd.class);
        b.a(qe3.b(kg7.class));
        b.f = faf.e;
        fq2 b2 = b.b();
        eq2 b3 = fq2.b(xld.class);
        b3.a(qe3.b(byd.class));
        b3.a(qe3.b(q54.class));
        b3.f = rj2.e;
        fq2 b4 = b3.b();
        ded dedVar = ted.f;
        Object[] objArr = {b2, b4};
        z4f.a(2, objArr);
        return ted.m(2, objArr);
    }
}
