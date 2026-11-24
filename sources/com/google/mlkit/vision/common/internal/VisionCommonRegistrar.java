package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        lp2 b = mp2.b(ig7.class);
        b.a(new wd3(2, 0, hg7.class));
        b.f = eef.e;
        Object[] objArr = {b.b()};
        for (int i = 0; i < 1; i++) {
            t2f t2fVar = f7f.f;
            if (objArr[i] == null) {
                fvc.f(de9.k(i, "at index "));
                return null;
            }
        }
        t2f t2fVar2 = f7f.f;
        return new kff(1, objArr);
    }
}
