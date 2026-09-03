package com.google.mlkit.vision.common.internal;

import c9.a;
import c9.b;
import c9.m;
import com.google.firebase.components.ComponentRegistrar;
import ib.c;
import java.util.List;
import k7.pa;
import k7.ra;
import k7.ta;
import kf.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(c.class);
        b10.a(new m(2, 0, ib.b.class));
        b10.g = ib.a.c;
        Object[] objArr = {b10.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            pa paVar = ra.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(k0.j(i10, "at index "));
            }
        }
        pa paVar2 = ra.b;
        return new ta(1, objArr);
    }
}
