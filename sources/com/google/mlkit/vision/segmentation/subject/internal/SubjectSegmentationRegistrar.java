package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        wq2 b = xq2.b(ovd.class);
        b.a(if3.b(cg7.class));
        b.f = q7f.e;
        xq2 b2 = b.b();
        wq2 b3 = xq2.b(hjd.class);
        b3.a(if3.b(ovd.class));
        b3.a(if3.b(f64.class));
        b3.f = jk2.e;
        xq2 b4 = b3.b();
        mbd mbdVar = ccd.f;
        Object[] objArr = {b2, b4};
        j2f.a(2, objArr);
        return ccd.m(2, objArr);
    }
}
