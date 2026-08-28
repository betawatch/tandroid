package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import cb.e;
import com.google.firebase.components.ComponentRegistrar;
import f7.j9;
import f7.l9;
import f7.n9;
import j3.r0;
import java.util.List;
import tg.b;
import y8.a;
import y8.j;
import ya.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(e.class);
        a2.a(j.a(Context.class));
        a2.a(new j(2, 0, bb.a.class));
        a2.f = cb.b.b;
        a b10 = a2.b();
        b a3 = a.a(cb.a.class);
        a3.a(j.a(e.class));
        a3.a(j.a(d.class));
        a3.f = cb.b.c;
        Object[] objArr = {b10, a3.b()};
        for (int i9 = 0; i9 < 2; i9++) {
            j9 j9Var = l9.b;
            if (objArr[i9] == null) {
                throw new NullPointerException(r0.l(i9, "at index "));
            }
        }
        j9 j9Var2 = l9.b;
        return new n9(2, objArr);
    }
}
