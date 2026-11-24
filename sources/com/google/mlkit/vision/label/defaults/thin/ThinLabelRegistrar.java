package com.google.mlkit.vision.label.defaults.thin;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        lp2 b = mp2.b(ktd.class);
        b.a(wd3.b(ae7.class));
        b.f = ize.r;
        mp2 b2 = b.b();
        lp2 b3 = mp2.b(jnd.class);
        b3.a(wd3.b(ktd.class));
        b3.a(wd3.b(u44.class));
        b3.f = o5f.s;
        mp2 b4 = b3.b();
        lp2 b5 = mp2.b(hg7.class);
        b5.e = true;
        b5.a(new wd3(1, 1, jnd.class));
        b5.f = eef.s;
        mp2 b6 = b5.b();
        ccd ccdVar = ncd.f;
        Object[] objArr = {b2, b4, b6};
        p0f.a(3, objArr);
        return new hfd(3, objArr);
    }
}
