package com.google.mlkit.vision.segmentation.subject.internal;

import a8.j;
import a8.l;
import a8.l0;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import dc.b;
import dc.c;
import java.util.List;
import s9.a;
import s9.k;
import sb.d;
import sb.g;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(c.class);
        a2.a(k.a(g.class));
        a2.f = dc.a.b;
        a b10 = a2.b();
        n0 a10 = a.a(b.class);
        a10.a(k.a(c.class));
        a10.a(k.a(d.class));
        a10.f = dc.a.c;
        a b11 = a10.b();
        j jVar = l.b;
        Object[] objArr = {b10, b11};
        l0.a(2, objArr);
        return l.q(2, objArr);
    }
}
