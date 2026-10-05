package com.google.firebase.datatransport;

import android.content.Context;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.t;
import q9.b;
import q9.j;
import w7.q8;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        a2.f = new ga.a(0);
        return Arrays.asList(a2.b(), q8.a(LIBRARY_NAME, "18.1.8"));
    }
}
