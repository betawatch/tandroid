package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import jg.g;
import pb.d;
import tb.b;
import tb.e;
import u9.a;
import u9.j;
import y7.j9;
import y7.l9;
import y7.n9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(e.class);
        a10.a(j.a(Context.class));
        a10.a(new j(2, 0, sb.a.class));
        a10.f = b.b;
        a b10 = a10.b();
        j0 a11 = a.a(tb.a.class);
        a11.a(j.a(e.class));
        a11.a(j.a(d.class));
        a11.f = b.c;
        Object[] objArr = {b10, a11.b()};
        for (int i7 = 0; i7 < 2; i7++) {
            j9 j9Var = l9.b;
            if (objArr[i7] == null) {
                throw new NullPointerException(g.j(i7, "at index "));
            }
        }
        j9 j9Var2 = l9.b;
        return new n9(2, objArr);
    }
}
