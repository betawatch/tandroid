package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import eb.c;
import g7.pa;
import g7.ra;
import g7.ta;
import j3.r0;
import java.util.List;
import tg.b;
import y8.a;
import y8.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(c.class);
        a2.a(new j(2, 0, eb.b.class));
        a2.f = eb.a.c;
        Object[] objArr = {a2.b()};
        for (int i9 = 0; i9 < 1; i9++) {
            pa paVar = ra.b;
            if (objArr[i9] == null) {
                throw new NullPointerException(r0.l(i9, "at index "));
            }
        }
        pa paVar2 = ra.b;
        return new ta(1, objArr);
    }
}
