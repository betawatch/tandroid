package com.google.mlkit.vision.common.internal;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import s9.a;
import s9.j;
import x7.ra;
import x7.ta;
import x7.va;
import yb.b;
import yb.c;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(c.class);
        a2.a(new j(2, 0, b.class));
        a2.f = yb.a.c;
        Object[] objArr = {a2.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            ra raVar = ta.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(ic.a.i(i10, "at index "));
            }
        }
        ra raVar2 = ta.b;
        return new va(1, objArr);
    }
}
