package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(tae.class);
        b.a(qe3.b(Context.class));
        b.a(new qe3(2, 0, l8d.class));
        b.f = z6f.e;
        fq2 b2 = b.b();
        eq2 b3 = fq2.b(hz5.class);
        b3.a(qe3.b(tae.class));
        b3.a(qe3.b(q54.class));
        b3.f = sjf.f;
        Object[] objArr = {b2, b3.b()};
        for (int i = 0; i < 2; i++) {
            ihf ihfVar = zjf.f;
            if (objArr[i] == null) {
                p3d.h(uh9.k(i, "at index "));
                return null;
            }
        }
        ihf ihfVar2 = zjf.f;
        return new imf(2, objArr);
    }
}
