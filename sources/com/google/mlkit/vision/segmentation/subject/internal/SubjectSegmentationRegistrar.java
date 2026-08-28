package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.firebase.components.ComponentRegistrar;
import f7.v8;
import j7.i;
import java.util.List;
import jb.c;
import tg.b;
import y8.a;
import y8.j;
import ya.d;
import ya.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(c.class);
        a2.a(j.a(g.class));
        a2.f = jb.a.b;
        a b10 = a2.b();
        b a3 = a.a(jb.b.class);
        a3.a(j.a(c.class));
        a3.a(j.a(d.class));
        a3.f = jb.a.c;
        a b11 = a3.b();
        j7.g gVar = i.b;
        Object[] objArr = {b10, b11};
        v8.a(2, objArr);
        return i.r(2, objArr);
    }
}
