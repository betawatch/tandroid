package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
