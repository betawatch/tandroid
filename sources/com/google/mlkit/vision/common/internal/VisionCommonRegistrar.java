package com.google.mlkit.vision.common.internal;

import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import i2.o1;
import java.util.List;
import r9.a;
import r9.j;
import w7.qa;
import w7.sa;
import w7.ua;
import xb.b;
import xb.c;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        m0 a2 = a.a(c.class);
        a2.a(new j(2, 0, b.class));
        a2.f = xb.a.c;
        Object[] objArr = {a2.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            qa qaVar = sa.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(o1.k(i10, "at index "));
            }
        }
        qa qaVar2 = sa.b;
        return new ua(1, objArr);
    }
}
