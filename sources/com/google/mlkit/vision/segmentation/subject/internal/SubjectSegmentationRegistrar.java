package com.google.mlkit.vision.segmentation.subject.internal;

import a8.x7;
import ac.b;
import ac.c;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import pb.d;
import pb.g;
import u9.a;
import u9.i;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(c.class);
        a10.a(i.a(g.class));
        a10.f = ac.a.b;
        a b10 = a10.b();
        j0 a11 = a.a(b.class);
        a11.a(i.a(c.class));
        a11.a(i.a(d.class));
        a11.f = ac.a.c;
        a b11 = a11.b();
        c8.g gVar = c8.i.b;
        Object[] objArr = {b10, b11};
        x7.a(2, objArr);
        return c8.i.m(2, objArr);
    }
}
