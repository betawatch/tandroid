package com.google.firebase.datatransport;

import android.content.Context;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import di.w9;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.s;
import q9.b;
import q9.j;
import w7.o8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new w9(29);
        return Arrays.asList(a2.b(), o8.a(LIBRARY_NAME, "18.1.8"));
    }
}
