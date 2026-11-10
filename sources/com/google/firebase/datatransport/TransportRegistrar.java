package com.google.firebase.datatransport;

import a8.h8;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import hi.x3;
import java.util.Arrays;
import java.util.List;
import l5.f;
import m5.a;
import o5.s;
import u9.b;
import u9.j;
import u9.r;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(f.class);
        a10.d = LIBRARY_NAME;
        a10.a(j.a(Context.class));
        a10.f = new x3(22);
        u9.a b10 = a10.b();
        j0 b11 = u9.a.b(new r(la.a.class, f.class));
        b11.a(j.a(Context.class));
        b11.f = new x3(23);
        u9.a b12 = b11.b();
        j0 b13 = u9.a.b(new r(la.b.class, f.class));
        b13.a(j.a(Context.class));
        b13.f = new x3(24);
        return Arrays.asList(b10, b12, b13.b(), h8.a(LIBRARY_NAME, "19.0.0"));
    }
}
