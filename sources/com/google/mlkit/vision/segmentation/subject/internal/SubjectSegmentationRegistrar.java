package com.google.mlkit.vision.segmentation.subject.internal;

import b2.m0;
import cc.b;
import cc.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import r9.a;
import r9.j;
import rb.d;
import rb.g;
import w7.f9;
import z7.i;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        m0 a2 = a.a(c.class);
        a2.a(j.a(g.class));
        a2.f = cc.a.b;
        a b10 = a2.b();
        m0 a10 = a.a(b.class);
        a10.a(j.a(c.class));
        a10.a(j.a(d.class));
        a10.f = cc.a.c;
        a b11 = a10.b();
        z7.g gVar = i.b;
        Object[] objArr = {b10, b11};
        f9.a(2, objArr);
        return i.q(2, objArr);
    }
}
