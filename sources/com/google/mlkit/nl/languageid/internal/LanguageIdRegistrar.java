package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        wq2 b = xq2.b(g8e.class);
        b.a(if3.b(Context.class));
        b.a(new if3(2, 0, w5d.class));
        b.f = k4f.e;
        xq2 b2 = b.b();
        wq2 b3 = xq2.b(cz5.class);
        b3.a(if3.b(g8e.class));
        b3.a(if3.b(f64.class));
        b3.f = dhf.f;
        Object[] objArr = {b2, b3.b()};
        for (int i = 0; i < 2; i++) {
            tef tefVar = khf.f;
            if (objArr[i] == null) {
                gxc.d(hg9.j(i, "at index "));
                return null;
            }
        }
        tef tefVar2 = khf.f;
        return new tjf(2, objArr);
    }
}
