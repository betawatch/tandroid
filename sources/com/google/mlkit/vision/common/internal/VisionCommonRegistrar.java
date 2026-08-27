package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import fb.c;
import h7.pa;
import h7.ra;
import h7.ta;
import java.util.List;
import ug.b;
import z8.a;
import z8.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(c.class);
        a2.a(new i(2, 0, fb.b.class));
        a2.f = fb.a.c;
        Object[] objArr = {a2.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            pa paVar = ra.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.k(i10, "at index "));
            }
        }
        pa paVar2 = ra.b;
        return new ta(1, objArr);
    }
}
