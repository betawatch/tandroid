package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import c9.a;
import c9.b;
import c9.l;
import cb.d;
import com.google.firebase.components.ComponentRegistrar;
import gb.e;
import j7.j9;
import j7.l9;
import j7.n9;
import java.util.List;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(e.class);
        b10.a(l.b(Context.class));
        b10.a(new l(2, 0, fb.a.class));
        b10.g = gb.b.b;
        b b11 = b10.b();
        a b12 = b.b(gb.a.class);
        b12.a(l.b(e.class));
        b12.a(l.b(d.class));
        b12.g = gb.b.c;
        Object[] objArr = {b11, b12.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            j9 j9Var = l9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(a2.j(i10, "at index "));
            }
        }
        j9 j9Var2 = l9.b;
        return new n9(2, objArr);
    }
}
