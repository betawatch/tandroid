package com.google.mlkit.vision.common.internal;

import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import i2.d;
import java.util.List;
import r9.a;
import r9.j;
import w7.qa;
import w7.sa;
import w7.ua;
import xb.b;
import xb.c;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                throw new NullPointerException(d.j(i10, "at index "));
            }
        }
        qa qaVar2 = sa.b;
        return new ua(1, objArr);
    }
}
