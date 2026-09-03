package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import c9.a;
import c9.b;
import c9.m;
import cb.d;
import com.google.firebase.components.ComponentRegistrar;
import gb.e;
import j7.j9;
import j7.l9;
import j7.n9;
import java.util.List;
import kf.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(e.class);
        b10.a(m.b(Context.class));
        b10.a(new m(2, 0, fb.a.class));
        b10.g = gb.b.b;
        b b11 = b10.b();
        a b12 = b.b(gb.a.class);
        b12.a(m.b(e.class));
        b12.a(m.b(d.class));
        b12.g = gb.b.c;
        Object[] objArr = {b11, b12.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            j9 j9Var = l9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(k0.j(i10, "at index "));
            }
        }
        j9 j9Var2 = l9.b;
        return new n9(2, objArr);
    }
}
