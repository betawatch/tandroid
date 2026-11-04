package com.google.firebase.datatransport;

import android.content.Context;
import b8.r1;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import ii.y3;
import java.util.Arrays;
import java.util.List;
import k5.f;
import l5.a;
import n5.s;
import t9.b;
import t9.j;
import t9.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public List<t9.a> getComponents() {
        l0 a10 = t9.a.a(f.class);
        a10.d = LIBRARY_NAME;
        a10.a(j.a(Context.class));
        a10.f = new y3(10);
        t9.a b10 = a10.b();
        l0 b11 = t9.a.b(new r(ka.a.class, f.class));
        b11.a(j.a(Context.class));
        b11.f = new y3(11);
        t9.a b12 = b11.b();
        l0 b13 = t9.a.b(new r(ka.b.class, f.class));
        b13.a(j.a(Context.class));
        b13.f = new y3(12);
        return Arrays.asList(b10, b12, b13.b(), r1.a(LIBRARY_NAME, "19.0.0"));
    }
}
