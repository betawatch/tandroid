package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import u9.a;
import u9.i;
import vb.b;
import vb.c;
import z7.ra;
import z7.ta;
import z7.va;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(c.class);
        a10.a(new i(2, 0, b.class));
        a10.f = vb.a.c;
        Object[] objArr = {a10.b()};
        for (int i7 = 0; i7 < 1; i7++) {
            ra raVar = ta.b;
            if (objArr[i7] == null) {
                throw new NullPointerException(i5.c.i(i7, "at index "));
            }
        }
        ra raVar2 = ta.b;
        return new va(1, objArr);
    }
}
