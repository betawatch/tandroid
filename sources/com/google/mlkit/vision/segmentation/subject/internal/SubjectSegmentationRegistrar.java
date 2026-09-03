package com.google.mlkit.vision.segmentation.subject.internal;

import c9.a;
import c9.b;
import c9.m;
import cb.d;
import cb.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import k7.b0;
import n7.g;
import n7.i;
import nb.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(c.class);
        b10.a(m.b(h.class));
        b10.g = nb.a.b;
        b b11 = b10.b();
        a b12 = b.b(nb.b.class);
        b12.a(m.b(c.class));
        b12.a(m.b(d.class));
        b12.g = nb.a.c;
        b b13 = b12.b();
        g gVar = i.b;
        Object[] objArr = {b11, b13};
        b0.a(2, objArr);
        return i.r(2, objArr);
    }
}
