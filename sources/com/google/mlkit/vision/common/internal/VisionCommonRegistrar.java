package com.google.mlkit.vision.common.internal;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import hg.k0;
import java.util.List;
import q9.a;
import q9.j;
import w7.qa;
import w7.sa;
import w7.ua;
import wb.b;
import wb.c;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i0 a2 = a.a(c.class);
        a2.a(new j(2, 0, b.class));
        a2.f = wb.a.c;
        Object[] objArr = {a2.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            qa qaVar = sa.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(k0.h(i10, "at index "));
            }
        }
        qa qaVar2 = sa.b;
        return new ua(1, objArr);
    }
}
