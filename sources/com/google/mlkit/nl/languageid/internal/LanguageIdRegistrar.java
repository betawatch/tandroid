package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import i5.c;
import java.util.List;
import pb.d;
import tb.b;
import tb.e;
import u9.a;
import u9.i;
import y7.i9;
import y7.k9;
import y7.m9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(e.class);
        a10.a(i.a(Context.class));
        a10.a(new i(2, 0, sb.a.class));
        a10.f = b.b;
        a b10 = a10.b();
        j0 a11 = a.a(tb.a.class);
        a11.a(i.a(e.class));
        a11.a(i.a(d.class));
        a11.f = b.c;
        Object[] objArr = {b10, a11.b()};
        for (int i7 = 0; i7 < 2; i7++) {
            i9 i9Var = k9.b;
            if (objArr[i7] == null) {
                throw new NullPointerException(c.i(i7, "at index "));
            }
        }
        i9 i9Var2 = k9.b;
        return new m9(2, objArr);
    }
}
