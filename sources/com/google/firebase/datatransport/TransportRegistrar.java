package com.google.firebase.datatransport;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import fi.c2;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.s;
import r9.b;
import r9.j;
import w7.w8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new c2(14);
        return Arrays.asList(a2.b(), w8.a(LIBRARY_NAME, "18.1.8"));
    }
}
