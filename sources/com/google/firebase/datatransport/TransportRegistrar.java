package com.google.firebase.datatransport;

import android.content.Context;
import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.t;
import r9.b;
import r9.j;
import w7.x8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        t.b((Context) bVar.a(Context.class));
        return t.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        m0 a2 = r9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new fh.b(16);
        return Arrays.asList(a2.b(), x8.a(LIBRARY_NAME, "18.1.8"));
    }
}
