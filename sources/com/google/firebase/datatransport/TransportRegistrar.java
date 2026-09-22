package com.google.firebase.datatransport;

import android.content.Context;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.t;
import q9.b;
import q9.j;
import w7.o8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        t.b((Context) bVar.a(Context.class));
        return t.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new c(29);
        return Arrays.asList(a2.b(), o8.a(LIBRARY_NAME, "18.1.8"));
    }
}
