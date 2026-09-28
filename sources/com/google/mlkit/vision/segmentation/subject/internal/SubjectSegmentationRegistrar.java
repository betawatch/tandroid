package com.google.mlkit.vision.segmentation.subject.internal;

import b2.i0;
import bc.b;
import bc.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import q9.a;
import q9.j;
import qb.d;
import qb.g;
import w7.h9;
import z7.i;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i0 a2 = a.a(c.class);
        a2.a(j.a(g.class));
        a2.f = bc.a.b;
        a b10 = a2.b();
        i0 a10 = a.a(b.class);
        a10.a(j.a(c.class));
        a10.a(j.a(d.class));
        a10.f = bc.a.c;
        a b11 = a10.b();
        z7.g gVar = i.b;
        Object[] objArr = {b10, b11};
        h9.a(2, objArr);
        return i.r(2, objArr);
    }
}
