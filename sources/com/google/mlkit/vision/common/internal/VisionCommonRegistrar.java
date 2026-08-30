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
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                throw new NullPointerException(a2.j(i10, "at index "));
            }
        }
        pa paVar2 = ra.b;
        return new ta(1, objArr);
    }
}
