package com.google.mlkit.vision.common.internal;

import a9.a;
import a9.b;
import a9.m;
import com.google.firebase.components.ComponentRegistrar;
import gb.c;
import i7.pa;
import i7.ra;
import i7.ta;
import j7.l1;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(c.class);
        b10.a(new m(2, 0, gb.b.class));
        b10.g = gb.a.c;
        Object[] objArr = {b10.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            pa paVar = ra.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(l1.k(i10, "at index "));
            }
        }
        pa paVar2 = ra.b;
        return new ta(1, objArr);
    }
}
