package com.google.mlkit.vision.segmentation.subject.internal;

import a8.x7;
import ac.b;
import ac.c;
import c8.i;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import pb.d;
import pb.g;
import u9.a;
import u9.j;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(c.class);
        a10.a(j.a(g.class));
        a10.f = ac.a.b;
        a b10 = a10.b();
        j0 a11 = a.a(b.class);
        a11.a(j.a(c.class));
        a11.a(j.a(d.class));
        a11.f = ac.a.c;
        a b11 = a11.b();
        c8.g gVar = i.b;
        Object[] objArr = {b10, b11};
        x7.a(2, objArr);
        return i.m(2, objArr);
    }
}
