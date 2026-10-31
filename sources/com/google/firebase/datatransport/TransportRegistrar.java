package com.google.firebase.datatransport;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.s;
import r9.b;
import r9.j;
import w7.v9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.b(Context.class));
        return s.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new c(11);
        return Arrays.asList(a2.b(), v9.a(LIBRARY_NAME, "18.1.8"));
    }
}
