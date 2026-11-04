package com.google.mlkit.vision.segmentation.subject.internal;

import b8.k1;
import b8.l;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.List;
import mb.d;
import mb.g;
import t9.a;
import t9.j;
import xb.b;
import xb.c;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        l0 a10 = a.a(c.class);
        a10.a(j.a(g.class));
        a10.f = xb.a.b;
        a b10 = a10.b();
        l0 a11 = a.a(b.class);
        a11.a(j.a(c.class));
        a11.a(j.a(d.class));
        a11.f = xb.a.c;
        a b11 = a11.b();
        b8.j jVar = l.b;
        Object[] objArr = {b10, b11};
        k1.a(2, objArr);
        return l.m(2, objArr);
    }
}
