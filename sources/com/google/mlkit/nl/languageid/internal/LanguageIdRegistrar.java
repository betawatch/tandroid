package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import db.e;
import g7.i9;
import g7.k9;
import g7.m9;
import java.util.List;
import ug.b;
import z8.a;
import z8.i;
import za.d;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(e.class);
        a2.a(i.a(Context.class));
        a2.a(new i(2, 0, cb.a.class));
        a2.f = db.b.b;
        a b10 = a2.b();
        b a3 = a.a(db.a.class);
        a3.a(i.a(e.class));
        a3.a(i.a(d.class));
        a3.f = db.b.c;
        Object[] objArr = {b10, a3.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            i9 i9Var = k9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.k(i10, "at index "));
            }
        }
        i9 i9Var2 = k9.b;
        return new m9(2, objArr);
    }
}
