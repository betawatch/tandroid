package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import s9.a;
import s9.k;
import sb.d;
import w7.i9;
import w7.k9;
import w7.m9;
import wb.b;
import wb.e;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(e.class);
        a2.a(k.a(Context.class));
        a2.a(new k(2, 0, vb.a.class));
        a2.f = b.b;
        a b10 = a2.b();
        n0 a10 = a.a(wb.a.class);
        a10.a(k.a(e.class));
        a10.a(k.a(d.class));
        a10.f = b.c;
        Object[] objArr = {b10, a10.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            i9 i9Var = k9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(ic.a.i(i10, "at index "));
            }
        }
        i9 i9Var2 = k9.b;
        return new m9(2, objArr);
    }
}
