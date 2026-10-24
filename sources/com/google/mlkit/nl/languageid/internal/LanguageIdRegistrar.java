package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import i2.o1;
import java.util.List;
import r9.a;
import r9.j;
import rb.d;
import v7.f9;
import v7.h9;
import v7.j9;
import vb.b;
import vb.e;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        m0 a2 = a.a(e.class);
        a2.a(j.a(Context.class));
        a2.a(new j(2, 0, ub.a.class));
        a2.f = b.b;
        a b10 = a2.b();
        m0 a10 = a.a(vb.a.class);
        a10.a(j.a(e.class));
        a10.a(j.a(d.class));
        a10.f = b.c;
        Object[] objArr = {b10, a10.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            f9 f9Var = h9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(o1.k(i10, "at index "));
            }
        }
        f9 f9Var2 = h9.b;
        return new j9(2, objArr);
    }
}
