package com.google.firebase.datatransport;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import j5.f;
import java.util.Arrays;
import java.util.List;
import k5.a;
import m5.t;
import s9.b;
import s9.k;
import w7.p5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        t.b((Context) bVar.a(Context.class));
        return t.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s9.a> getComponents() {
        n0 a2 = s9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(k.a(Context.class));
        a2.f = new gh.a(28);
        return Arrays.asList(a2.b(), p5.a(LIBRARY_NAME, "18.1.8"));
    }
}
