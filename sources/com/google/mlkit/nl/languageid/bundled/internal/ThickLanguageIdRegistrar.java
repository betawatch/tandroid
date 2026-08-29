package com.google.mlkit.nl.languageid.bundled.internal;

import a9.a;
import a9.b;
import com.google.firebase.components.ComponentRegistrar;
import f7.v;
import g7.d;
import g7.e;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ThickLanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(db.a.class);
        b10.b = 1;
        b10.g = new v(5);
        b b11 = b10.b();
        g7.b bVar = d.b;
        return new e(1, new Object[]{b11});
    }
}
