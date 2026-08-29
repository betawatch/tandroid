package com.google.mlkit.nl.languageid.internal;

import a9.a;
import a9.b;
import a9.m;
import ab.d;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import eb.e;
import h7.h9;
import h7.j9;
import h7.l9;
import j7.l1;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(e.class);
        b10.a(m.b(Context.class));
        b10.a(new m(2, 0, db.a.class));
        b10.g = eb.b.b;
        b b11 = b10.b();
        a b12 = b.b(eb.a.class);
        b12.a(m.b(e.class));
        b12.a(m.b(d.class));
        b12.g = eb.b.c;
        Object[] objArr = {b11, b12.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            h9 h9Var = j9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(l1.k(i10, "at index "));
            }
        }
        h9 h9Var2 = j9.b;
        return new l9(2, objArr);
    }
}
