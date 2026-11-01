package com.google.mlkit.vision.segmentation.subject.internal;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import jb.d;
import jb.g;
import r9.a;
import r9.j;
import ub.b;
import ub.c;
import w7.q9;
import z7.i;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(c.class);
        a2.a(j.a(g.class));
        a2.f = ub.a.b;
        a b10 = a2.b();
        n0 a10 = a.a(b.class);
        a10.a(j.a(c.class));
        a10.a(j.a(d.class));
        a10.f = ub.a.c;
        a b11 = a10.b();
        z7.g gVar = i.b;
        Object[] objArr = {b10, b11};
        q9.a(2, objArr);
        return i.q(2, objArr);
    }
}
