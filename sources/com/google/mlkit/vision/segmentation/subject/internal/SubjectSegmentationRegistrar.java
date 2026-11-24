package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        lp2 b = mp2.b(ltd.class);
        b.a(wd3.b(ae7.class));
        b.f = o5f.e;
        mp2 b2 = b.b();
        lp2 b3 = mp2.b(ghd.class);
        b3.a(wd3.b(ltd.class));
        b3.a(wd3.b(u44.class));
        b3.f = vi2.e;
        mp2 b4 = b3.b();
        k9d k9dVar = aad.f;
        Object[] objArr = {b2, b4};
        h0f.a(2, objArr);
        return aad.m(2, objArr);
    }
}
