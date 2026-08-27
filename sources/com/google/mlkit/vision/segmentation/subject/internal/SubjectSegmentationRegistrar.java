package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.firebase.components.ComponentRegistrar;
import g7.v8;
import java.util.List;
import kb.c;
import ug.b;
import z8.a;
import z8.i;
import za.d;
import za.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(c.class);
        a2.a(i.a(g.class));
        a2.f = kb.a.b;
        a b10 = a2.b();
        b a3 = a.a(kb.b.class);
        a3.a(i.a(c.class));
        a3.a(i.a(d.class));
        a3.f = kb.a.c;
        a b11 = a3.b();
        k7.g gVar = k7.i.b;
        Object[] objArr = {b10, b11};
        v8.a(2, objArr);
        return k7.i.r(2, objArr);
    }
}
