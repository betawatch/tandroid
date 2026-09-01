package com.google.mlkit.vision.segmentation.subject.internal;

import c9.a;
import c9.b;
import c9.l;
import cb.d;
import cb.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import k7.c0;
import n7.g;
import n7.i;
import nb.c;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(c.class);
        b10.a(l.b(h.class));
        b10.g = nb.a.b;
        b b11 = b10.b();
        a b12 = b.b(nb.b.class);
        b12.a(l.b(c.class));
        b12.a(l.b(d.class));
        b12.g = nb.a.c;
        b b13 = b12.b();
        g gVar = i.b;
        Object[] objArr = {b11, b13};
        c0.a(2, objArr);
        return i.r(2, objArr);
    }
}
