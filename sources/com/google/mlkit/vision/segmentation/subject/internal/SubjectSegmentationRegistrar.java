package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(byd.class);
        b.a(qe3.b(jg7.class));
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
