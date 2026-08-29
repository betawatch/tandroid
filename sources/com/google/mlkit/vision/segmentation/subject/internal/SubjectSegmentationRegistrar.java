package com.google.mlkit.vision.segmentation.subject.internal;

import a9.a;
import a9.b;
import a9.m;
import ab.d;
import ab.h;
import com.google.firebase.components.ComponentRegistrar;
import i7.o;
import java.util.List;
import l7.g;
import l7.i;
import lb.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(c.class);
        b10.a(m.b(h.class));
        b10.g = lb.a.b;
        b b11 = b10.b();
        a b12 = b.b(lb.b.class);
        b12.a(m.b(c.class));
        b12.a(m.b(d.class));
        b12.g = lb.a.c;
        b b13 = b12.b();
        g gVar = i.b;
        Object[] objArr = {b11, b13};
        o.a(2, objArr);
        return i.r(2, objArr);
    }
}
