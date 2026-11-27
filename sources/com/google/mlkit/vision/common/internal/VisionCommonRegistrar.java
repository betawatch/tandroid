package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(ri7.class);
        b.a(new qe3(2, 0, qi7.class));
        b.f = uif.e;
        Object[] objArr = {b.b()};
        for (int i = 0; i < 1; i++) {
            k7f k7fVar = wbf.f;
            if (objArr[i] == null) {
                p3d.h(uh9.k(i, "at index "));
                return null;
            }
        }
        k7f k7fVar2 = wbf.f;
        return new akf(1, objArr);
    }
}
