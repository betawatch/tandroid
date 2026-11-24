package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        wq2 b = xq2.b(li7.class);
        b.a(new if3(2, 0, ki7.class));
        b.f = fgf.e;
        Object[] objArr = {b.b()};
        for (int i = 0; i < 1; i++) {
            v4f v4fVar = h9f.f;
            if (objArr[i] == null) {
                gxc.d(hg9.j(i, "at index "));
                return null;
            }
        }
        v4f v4fVar2 = h9f.f;
        return new lhf(1, objArr);
    }
}
