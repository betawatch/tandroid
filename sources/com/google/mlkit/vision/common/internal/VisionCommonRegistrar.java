package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import jg.g;
import u9.a;
import u9.i;
import vb.b;
import vb.c;
import z7.ra;
import z7.ta;
import z7.va;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                throw new NullPointerException(g.j(i7, "at index "));
            }
        }
        ra raVar2 = ta.b;
        return new va(1, objArr);
    }
}
