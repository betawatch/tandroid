package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.List;
import k2.p1;
import sb.b;
import sb.c;
import t9.a;
import t9.j;
import y7.ra;
import y7.ta;
import y7.va;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        l0 a10 = a.a(c.class);
        a10.a(new j(2, 0, b.class));
        a10.f = sb.a.c;
        Object[] objArr = {a10.b()};
        for (int i3 = 0; i3 < 1; i3++) {
            ra raVar = ta.b;
            if (objArr[i3] == null) {
                throw new NullPointerException(p1.i(i3, "at index "));
            }
        }
        ra raVar2 = ta.b;
        return new va(1, objArr);
    }
}
