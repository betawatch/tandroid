package com.google.mlkit.vision.common.internal;

import c9.a;
import c9.b;
import c9.l;
import com.google.firebase.components.ComponentRegistrar;
import ib.c;
import java.util.List;
import k7.pa;
import k7.ra;
import k7.ta;
import l.d;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(c.class);
        b10.a(new l(2, 0, ib.b.class));
        b10.g = ib.a.c;
        Object[] objArr = {b10.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            pa paVar = ra.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(d.j(i10, "at index "));
            }
        }
        pa paVar2 = ra.b;
        return new ta(1, objArr);
    }
}
