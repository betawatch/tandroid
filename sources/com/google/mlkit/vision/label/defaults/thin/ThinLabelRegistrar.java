package com.google.mlkit.vision.label.defaults.thin;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        wq2 b = xq2.b(nvd.class);
        b.a(if3.b(cg7.class));
        b.f = k1f.r;
        xq2 b2 = b.b();
        wq2 b3 = xq2.b(mpd.class);
        b3.a(if3.b(nvd.class));
        b3.a(if3.b(f64.class));
        b3.f = q7f.s;
        xq2 b4 = b3.b();
        wq2 b5 = xq2.b(ki7.class);
        b5.e = true;
        b5.a(new if3(1, 1, mpd.class));
        b5.f = fgf.s;
        xq2 b6 = b5.b();
        eed eedVar = ped.f;
        Object[] objArr = {b2, b4, b6};
        r2f.a(3, objArr);
        return new ihd(3, objArr);
    }
}
