package com.google.mlkit.vision.segmentation.subject.internal;

import a8.l;
import a8.l0;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import dc.b;
import dc.c;
import java.util.List;
import s9.a;
import s9.j;
import sb.d;
import sb.g;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(c.class);
        a2.a(j.a(g.class));
        a2.f = dc.a.b;
        a b10 = a2.b();
        n0 a10 = a.a(b.class);
        a10.a(j.a(c.class));
        a10.a(j.a(d.class));
        a10.f = dc.a.c;
        a b11 = a10.b();
        a8.j jVar = l.b;
        Object[] objArr = {b10, b11};
        l0.a(2, objArr);
        return l.q(2, objArr);
    }
}
