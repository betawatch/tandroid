package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        lp2 b = mp2.b(d6e.class);
        b.a(wd3.b(Context.class));
        b.a(new wd3(2, 0, u3d.class));
        b.f = i2f.e;
        mp2 b2 = b.b();
        lp2 b3 = mp2.b(cx5.class);
        b3.a(wd3.b(d6e.class));
        b3.a(wd3.b(u44.class));
        b3.f = cff.f;
        Object[] objArr = {b2, b3.b()};
        for (int i = 0; i < 2; i++) {
            scf scfVar = jff.f;
            if (objArr[i] == null) {
                fvc.f(de9.k(i, "at index "));
                return null;
            }
        }
        scf scfVar2 = jff.f;
        return new shf(2, objArr);
    }
}
