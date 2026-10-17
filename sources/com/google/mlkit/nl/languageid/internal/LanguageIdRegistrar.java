package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import r9.a;
import r9.j;
import rb.d;
import v7.f9;
import v7.h9;
import v7.j9;
import vb.b;
import vb.e;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                throw new NullPointerException(i0.a.j(i10, "at index "));
            }
        }
        f9 f9Var2 = h9.b;
        return new j9(2, objArr);
    }
}
