package com.google.mlkit.vision.common.internal;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import pb.b;
import pb.c;
import r9.a;
import r9.j;
import w7.oa;
import w7.qa;
import w7.sa;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(c.class);
        a2.a(new j(2, 0, b.class));
        a2.f = pb.a.c;
        Object[] objArr = {a2.b()};
        for (int i10 = 0; i10 < 1; i10++) {
            oa oaVar = qa.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.i(i10, "at index "));
            }
        }
        oa oaVar2 = qa.b;
        return new sa(1, objArr);
    }
}
