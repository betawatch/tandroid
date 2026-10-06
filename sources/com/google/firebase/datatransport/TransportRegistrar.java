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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
