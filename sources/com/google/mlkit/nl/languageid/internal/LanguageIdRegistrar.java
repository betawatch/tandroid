package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import s9.a;
import s9.j;
import sb.d;
import w7.i9;
import w7.k9;
import w7.m9;
import wb.b;
import wb.e;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(e.class);
        a2.a(j.a(Context.class));
        a2.a(new j(2, 0, vb.a.class));
        a2.f = b.b;
        a b10 = a2.b();
        n0 a10 = a.a(wb.a.class);
        a10.a(j.a(e.class));
        a10.a(j.a(d.class));
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
